import java.util.HashMap;
public class anagramic {
    
    public static void main(String[] args) {
        String s1="abbcaad";
        String s2="babacda";
        HashMap<Character,Integer> map= new HashMap<>();
      
        
        for(int i=0;i<s1.length();i++){
            char ch =s1.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0) +1);
        }
        
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            
            if(map.containsKey(ch)==false){
               System.out.println("false");
            }else if(map.get(ch) == 1){
                map.remove(ch);
            }else{
                map.put(ch,map.get(ch)-1);
            }
        }
        if(map.size()==0){
           System.out.println("true");
        }
        
    }
    
}

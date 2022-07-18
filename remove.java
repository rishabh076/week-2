import java.util.HashSet;


public class remove {
    public static void main(String[] args) {
        String str="abcabcbb";
        HashSet<Character> seen=new HashSet<>();
        int left=0,right=0;
        int max=0;
        while(right<str.length()){
            char c=str.charAt(right);
            if(seen.add(c)){
            max=Math.max(right-left+1, max);
            right++;
            }
            else{
                while(str.charAt(left)!=c){
                    seen.remove(str.charAt(left));
                    left++;
                }
                seen.remove(str.charAt(left));
            }

        }
            System.out.println("your size of string is "+max);
        
    }
    
}

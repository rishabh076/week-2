import java.util.HashSet;

public class intesection {
    public static void main(String[] args) {
        int a[]={2,10,15,5,10};
        int b[]={15,5,5,10,4};
       
       
       HashSet<Integer> set= new HashSet<>();
       HashSet<Integer> ans= new HashSet<>();
       for(int x:a){
        set.add(x);
       }
       for(int x:b){
        if(set.contains(x)){
            ans.add(x);
            
            
            set.remove(x);

        }
       }

       System.out.println(ans);
    }
    
}

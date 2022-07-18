import java.util.HashSet;



public class set {
    public static void main(String[] args) {
        int a[]={5,10,5,4,5,10};
        HashSet<Integer> set =new HashSet<>();
        for(int element :a){
            set.add(element);
        }
        System.out.println(set.size());

    }
    
}

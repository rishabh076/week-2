import java.util.HashMap;

public class subarray {
    public static void main(String[] args) {
        int a[]={10,15,-5,15,-10,5};
        int sum=10;
        int n=a.length;
        int currSum=0;
        int start=0,end=-1;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            currSum+=a[i];
            if(currSum-sum==0){
                start=0;end=i;
                break;
            }
            if(map.containsKey(currSum-sum)){
                start=map.get((currSum-sum)+1);
                end=i;
                break;
            }
            map.put(currSum, i);

        }
        if(end==-1){
            System.out.println("your sum not found");
        }else{
            System.out.println(start+","+end);
        }
    }
    
}

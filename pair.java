import java.util.HashMap;

public class pair {
    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        int n=arr.length;
        int k=2;
        int ans=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsValue(k-arr[i])){

                ans+=map.get(k-arr[i]);  
        }
        if(map.get(arr[i])==null){
           map.put(arr[i], 0);
        }
        map.put(arr[i], map.get(arr[i])+1);
      
    
    }
    System.out.println(ans);

    }
}



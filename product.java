public class product {
    public static void main(String[] args) {
        int arr[]={2,3,-2,4};
        int ans=arr[0];
        int max=ans;
        int min=ans;
        int n=arr.length;

        for(int i=1;i<n;i++){
            if(arr[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(arr[i], max*arr[i]);
            min=Math.min(arr[i], min*arr[i]);
            ans =Math.max(ans, max);

        }
        System.out.println(ans);

        
     
    
    
   }
}

public class sliding {
    public static void main(String[] args) {
        int k=4;
        int sum=0;
        int i=0,j=0;
        int max=0;
        
        int arr[]={2,5,1,8,2,9,1};
        while(j<arr.length){
            sum+=arr[j];
            if(j-i+1<k){
               j++;
            }else if(j-i+1==k){
                max=Math.max(max, sum);
                sum=sum-arr[i];
                i++;j++;
               
            }

            
        
           
            
        }
        System.out.println(max);
        
       

    }
    
}

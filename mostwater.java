public class mostwater {
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        int water=0;
        int left=0,right=arr.length-1;
        while(left<right){
            water=Math.max(water,Math.min(arr[left],arr[right])*(right-left));
            if(arr[left]>arr[right]){
                right--;
            }
            else{
                left++;
            }
        }
        System.out.println("your maximum water store is " +water + " sq unit");

    }
    
}

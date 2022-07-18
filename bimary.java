public class bimary {
    public static void main(String[] args) {
        int arr[]={20,17,15,14,13,12,10,9,8,4};
        int start=0;
        int end=arr.length-1;
        int elm=10;
        while(start<=end){
            int mid=(start+end)/2;
            if(elm==arr[mid]){
                System.out.println("your index"+mid);

            }else if(elm<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
    }
    
}

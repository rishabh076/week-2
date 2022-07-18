public class sortedarray {
    public static void main(String[] args) {
        int arr[]={4,2,5,6,8,11,12,15};
        int start=0;
        int end=arr.length-1;
        int n=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if(arr[mid]<=arr[next] && arr[mid]>=arr[prev]){
                System.out.println(mid+"times");
            }
            if(arr[start]<=arr[mid]){
                start=mid+1;

            }else if(arr[mid]<=arr[end]){
                end=mid-1;
            }
        }
    }
    
}

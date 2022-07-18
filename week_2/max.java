class max{
    public static void main(String[] args) {
        int arr[]={2,5,1,6,3,4};
        int max=arr[1];
        int min=arr[0];
        int n= arr.length;
        if(n==1){
            max=arr[0];
            min=arr[0];

        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("your max is "+ max);
        System.out.println("Your min is "+ min);
        
    }
}
 
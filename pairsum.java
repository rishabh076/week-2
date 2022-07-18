public class pairsum {
    public static void main(String[] args) {
        int  arr[]={11,15,6,8,9,10};
        int x=16;
        int n =arr.length;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                break;
            }
        
            int l=(i+1)%n;
            int r=i;
            while(l!=r){
                if(arr[l]+arr[r]==x){
                    System.out.println("your sum  is present at index :"+l +r);
                }
                if(arr[l]+arr[r]<x){
                    l=(l+1)%n;
                }else{
                    r=(n+r-1)%n;
                }
            }
            System.out.print("your sum"+l+r);

        }
        System.out.println();
        
    }
    
}

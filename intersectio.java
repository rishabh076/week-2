

public class intersectio {
    public static void main(String[] args) {
        int arr1[]={1,5,10,20,40,80};
        int arr2[]={6,7,20,80,100};
        int arr3[]={3,4,15,20,30,70,80,120};
        int n1=arr1.length;
        int n2=arr2.length;
        int n3=arr3.length;
        int i=0,j=0,k=0;
        while(i<n1 &&j<n2 &&k<n3){
            if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                System.out.println("Your element"+arr1[i]);
                i++;
                j++;
                k++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr3[k]){
                j++;

            }else{
                k++;
            }
        }
    }
    
}

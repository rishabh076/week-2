
public class Char {
    public static void main(String[] args) {
        int  a[]={3,1,8,2,9,3,6,7};

        int n=a.length;
        int max=a[0];
        int min=a[0];
        

        for(int i=1;i<n;i++){
            int cmax=Math.max(a[i], a[i-1]);
            max= Math.max(max, cmax);
            int cmin=Math.min(a[i], a[i-1]);
            min=Math.min(min, cmin);


        }
        System.out.println("your max is : " +max);
        System.out.println("Your min is : " +min);
    }

}

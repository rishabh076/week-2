

public class min {
    public static void main(String[] args) {
        
        int nums[]={3,4,5,1,2};
        int ans=1;
        int low=0,high=nums.length-1;
        if(nums[low]<nums[high]){
            System.out.println(nums[low]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[0]<nums[mid]){
                low=mid+1;
            }
            else{
                 ans=Math.min(ans, nums[mid]);
            }
        }
        System.out.println(ans);
       
    }
    
}

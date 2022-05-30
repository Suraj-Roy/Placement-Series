class Solution {
    public void reverse(int[] arr,int start,int end){
        int temp;
        
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    
    
    public void rotate(int[] nums, int k) {
        
        
        if(k%nums.length==0) return ;
        
        k=nums.length-k%nums.length;
 
        
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        reverse(nums,0,nums.length-1);
        
    }
}

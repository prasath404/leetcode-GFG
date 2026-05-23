class Solution {
    public int longestMountain(int[] arr) {
        int ret = 0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                int l = i;
                int r = i;
                while(l>0 && arr[l]>arr[l-1]){
                    l=l-1;
                }
                while(r<arr.length-1 && arr[r]>arr[r+1]){
                    r=r+1;
                }
                ret = Math.max(ret,r-l+1);
            }
        }
        return ret;
    }
}
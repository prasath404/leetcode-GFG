class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> mat = new ArrayList<>();
        int diff = 0;
        int mini = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            diff=arr[i]-arr[i-1];
            if(mini>diff){
                mini=diff;
            }   
        }
        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1]==mini){
                mat.add(List.of(arr[i-1],arr[i]));
            }
        }
        return mat;
    }
}
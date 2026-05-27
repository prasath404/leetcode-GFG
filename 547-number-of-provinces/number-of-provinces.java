class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(visited[i]!=true){
                count = count + 1 ;
                dfs(i,isConnected,visited);
            }
        }
        return count;
    }
    static void dfs(int node,int[][] isConnected, boolean[] visited){
        visited[node]=true;
        for(int neighbor=0;neighbor<isConnected.length;neighbor++){
            if(isConnected[node][neighbor]==1 && !visited[neighbor]){
                visited[neighbor]=true;
                dfs(neighbor,isConnected,visited);
            }
        }

    }
}
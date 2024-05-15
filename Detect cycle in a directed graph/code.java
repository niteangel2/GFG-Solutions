class Solution {
    public boolean dfs( ArrayList<ArrayList<Integer>> adj,int[] vis, int[] path,int node) {
        vis[node] = 1;
        path[node] = 1;
        for(int it : adj.get(node)) {
            if(vis[it] == 0) {
                if(dfs(adj,vis,path,it) == true) return true;
            }
            else if(vis[it] == 1 && path[it] == 1) return true;
        }
        path[node] = 0;
        return false;
    }
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int[] vis = new int[V];
        int[] pathvis = new int[V];
        for(int i = 0;i < V;i ++) {
            if(vis[i] == 0) {
                if(dfs(adj,vis,pathvis,i) == true) return true;
            }
        }
        return false;
    }
}

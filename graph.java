import java.util.*;

public class graph {
    static void BFS(int s, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }

    static void DFS(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                DFS(neighbor, adj, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter the number of edges: ");
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter the edges (u v):");
        for (int i = 0; i < E; i++) {
            System.out.print("Enter edge " + (i + 1) + " (u v): ");
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visitedBFS = new boolean[V];
        System.out.print("\nEnter the starting node for BFS: ");
        int startBFS = sc.nextInt();
        System.out.print("BFS traversal: ");
        BFS(startBFS, adj, visitedBFS);

        boolean[] visitedDFS = new boolean[V];
        System.out.print("\n\nEnter the starting node for DFS: ");
        int startDFS = sc.nextInt();
        System.out.print("DFS traversal: ");
        DFS(startDFS, adj, visitedDFS);
        System.out.println();

        sc.close();
    }
}
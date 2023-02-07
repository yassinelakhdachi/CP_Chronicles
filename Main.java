import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static void bfs(int start) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(start, 0));
        visited[start] = true;

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int x = p.x, depth = p.y;

            for (int i = 0; i < graph[x].size(); i++) {
                int y = graph[x].get(i);
                if (!visited[y]) {
                    visited[y] = true;
                    q.offer(new Pair(y, depth + 1));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            graph[x].add(y);
            graph[y].add(x);
        }

        int components = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                components++;
                bfs(i);
            }
        }

        System.out.println(components - 1);
    }
}
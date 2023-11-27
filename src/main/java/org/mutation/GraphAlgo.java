package org.mutation;

import java.util.*;

public class GraphAlgo {

    public Map<Integer, List<Edge>> adjList = new HashMap<>();
    public Map<Integer, Boolean> visitedNodes = new HashMap<>();
    public Map<Integer, Integer> shortestDistances = new HashMap<>();

    public static class Edge {
        public int dest;
       public int weight;

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    public void addEdge(int src, int dest, int weight) {
        adjList.computeIfAbsent(src, k -> new ArrayList<>()).add(new Edge(dest, weight));
    }

    public void dfs(int node) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                visitedNodes.put(current, true);

                for (Edge e : adjList.getOrDefault(current, Collections.emptyList())) {
                    stack.push(e.dest);
                }
            }
        }
    }

    public void bfs(int node) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (!visitedNodes.containsKey(current)) {
                visitedNodes.put(current, true);

                for (Edge e : adjList.getOrDefault(current, Collections.emptyList())) {
                    queue.offer(e.dest);
                }
            }
        }
    }

    public void dijkstra(int source) {
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        pq.offer(new Edge(source, 0));
        shortestDistances.put(source, 0); // Set the distance for the source node

        while (!pq.isEmpty()) {
            Edge edge = pq.poll();
            int current = edge.dest;
            int currentWeight = edge.weight;

            if (shortestDistances.get(current) < currentWeight) {
                continue;
            }

            for (Edge e : adjList.getOrDefault(current, Collections.emptyList())) {
                int newDistance = currentWeight + e.weight;
                if (!shortestDistances.containsKey(e.dest) || newDistance < shortestDistances.get(e.dest)) {
                    shortestDistances.put(e.dest, newDistance);
                    pq.offer(new Edge(e.dest, newDistance));
                }
            }
        }
    }

    // Method to retrieve visited nodes for DFS
    public Set<Integer> getVisitedNodesForDFS() {
        return visitedNodes.keySet();
    }

}

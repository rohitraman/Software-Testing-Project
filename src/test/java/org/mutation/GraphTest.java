package org.mutation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

public class GraphTest {
    private GraphAlgo graph;

    @BeforeEach
    public void setUp() {
        graph = new GraphAlgo();
        // Set up your graph structure here if needed
    }

    @Test
    public void testAddEdgePositiveWeight() {
        graph.addEdge(1, 2, 5);
        Assertions.assertTrue(graph.adjList.containsKey(1) && graph.adjList.get(1).stream().anyMatch(e -> e.dest == 2 && e.weight == 5));
    }

    @Test
    public void testAddMultipleEdges() {
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 3);
        Assertions.assertEquals(3, graph.adjList.get(1).size());
    }



    @Test
    public void testDFSonSimpleGraph() {
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 8);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 4);

        graph.dfs(1);
        Set<Integer> visitedNodes = graph.getVisitedNodesForDFS();
        Set<Integer> expectedVisited = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Assertions.assertEquals(expectedVisited, visitedNodes);
    }

    @Test
    public void testDFSonGraphWithCycles() {
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 8);
        graph.addEdge(3, 1, 3);

        graph.dfs(1);
        Set<Integer> visitedNodes = graph.getVisitedNodesForDFS();
        Set<Integer> expectedVisited = new HashSet<>(Arrays.asList(1, 2, 3));
        Assertions.assertEquals(expectedVisited, visitedNodes);
    }



    @Test
    public void testBFSOnGraph() {
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 8);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 4);

        graph.bfs(1);
        Set<Integer> visitedNodes = graph.visitedNodes.keySet();
        Set<Integer> expectedVisited = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Assertions.assertEquals(expectedVisited, visitedNodes);
    }

    @Test
    public void testDijkistra() {
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 8);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 4);
        graph.dijkstra(1);
        Assertions.assertEquals(graph.shortestDistances.get(2), 5);
    }

    @Test
    public void testRetrieveVisitedNodesAfterDFS() {
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 8);
        graph.addEdge(2, 4, 3);

        graph.dfs(1);
        Set<Integer> visitedNodes = graph.getVisitedNodesForDFS();
        Set<Integer> expectedVisited = new HashSet<>(Arrays.asList(1, 2, 4, 3));
        Assertions.assertEquals(expectedVisited, visitedNodes);
    }
}

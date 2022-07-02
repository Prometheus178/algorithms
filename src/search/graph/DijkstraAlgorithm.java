package search.graph;

import java.util.*;

/**
 * 1. while have not proceeded nodes
 * 2. take node , nearest to start
 * 3. update costs for his neighbors
 * 4. if cost any neighbor was updated, update parents
 * 5. mark node proceeded and do 1.
 * Author: Sergey.
 */
public class DijkstraAlgorithm {

    public static void findMinTimeWay(Map<String, Map<String, Integer>> graph) {
        Map<String, Integer> costs = new HashMap<>();
        costs.put("a", 6);
        costs.put("b", 2);
        costs.put("end", Integer.MAX_VALUE);
        Map<String, String> parents = new HashMap<>();
        parents.put("a", "start");
        parents.put("b", "start");
        List<String> processed = new ArrayList<>();

        String node = findLowestCostNode(costs, processed);
        while (node != null) {
            var cost = costs.get(node);
            Map<String, Integer> neighbors = graph.get(node);
            for (String neighbor : neighbors.keySet()) {
                var newCost = cost + neighbors.get(neighbor);
                if (costs.get(neighbor) > newCost) {
                    costs.put(neighbor, newCost);
                    parents.put(neighbor, node);
                }
            }
            processed.add(node);
            node = findLowestCostNode(costs, processed);
        }
        System.out.println(parents);
    }

    private static String findLowestCostNode(Map<String, Integer> costs,
                                             List<String> processed) {
        Integer lowestCost = Integer.MAX_VALUE;
        String lowestCostNode = null;
        Set<String> keySet = costs.keySet();
        for (String node : keySet) {
            Integer cost = costs.get(node);
            if (cost < lowestCost && !processed.contains(node)) {
                lowestCost = cost;
                lowestCostNode = node;
            }
        }
        return lowestCostNode;
    }
}

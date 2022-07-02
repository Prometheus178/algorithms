package search.graph;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sergey.
 */
public class Demo {

    public static void main(String[] args) {
//        Hashtable<String, String[]> graph = new Hashtable<>();
//        graph.put("you", new String[]{"alice", "bob", "claire"});
//        graph.put("bob", new String[]{"anuj", "peggy"});
//        graph.put("alice", new String[]{"peggy"});
//        graph.put("claire", new String[]{"jonny"});
//        graph.put("anuj", new String[]{});
//        graph.put("peggy", new String[]{});
//        graph.put("jonny", new String[]{"thom"});
//        graph.put("thom", new String[]{});

//        boolean nameEndedAtM = BreadthFirstSearch.findNameEndedAtM(graph);
//        System.out.println(nameEndedAtM);
//        ArrayList<String> checked = new ArrayList<>();
//        DeepFirstSearch.dfs(checked, graph, "you");

        Map<String, Map<String, Integer>> graph = new HashMap<>();
        Map<String, Integer> vertices1 = new HashMap<>();
        vertices1.put("a", 6);
        vertices1.put("b", 2);
        graph.put("start", vertices1);
        Map<String, Integer> vertices2 = new HashMap<>();
        vertices2.put("end", 1);
        graph.put("a", vertices2);
        Map<String, Integer> vertices3 = new HashMap<>();
        vertices3.put("a", 3);
        vertices3.put("end", 5);
        graph.put("b", vertices3);
        graph.put("end", new HashMap<>());
        DijkstraAlgorithm.findMinTimeWay(graph);
    }
}

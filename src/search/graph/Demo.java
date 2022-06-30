package search.graph;

import java.util.Hashtable;

/**
 * Author: Sergey.
 */
public class Demo {

    public static void main(String[] args) {
        Hashtable<String, String[]> graph = new Hashtable<>();
        graph.put("you", new String[]{"alice", "bob", "claire"});
        graph.put("bob", new String[]{"anuj", "peggy"});
        graph.put("alice", new String[]{"peggy"});
        graph.put("claire", new String[]{"jonny"});
        graph.put("anuj", new String[]{});
        graph.put("peggy", new String[]{});
        graph.put("jonny", new String[]{"thom"});
        graph.put("thom", new String[]{});

        boolean nameEndedAtM = BreadthFirstSearch.findNameEndedAtM(graph);
        System.out.println(nameEndedAtM);

    }
}

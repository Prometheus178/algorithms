package search.graph;

import java.util.*;

/**
 * 1. go to neighbor vertices if you have not visited , marked him and put to stack
 * 2. if you can't execute the rule 1 , pop vertices from stack
 * 3. if the rule 1 and 2 can't be vertices , search have done
 * <p>
 * Author: Sergey.
 */
public class DeepFirstSearch {


    public static void dfs(ArrayList<String> checked, Hashtable<String, String[]> graph, String node){
        if (!checked.contains(node)){
            System.out.println(node);
            checked.add(node);
            for (String friend: graph.get(node)) {
                dfs(checked, graph, friend);
            }
        }
    }
}

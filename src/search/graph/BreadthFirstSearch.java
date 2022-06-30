package search.graph;

import java.util.*;

/**
 * Author: Sergey.
 */
public class BreadthFirstSearch {

    public static boolean findNameEndedAtM(Hashtable<String, String[]> graph) {
        Deque<String> searchDeque = new ArrayDeque<>(Arrays.asList(graph.get("you")));
        ArrayList<String> checked = new ArrayList<>();
        while (!searchDeque.isEmpty()) {
            String person = searchDeque.poll();
            if (person.endsWith("m")){
                return true;
            }else {
                if (!checked.contains(person)){
                    String[] strings = graph.get(person);
                    if (strings.length != 0){
                        List<String> friends= Arrays.asList(strings);
                        if (!friends.isEmpty()){
                            searchDeque.addAll(friends);
                        }
                    }

                }
                checked.add(person);
            }
        }
        return false;
    }
}

package medium;

import java.util.*;

public class TreePrinting {
    static class Relation {
        String parent;
        String child;

        Relation(String a, String b) {
            this.parent = a;
            this.child = b;
        }
    }

    public void printTree(List<Relation> rs) {
        Set<String> children = new HashSet<>();
        HashMap<String, List<String>> graph = new HashMap<>();
        List<String> current;

        // generating the graph as like adjacency list
        for (Relation r : rs) {
            children.add(r.child);
            if (graph.containsKey(r.parent)) {
                graph.get(r.parent).add(r.child);
            } else {
                current = new ArrayList<>();
                graph.put(r.parent, current);
                graph.get(r.parent).add(r.child);
            }
        }

        // finding the root
        String root = "";
        for (String r : graph.keySet()) {
            if (!children.contains(r)) {
                root = r;
                break;
            }
        }

        dfs(root, 0, graph);

    }

    public void dfs(String root, int level, Map<String, List<String>> map) {
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }
        System.out.println(root);

        List<String> children = new ArrayList<>();
        if (map.containsKey(root)) {
            children.addAll(map.get(root));
        } else {
            return;
        }

        for (String child : children) {
            dfs(child, level + 1, map);
        }

    }

    public static void main(String[] args) {
        List<Relation> relations = new ArrayList<>();
        relations.add(new Relation("animal", "mammal"));
        relations.add(new Relation("mammal", "goat"));
        relations.add(new Relation("mammal", "cow"));
        relations.add(new Relation("wildlife", "animal"));

        new TreePrinting().printTree(relations);


    }

}
package algorithm.myGraph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * Created by parmeshwor on 1/28/16.
 */
public class DFSForDisconnectedGraph {

    // using adjacency Matrix as input

    static char [] nodeNames ={'A','B','C','D','E','F','G','H','I','J'};
    static int visitedVertexCount = 0;
    static int[][] AdjMatrix = {
            { 0, 1, 1, 0, 0, 1, 0, 0, 0, 0},
            { 1, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            { 1, 0, 0, 0, 0, 1, 1, 0, 0, 0},
            { 0, 0, 0, 0, 1, 0, 0, 0, 1, 0},
            { 0, 0, 0, 1, 0, 0, 0, 0, 1, 0},
            { 1, 1, 1, 0, 0, 0, 0, 1, 0, 0},
            { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
            { 0, 0, 0, 0, 0, 1, 1, 0, 0, 0},
            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    static Map<Character,Boolean> visitedMap = new HashMap<Character,Boolean>();
    static Map<Character,LinkedList<Character>> AdjacencyMap = new HashMap<Character,LinkedList<Character>>();

    public static void main(String[] args) {

        init();
        dfsTraversal();

        // print adjacency list'
		/*for(Map.Entry<Character,LinkedList<Character>> map:AdjacencyMap.entrySet())
		{
			System.out.print(map.getKey()+"  : ");
			System.out.print(map.getValue());
			System.out.println();
		}*/
    }

    private static void dfsTraversal() {

        Stack<Character> stack = new Stack<>();
        while(!isThereUnvisitedVertex()){
            char markedNode = getNextNotVisitedVertex();
            stack.push(markedNode);
            visitedMap.put(markedNode, true);
            System.out.println(markedNode);
            visitedVertexCount++;

            while(!stack.isEmpty())
            {
                char poppedNode = stack.pop();


                for(char adjacentNode : AdjacencyMap.get(poppedNode))
                {
                    if(visitedMap.containsKey(adjacentNode) && (!visitedMap.get(adjacentNode)))
                    {
                        visitedMap.put(adjacentNode, true);
                        visitedVertexCount++;
                        System.out.print(adjacentNode + " ");
                        stack.push(adjacentNode);
                        break;
                    }
                }
            }
        }
    }



    private static boolean isThereUnvisitedVertex(){

        return visitedVertexCount == nodeNames.length;
    }

    private static char getNextNotVisitedVertex(){

        char c=' ';
        for(Map.Entry<Character,Boolean> e : visitedMap.entrySet())
        {
            if(!e.getValue())
            {
                c=e.getKey();
                break;
            }
        }
        return c;
    }

    private static void init() {

        // initialize AdjacencyMap
        for(int i=0;i< nodeNames.length;i++)
        {
            LinkedList<Character> li = new LinkedList<>();
            for(int j=0;j< nodeNames.length;j++)
            {

                if(AdjMatrix[i][j]==1)
                    li.add(nodeNames[j]);

            }
            AdjacencyMap.put(nodeNames[i], li);
        }

        // initialize visitedMap

        for(char nodeName : nodeNames)
        {
            visitedMap.put(nodeName,false);
        }
    }
}

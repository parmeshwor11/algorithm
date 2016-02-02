package algorithm.mum;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by parmeshwor on 2/2/16.
 */
public class Kruskal
{
    private List<Edge> edges;
    private int numberOfVertices;
    public static final int MAX_VALUE = 999;
    private int visited[];
    private int spanning_tree[][];
    public static void main(String... arg)
    {
        int NUL = MAX_VALUE;
        int number_of_vertices;
        char[] V = {'A','B','C','D','E','F','G','H','I'} ;
        number_of_vertices = V.length-1;
        int [][] adjacency_matrix = {

                {NUL, 22 , 9  , 12 , NUL, NUL, NUL, NUL, NUL },
                {22 , NUL, 35 , NUL, NUL, 36 , NUL, 34 , NUL },
                {9  , 35 , NUL, 4  , 65 , 42 , NUL, NUL, NUL },
                {12 , NUL, 4  , NUL, 33 , NUL, NUL, NUL, 30  },
                {NUL, NUL, 65 , 33 , NUL, 18 , 23 , NUL, NUL },
                {NUL, 36 , 42 , NUL, 18 , NUL, 39 , 24 , NUL },
                {NUL, NUL, NUL, NUL, 23 , 39 , NUL, 25 , 21  },
                {NUL, 34 , NUL, NUL, NUL, 24 , 25 , NUL, 19  },
                {NUL, NUL, NUL, 30 , NUL, NUL, 21 , 19 , NUL }

        };
        Kruskal kruskalAlgorithm = new Kruskal(number_of_vertices);
        kruskalAlgorithm.kruskalAlgorithm(adjacency_matrix);
    }
    public Kruskal(int numberOfVertices)
    {
        this.numberOfVertices = numberOfVertices;
        edges = new LinkedList<Edge>();
        visited = new int[this.numberOfVertices + 1];
        spanning_tree = new int[numberOfVertices + 1][numberOfVertices + 1];
    }

    public void kruskalAlgorithm(int adjacencyMatrix[][])
    {
        boolean finished = false;
        for (int source = 1; source <= numberOfVertices; source++)
        {
            for (int destination = 1; destination <= numberOfVertices; destination++)
            {
                if (adjacencyMatrix[source][destination] != MAX_VALUE && source != destination)
                {
                    Edge edge = new Edge();
                    edge.sourcevertex = source;
                    edge.destinationvertex = destination;
                    edge.weight = adjacencyMatrix[source][destination];
                    adjacencyMatrix[destination][source] = MAX_VALUE;
                    edges.add(edge);
                }
            }
        }
        Collections.sort(edges, new EdgeComparator());
        CheckCycle checkCycle = new CheckCycle();
        for (Edge edge : edges)
        {
            spanning_tree[edge.sourcevertex][edge.destinationvertex] = edge.weight;
            spanning_tree[edge.destinationvertex][edge.sourcevertex] = edge.weight;
            if (checkCycle.checkCycle(spanning_tree, edge.sourcevertex))
            {
                spanning_tree[edge.sourcevertex][edge.destinationvertex] = 0;
                spanning_tree[edge.destinationvertex][edge.sourcevertex] = 0;
                edge.weight = -1;
                continue;
            }
            visited[edge.sourcevertex] = 1;
            visited[edge.destinationvertex] = 1;
            for (int i = 0; i < visited.length; i++)
            {
                if (visited[i] == 0)
                {
                    finished = false;
                    break;
                } else
                {
                    finished = true;
                }
            }
            if (finished)
                break;
        }
        System.out.println("The spanning tree is ");
        for (int i = 1; i <= numberOfVertices; i++)
            System.out.print("\t" + i);
        System.out.println();
        for (int source = 1; source <= numberOfVertices; source++)
        {
            System.out.print(source + "\t");
            for (int destination = 1; destination <= numberOfVertices; destination++)
            {
                System.out.print(spanning_tree[source][destination] + "\t");
            }
            System.out.println();
        }
    }

}

class Edge
{
    int sourcevertex;
    int destinationvertex;
    int weight;
}

class EdgeComparator implements Comparator<Edge>
{
    @Override
    public int compare(Edge edge1, Edge edge2)
    {
        if (edge1.weight < edge2.weight)
            return -1;
        if (edge1.weight > edge2.weight)
            return 1;
        return 0;
    }
}

class CheckCycle
{
    private Stack<Integer> stack;
    private int adjacencyMatrix[][];

    public CheckCycle()
    {
        stack = new Stack<Integer>();
    }

    public boolean checkCycle(int adjacency_matrix[][], int source)
    {
        boolean cyclepresent = false;
        int number_of_nodes = adjacency_matrix[source].length - 1;

        adjacencyMatrix = new int[number_of_nodes + 1][number_of_nodes + 1];
        for (int sourcevertex = 1; sourcevertex <= number_of_nodes; sourcevertex++)
        {
            for (int destinationvertex = 1; destinationvertex <= number_of_nodes; destinationvertex++)
            {
                adjacencyMatrix[sourcevertex][destinationvertex] = adjacency_matrix[sourcevertex][destinationvertex];
            }
        }

        int visited[] = new int[number_of_nodes + 1];
        int element = source;
        int i = source;
        visited[source] = 1;
        stack.push(source);

        while (!stack.isEmpty())
        {
            element = stack.peek();
            i = element;
            while (i <= number_of_nodes)
            {
                if (adjacencyMatrix[element][i] >= 1 && visited[i] == 1)
                {
                    if (stack.contains(i))
                    {
                        cyclepresent = true;
                        return cyclepresent;
                    }
                }
                if (adjacencyMatrix[element][i] >= 1 && visited[i] == 0)
                {
                    stack.push(i);
                    visited[i] = 1;
                    adjacencyMatrix[element][i] = 0;// mark as labelled;
                    adjacencyMatrix[i][element] = 0;
                    element = i;
                    i = 1;
                    continue;
                }
                i++;
            }
            stack.pop();
        }
        return cyclepresent;
    }
}

package algorithm.myGraph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by parmeshwor on 12/20/15.
 */
public class MyGraph {


    static int SIZE = 6; // 0 to 5
    static int ROW = SIZE;
    static int COL = SIZE;
    static int[][] mat = new int[ROW][COL];

    static Queue<Integer>  queue = new LinkedList<>();
    static boolean[] visitedVertex = new boolean[SIZE];
    static Queue bfsTraversal = new LinkedList<>();


    public static void main(String[] args) {
        initialize();
        bfs(0);
        dfs(0);
       // shortestPath();
    }

    private static void dfs(int vertex) {

    }


    // using queue; bfx from vertex
    private static void bfs(int vertex) {

        System.out.println("************* bfs : "+vertex+"  **************\n ");
        int i,j;

        // put vertex in queue
        queue.add(vertex);
        visitedVertex[vertex]=true;
        while(queue.size()!=0) {
            i = queue.peek();
            System.out.println();
            for (j = 0; j < COL; j++) {
                if (mat[i][j] == 1) {
                    // if not in queue put in queue
                    if (!visitedVertex[j]) {
                        queue.add(j);
                        visitedVertex[j] = true;
                        System.out.print( j+"\t");

                    }
                }
            }
            queue.remove();


        }


    }

    private static void initialize() {

        int i;
        // initialize adjacency matrix
        int x[][] = {
                {0,1,1,1,0,0},
                {0,0,0,1,0,0},
                {0,0,0,0,1,0},
                {0,1,0,0,1,1},
                {0,0,0,0,1,1},
                {0,0,0,0,1,0}
        };
        mat =x;

        // all false
        for(i=0;i<SIZE;i++){
            visitedVertex[i]=false;
        }





    }

    private static void test() {

        int[][] tmpMat= {
                {1,2,3},
                {4,5,6}

        };
        System.out.println("tmpMat.length = " + tmpMat[0].length);

    }
}

package algorithm.mum;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by parmeshwor on 2/1/16.
 */
public class DijkstraAlgorithm {


    static int NUL = -1;
    static int INF = 999;
    static char UND = ' ';

    static char[] V = {'A','B','C','D','E','F','G','H','I'} ;
    static Map<Character,Integer> vPos = new HashMap<>();
    static int [][] adjMatrix = {

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

    static Map<Character,LinkedList<Character>> AdjMap = new HashMap<Character,LinkedList<Character>>();

    static Map<Character,Integer> dist = new HashMap<>();
    static Map<Character,Character> prev = new HashMap<>();
    static List<Character> Q = new LinkedList<>();

    public static void main(String[] args) {

        init();
        dijkstraAlgo();

        for(Map.Entry<Character,Integer> e : dist.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());

        }

    }

    private static void init() {

        // initialize position of the vertices ; to make easy getting weight
        for(int i=0;i<V.length;i++)
            vPos.put(V[i],i);


        // initialize Adj Map

            for (int i = 0; i < V.length; i++) {
               LinkedList<Character>li = new LinkedList<>();
                for (int j = 0; j < V.length; j++) {
                    if (adjMatrix[i][j] != NUL)
                        li.add(V[j]);
                }
                AdjMap.put(V[i],li);
            }
    }


    static void dijkstraAlgo(){

        for(char v : V)
        {
            dist.put(v, INF);
            prev.put(UND,UND);
            Q.add(v);
        }

        dist.put(V[0], 0); // dist s to s is 0

        while(!Q.isEmpty())
        {
            char u = getVertexInQWithMinDist();
            Q.remove(Q.indexOf(u));

            for(char v : getAllNeighbourOfUFromQ(u)){  // where vertex is in Q
                System.out.println("v = " + v);
                int temp = dist.get(u)+wt(u,v);
                if(temp<dist.get(v))
                {
                    dist.put(v,temp);
                    prev.put(v, u);
                }
            }
        }
    }

    private static List<Character> getAllNeighbourOfUFromQ(char u) {

        List<Character> li = new LinkedList<>();

        for(char v : AdjMap.get(u))
        if(Q.contains(v))
            li.add(v);

        return li;
    }

    private static char getVertexInQWithMinDist() {
        int tmp = dist.get(Q.get(0));
        char min = Q.get(0);

        for(char v: Q)
        {
            if(dist.get(v)<=tmp){
                tmp = dist.get(v);
                min = v;
            }
        }

        return  min;
    }

    // returns weight from u to v
    private static int wt(char u, char v)
    {

            return adjMatrix[vPos.get(u)][vPos.get(v)];

    }

}

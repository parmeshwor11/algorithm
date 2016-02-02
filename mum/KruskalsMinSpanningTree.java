package algorithm.mum;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by parmeshwor on 2/1/16.
 */
public class KruskalsMinSpanningTree {

    static int NUL = -1;
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
    Map<Character,Character> edges = new LinkedHashMap<>();
    // topological sort and put the edge in edges in ascending order


}

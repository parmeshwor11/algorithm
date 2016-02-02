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
    
    import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class KruskalAlgorithm {
	
    static int NUL = 0;
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
    
   public static void main(String[] args) {
	
	   SortedSet<Edge> s = new TreeSet<Edge>();
	   
	  s.add(new Edge('A', 'B', 2));
	  s.add(new Edge ('B','C',4));
	  s.add(new Edge ('C','A',3));
	  s.add(new Edge ('D','A',6));
	  s.add(new Edge ('A','D',6));
	  s.add(new Edge ('B','D',12));
	   
	   for(Edge e : s)
	   {
		   System.out.println(e.v1+""+e.v2+" : "+e.weight);
	   }
	   
	   
	   
	   
	   
}
   
   private static class Edge implements Comparable{
	   
	   char v1;
	   char v2;
	   int weight;
	   
	   Edge(char v1, char v2 , int weight){
		   
		   this.v1 = v1;
		   this.v2 = v2;
		   this.weight = weight;
		   
	   }
	   
	@Override
	public int compareTo(Object arg0) {
		
		return   this.weight - ((Edge)arg0).weight;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		return (this.v1 == ((Edge)obj).v1&&this.v2==((Edge)obj).v2 )||
				(this.v1 == ((Edge)obj).v2&&this.v2==((Edge)obj).v1 ) ;
		
		
	}
   }
    
    

}



}

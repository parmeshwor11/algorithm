package algorithm.myGraph;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class TopologicalSort {
	
	static int numNodes = 15;
	static int [] nodes =   {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	static int visitedVertexCount = 0;
	static boolean [] isvisited = new boolean[nodes.length]; 
	static int [] topSorted = new int[nodes.length]; 
	
	static Map<Integer,LinkedList<Integer>> AdjMap = new HashMap<Integer,LinkedList<Integer>>() 
		{{
			put(0, new LinkedList<Integer>(){{add(13); add(10); add(7);	}});
			put(1, new LinkedList<Integer>(){{add(2); add(13); add(9);  }});			
			put(2, new LinkedList<Integer>(){{add(12); add(13); add(10); add(14);}});
			put(3, new LinkedList<Integer>(){{add(9);add(6);add(8);add(11); }});
			put(4, new LinkedList<Integer>(){{add(7); }});
			put(5, new LinkedList<Integer>(){{add(10);add(7);add(9);add(6); }});
			put(6, new LinkedList<Integer>(){{add(15); }});
			put(7, new LinkedList<Integer>(){{add(14); }});
			put(8, new LinkedList<Integer>(){{add(15); }});
			put(9, new LinkedList<Integer>(){{add(14); add(11); }});
			put(10, new LinkedList<Integer>(){{add(14); }});
			put(11, new LinkedList<Integer>(){{}});
			put(12, new LinkedList<Integer>(){{}});
			put(13, new LinkedList<Integer>(){{}});
			put(14, new LinkedList<Integer>(){{}});
			put(15, new LinkedList<Integer>(){{}});
			
			
		}};
		
	public static void main(String[] args) {
		
		init();
		topologicalSort();
		for(int i:topSorted){
			System.out.print(i+" ");
		}
	}

	  private static void topologicalSort() {

	        Stack<Integer> stack = new Stack<>();
	        while(!isThereUnvisitedVertex()){
	            int markedNode = getNextNotVisitedVertex();
	            stack.push(markedNode);
	            isvisited[markedNode] = true;
	          //  System.out.println(markedNode);
	            visitedVertexCount++;

	            while(!stack.isEmpty())
	            {
	                int poppedNode = stack.pop();
	                topSorted[poppedNode]= numNodes--;
	                

	                for(int adjacentNode : AdjMap.get(poppedNode))
	                {
	                    if( (!isvisited[adjacentNode]))
	                    {
	                        isvisited[adjacentNode]=true;
	                        visitedVertexCount++;
	                        //System.out.print(adjacentNode + " ");
	                        stack.push(adjacentNode);
	                        break;
	                    }
	                }
	            }
	        }
	    }
	

    private static boolean isThereUnvisitedVertex(){

        return visitedVertexCount == nodes.length;
    }

    private static int getNextNotVisitedVertex(){

        int i=0;
        for(int j=0;j<isvisited.length;j++)
        {
            if(!isvisited[j])
            {
                i=j;
                break;
            }
        }
        return i;
    }

	private static void init() {
		for(int i=0;i<nodes.length;i++){
			isvisited[i]=false;
		}

		
	}
		
		
	

	

}

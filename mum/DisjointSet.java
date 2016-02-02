package algorithm.mum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by parmeshwor on 2/1/16.
 */
public class DisjointSet {

    Map<Character,Character> parents = new HashMap<Character,Character>();
    Map<Character,Integer> heights = new HashMap<Character,Integer>();

    // gives the root of the element
    public char find(char element){

        char parent = parents.get(element);

        if(parent == element)
            return  element;

       return find(parent);
    }

    // union accepts only tree roots (representing subsets ) as arguments
    public void union ( char root_a, char root_b)
    {
        parents.put(root_a,root_b);
    }

    // union with height optimization
    public void optUnion(char root_a, char root_b){
        int height_a = heights.get(root_a);
        int height_b = heights.get(root_b);

        if(height_a<height_b){
            parents.put(root_a,root_b);
        }
        else if(height_b<height_a){
            parents.put(root_b,root_a);
        }else {// height a== height b

            parents.put(root_a,root_b);
            heights.put(root_b,height_b==0?1:height_b);
        }

    }

}

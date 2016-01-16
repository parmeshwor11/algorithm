package algorithm.mum;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by parmeshwor on 1/14/16.
 *
 *  Design an algorithm that does the following: Input is a set S of n items or objects so
 that each item has a weight and a value; you are also given a maximum weight W and
 a minimum value V. Your algorithm must determine whether some subset T of S has
 the property that the sum of the weights of items in T is no greater than the maximum
 weight W, and the sum of the values of the items in T is not less than the minimum
 value V. If such a subset T can be found, the algorithm should return “true”;
 otherwise, it should return false. Once you have obtained such an algorithm,
 determine its asymptotic running time.
 */
public class GreedySum {

    static Set<Item> output = new LinkedHashSet<>();
    public static void main(String[] args) {

        Set<Item> S = new HashSet<>();
        S.add(new Item(1,2));
        S.add(new Item(2,3));
        S.add(new Item(3,4));



        int W = 6;
        int V = 9;

        boolean flag = greedySum(V,W,S,0);

        System.out.println("flag = " + flag);





    }

    private static boolean greedySum(int v, int w, Set<Item> s, int length) {

        for(int i=length;i<s.size();i++)
        {
            Item tmp = s.iterator().next();
            output.add(tmp);

            int sumV =0;
            int sumW =0;
            for(Item item : output){
                sumV += item.value;
                sumW += item.weight;
            }
            if(sumV==v&& sumW==w)
                return true;

            greedySum(v,w,s,i+1);

            output.remove(tmp);
        }

        return  false;
    }


    private static class Item{
        int weight;
        int value;

        Item(int weight,int value){
            this.weight = weight;
            this.value = value;
        }
    }
}



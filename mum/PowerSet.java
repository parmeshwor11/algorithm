package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Algorithm: PowerSet(X)
Input: A list X of elements
Output: A list P consisting of all subsets of X – elements of P are Sets
P ← new list
S ← new Set //S is the empty set
P.add(S) //P is now the set { S }
T ← new Set
while (!X.isEmpty() ) do
f ← X.removeFirst()
for each x in P do
T ← x U {f} // T is the set containing f & all elements of x
P.add(T)
return P
 * */
public class PowerSet {
	
	static List<Set> P = new ArrayList<>();
	static Set<Integer> S = new HashSet<>();
	
	public static void main(String[] args) {
		List<Integer> X = Arrays.asList(2,3,4,5);
		powerSet(X);
		
	}
	
	static void powerSet(List<Integer> x){
		P.add(S);
		Set<Integer> T = new HashSet();
		while(!x.isEmpty()){
			int f = x.remove(0);
			for(Set s:P)
			{
				s.add(f);
				T = s;
				P.add(T);
			}
		}
		
		// print P 	
	}

}

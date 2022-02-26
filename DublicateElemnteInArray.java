package specialprogram.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DublicateElemnteInArray {
	public static void main(String[] args) {
		// by using bute force methode

		/*
		 * int a[]= {1,1,2, 7,3,5,6,7};
		 * System.out.println("dublicate elemnts are by bute force methode::"); 
		 * for(int i=0;i<a.length;i++) {
		 *  for(int j=i+i;j<a.length;j++) { 
		 *  if(a[i]==a[j] && i!=j)
		 * { 
		 * System.out.print(a[j] + " "); } } } } }
		 */

		// ++++++++++++++by using set interface ++++++++++++//
		/*
		 * int a[] = { 1, 1, 2, 7, 3, 5, 6,6 , 7,7 }; Set<Integer> s = new HashSet<>();
		 * System.out.println("dublicate elemnts are by set or hashset  methode::"); for
		 * (int no : a) { //boolean b=s.add(no);
		 * 
		 * //ager ek element do bar se jyada hai to use print kar dega if (s.add(no) ==
		 * false) {
		 * 
		 * System.out.println(no + " ");
		 * 
		 * } } } }
		 */
		
		// ++++++++++++++by using Map interface ++++++++++++//
		
		
		int no[] = { 1, 1, 2, 7, 3,5, 5, 6,6, 6, 7, 7 };
		Map<Integer, Integer> hm = new HashMap<>();
		for (int no1 : no) {
			Integer count = hm.get(no1);
			if (count == null) {
				hm.put(no1, 1);
System.out.println(hm);
			} else {
				//count = count + 1;
				count++;
				hm.put(no1, count);
			}
			// boolean b=s.add(no);
		}
		System.out.println("dublicate elemnts are by map using key value pair  methode::");
		Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
		for (Map.Entry<Integer, Integer> me : es) {
			if (me.getValue() > 1) {
				System.out.println(me.getKey());
			}
		}
	}
}

package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODOO Auto-generated method stub
		List <Integer>l1 = new ArrayList <Integer> ();
		l1.add(40);
		l1.add(80);
		l1.add(120);
		l1.add(160);
		l1.add(200);
		l1.add(240);
		//l1.remove(2);
		
		
		List <Integer> l2 = new ArrayList<Integer>();
		l2.add(50);
		l2.add(70);
		l2.addAll(l1);
		
		
		
		for(Integer i: l2) {
			System.out.println(i);
		}

	}

}

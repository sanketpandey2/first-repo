package proj1;

import java.util.HashMap;



public class Duparr1 {
	
	public static void main(String[] args) {
		
	
	
	int[] arr=new int[]{1,4,3,2,3,4,4,42};
	
	HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
	
	for(int i:arr) {
		if(hp.containsKey(i))
		{
			hp.put(i, hp.get(i)+1);
		}
		else
		
			hp.put(i, 1);
	}
	java.util.Set<Integer> k= hp.keySet();
	
	for(int m:k) {
		System.out.println("key"+m+"value"+hp.get(m));
	}
	
	System.out.println(hp);
	}

}

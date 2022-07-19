package day10;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(101, "devid");
		hm.put(102, "setul");
		hm.put(103, "tom");
		hm.put(104, "jerry");
		
		
		
		System.out.println(hm);
		hm.remove(103);
		System.out.println(hm);
		
		for(Map.Entry r:hm.entrySet()) {
			System.out.println(r.getKey()+ " " + r.getValue());
		}

	}

}

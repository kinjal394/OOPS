package day10;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList list=new ArrayList();
		
		//ArrayList<Integer> listInt=new ArrayList<Integer>();
		
		//ArrayList<String> strList=new ArrayList<String>();
		
		ArrayList strList=new ArrayList();
		
		//add elements
		strList.add("scott");
		strList.add("devid");
		strList.add("drake");
		strList.add("tom");
		strList.add(100);
		strList.add('a');
		
		
		//print list
		System.out.println(strList);
		
		//remove elements
		strList.remove(1);
		System.out.println(strList);
		
		//insert element
		
		strList.add(1, "jerry");
		strList.add(4, "check");
		
		//lenght
		System.out.println("size of arraylist="+ strList.size());
		System.out.println(strList);
		
		System.out.println("Print arrayList----------");
		
		for(Object r:strList) {
			System.out.println(r);
		}
		
		

	}

}

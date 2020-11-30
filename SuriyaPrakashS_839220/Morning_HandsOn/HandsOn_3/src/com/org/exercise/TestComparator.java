package com.org.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {
		List<Items> list=new ArrayList<Items>();
		
		list.add(new Items(200, "AC", 45000));
		list.add(new Items(100, "Refrigirator", 20000));
		list.add(new Items(300, "Computer", 30000));
		for (Items items : list) {
			System.out.println(items);
		}
		
		System.out.println("---SORTING BY NAME---");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items i1,Items i2) {
				return i1.getName().compareTo(i2.getName());
			}
		});
		for (Items items : list) {
			System.out.println(items);
		}
		
		System.out.println("---SORTING BY PRICE---");
		Collections.sort(list,new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				return(int)(i1.getPrice()-i2.getPrice());
			}
		});
		for(Items items : list) {
			System.out.println(items);
		}
	}

}

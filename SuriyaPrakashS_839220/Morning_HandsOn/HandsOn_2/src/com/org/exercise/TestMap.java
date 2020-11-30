package com.org.exercise;

import java.util.*;;
public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentsList1=new ArrayList<>();
		List<Student> studentsList2=new ArrayList<>();
		
		Map<String,List<Student>> resultMap=new TreeMap<>();
		
		studentsList1.add(new Student(1,"Arthur"));
		studentsList1.add(new Student(2,"Morgan"));
		studentsList2.add(new Student(1,"John"));
		studentsList2.add(new Student(2,"Marston"));
		
		resultMap.put("EIE",studentsList1);
		resultMap.put("ECE",studentsList2);
		
		System.out.println(resultMap.get("ECE"));
		
	}

}

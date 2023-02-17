package com.bk.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public void summarystatistics() {
		
		List<Integer> list = Arrays.asList(2,5,7,8,9,12,45);
		IntSummaryStatistics summary  = list.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Min = > "+summary.getMin());
		System.out.println("Mamx= > "+summary.getMax());
		
		System.out.println("sum = > "+summary.getSum());
		
	}
	
	public void strFilter() {
		List<String> s = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		String str = s.stream().filter(st -> !st.isEmpty()).collect(Collectors.joining(","));
		System.out.println(str);
	}
	
	public void listSample() {
		class EmployeeSte {
			String name;
			int age;
			String dept;
			
			EmployeeSte(String name, int age, String dept) {
				this.name=name;
				this.age=age;
				this.dept=dept;
			}
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public String getDept() {
				return dept;
			}
			public void setDept(String dept) {
				this.dept = dept;
			}
		}
		
		EmployeeSte e1 = new EmployeeSte("Robert", 25, "Sales");
		EmployeeSte e2 = new EmployeeSte("Lafore", 35, "IT");
		EmployeeSte e3 = new EmployeeSte("April", 25, "Sales");
				
		List<EmployeeSte> list = new ArrayList<>(Arrays.asList(e1,e2,e3));
		
		Comparator<EmployeeSte> comp = (p1, p2) -> p1.getName().compareTo(p2.getName());
		
		List<EmployeeSte> resList = list.stream().sorted(comp).collect(Collectors.toList());
		resList.forEach(e -> System.out.println(e.getName())); 
		
		
		Comparator<EmployeeSte> mf = Comparator.comparing(EmployeeSte::getName).thenComparing(EmployeeSte::getAge);
		list.stream().sorted(mf).collect(Collectors.toList());
		
		
	}
	
	
	public static void main(String[] args) {

		StreamAPI s = new StreamAPI();
		//s.summarystatistics();
        //s.listSample();
		s.strFilter();
	}

}

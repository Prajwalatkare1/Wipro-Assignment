package Coding_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyEmployee {
	int id;
	String name;
	double salary;

	public MyEmployee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
	}
}

public class Q44 {

	public static void main(String[] args) {
		List<MyEmployee> employees = new ArrayList<>();
		employees.add(new MyEmployee(101, "Vishwas", 55000));
		employees.add(new MyEmployee(102, "Ravi Prakash", 72000));
		employees.add(new MyEmployee(103, "Ghaffar", 48000));
		employees.add(new MyEmployee(104, "Ranjith", 72000));
		employees.add(new MyEmployee(105, "Trishank", 60000));

		Collections.sort(employees, new Comparator<MyEmployee>() {
			public int compare(MyEmployee e1, MyEmployee e2) {
				return Double.compare(e2.salary, e1.salary);
			}
		});

		System.out.println("Sorted by Salary (Descending):");
		for (MyEmployee emp : employees) {
			System.out.println(emp);
		}

		Collections.sort(employees, (e1, e2) -> e1.name.compareToIgnoreCase(e2.name));

		System.out.println("\nSorted by Name (Alphabetically):");
		for (MyEmployee emp : employees) {
			System.out.println(emp);
		}
	}
}
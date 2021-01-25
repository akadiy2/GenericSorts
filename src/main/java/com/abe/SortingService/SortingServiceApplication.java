package com.abe.SortingService;

import com.abe.model.Student;
import com.abe.operation.search.BinarySearch;
import com.abe.operation.search.LinearSearch;
import com.abe.operation.search.Search;
import com.abe.operation.sort.BubbleSort;
import com.abe.operation.sort.InsertionSort;
import com.abe.operation.sort.QuickSort;
import com.abe.operation.sort.Sort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SortingServiceApplication {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		for (int i = 1; i <= 50; i+=2) {
			Student s = new Student();
			s.setName("A" + i);
			s.setAge(20 + i);
			list.add(s);
		}

		for (int i = 1; i <= 20; i+=2) {
			Student s = new Student();
			s.setAge(10 + i);
			s.setName("B" + i);
			list.add(s);
		}

		for (int i = 1; i <= 40; i+=3) {
			Student s = new Student();
			s.setAge(30 + i);
			s.setName("C" + i);
			list.add(s);
		}

		Student [] arr = new Student[list.size()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}

		System.out.println(Arrays.toString(arr));

		Sort sort = new InsertionSort<>(arr);
		Search s = new BinarySearch<>(sort, arr);

		Student st = new Student();
		st.setAge(23);
		st.setName("A3");

		System.out.println(s.search(arr,st));
		sort.doSort();


		System.out.println(Arrays.toString(arr));
	}

}

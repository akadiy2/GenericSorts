package com.abe.SortingService;

import com.abe.model.Student;
import com.abe.operation.SortSearchContext;
import com.abe.operation.search.BinarySearch;
import com.abe.operation.search.Search;
import com.abe.operation.sort.InsertionSort;
import com.abe.operation.sort.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SortingServiceApplication {

	@SuppressWarnings("unchecked")
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

		Student st = new Student();
		st.setAge(23);
		st.setName("A3");

		Search binserch = SortSearchContext.getSearch("BINARY");
		Sort insort = SortSearchContext.getSort("INSERTION");

		if (binserch instanceof BinarySearch) {
			((BinarySearch)binserch).setSort(insort);
		}

		binserch.setArr(arr);
		insort.setArr(arr);

		System.out.println(binserch.search(arr,st));
		System.out.println(Arrays.toString(arr));
	}

}

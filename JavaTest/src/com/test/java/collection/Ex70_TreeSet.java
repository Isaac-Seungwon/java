package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex70_TreeSet {

	public static void main(String[] args) {
		
		// Ex70_TreeSet.java
		
		/*
			TreeSet
			- Tree 구조
				- 이진 트리 구조 (이진 탐색 트리, BinarySearch Tree)
			
			- Set 사용법 (굉장히 기본적이다.)
				- 순서가 없다.
				- 중복값을 가지지 않는다.
		
		
		
		5, 3, 7, 1, 2, 8, 9, 4, 6
		
		숫자를 비교해서 작으면 왼쪽에 방을 만들고, 크면 오른쪽에 방을 만든다.
		들어가는 숫자의 순서에 따라 트리 구조가 이쁘게 만들어질 수도, 안 이쁘게 만들어질 수도 있다.
		사선으로 특징이 생긴다. 데이터가 정렬이 되어 있다.
		Set은 정렬을 안 한다고 했다. 그런데 트리 구조는 정렬이 되어 있는 독특한 Set 컬렉션이다.
		(물론 Set도 자체적으로 정렬하는 기준이 있긴 하다.)
		Hash 알고리즘은 무언가를 찾을 때 굉장히 빠르다. 그래서 HahsSet이 보편적으로 사용하는 Set이지만,
		Set은 Set이되, 순서가 정렬된 Set이 필요할 때 사용하는 구조이다.		
		
		*/
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		
		
		/*
		set1.add(1);
		set1.add(3);
		set1.add(4);
		set1.add(2);
		set1.add(5);
		set2.add(1);
		set2.add(3);
		set2.add(4);
		set2.add(2);
		set2.add(5);
		
		System.out.println(set1); // [1, 2, 3, 4, 5]
		System.out.println(set2); // [1, 2, 3, 4, 5]
		*/
		
		set1.add(10);
		set1.add(30);
		set1.add(40);
		set1.add(20);
		set1.add(50);
		set2.add(10);
		set2.add(30);
		set2.add(40);
		set2.add(20);
		set2.add(50);
		
		System.out.println(set1); // [50, 20, 40, 10, 30]
		System.out.println(set2); // [10, 20, 30, 40, 50] 자동 오름차순
		
		
		// 탐색 > for / iterator
		for (int n : set2) {
			System.out.println(n);
		}
		
		Iterator<Integer> iter = set2.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		// TreeSet 고유 기능
		System.out.println(set2.first());
		System.out.println(set2.last());
		System.out.println(set2.headSet(30)); // exclusive [10, 20]
		System.out.println(set2.tailSet(30)); // inclusive [30, 40, 50]
		System.out.println(set2.subSet(20, 40)); // [20, 30]
		
		// 기본적으로 오름차순 정렬이 되기 때문에 가장 작은 요소와 가장 큰 요소를 출력하는 first(), last() 메소드가 있다. (중간 요소를 뽑아내는 메소드는 없다.)
		// 정렬이 되어 있기 때문에 기준값을 잡아주면 그것보다 작은 값을 출력해주는 headSet() 메소드,
		// 기준값을 포함해 그보다 큰 값을 출력하는 tailSet() 메소드,
		// 해당 값을 포함해 범위의 숫자를 출력하는 subSet() 메소드가 있다.
		
		
		// HashSet 배열 정렬
		HashSet<Integer> set3 = new HashSet<Integer>();
		
		set3.add(20);
		set3.add(50);
		set3.add(30);
		set3.add(10);
		set3.add(40);
		
		System.out.println(set3); // [50, 20, 40, 10, 30]
		
		// HashSet 배열의 데이터를 정렬하고자 할 때 Set과 List 간의 변환하는 방법을 이용한다.

		ArrayList<Integer> list = new ArrayList<Integer>(set3);
		// 리스트를 바꿔서 sort를 한 다음에 출력을 하면 정렬이 이루어진다.
		
		Collections.sort(list);
		
		System.out.println(list); // [10, 20, 30, 40, 50]
		
	}
	
}

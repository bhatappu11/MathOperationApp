package com.bridgelabz.mathoperationapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumberPlayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
		
}

package com.bridgelabz.mathoperationapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
	System.out.println("---------------");
	//Proper class
	class MyConsumer implements Consumer<Integer>{
		public void accept(Integer number) {
			System.out.println("Consumer implementation value: "+number);
		}
	}
	MyConsumer action = new MyConsumer();
	list.forEach(action);
	System.out.println("------------------");
	
	//Anonymous class
	list.forEach(new Consumer<Integer>() {
		public void accept(Integer number) {
			System.out.println("Anonymous implementation value: "+number);
		}
	});
	System.out.println("------------------");
	
	//explicit lambda function
	Consumer<Integer> listAction = n->{
		System.out.println("Explicit lambda implementation value:"+n);
	};
	list.forEach(listAction);
	System.out.println("------------------");
	
	//implicit lambda function
	list.forEach(n->{
		System.out.println("Implicit lambda implementation value: "+n);
	});
	System.out.println("------------------");
	
	//lambda to print double
	Function<Integer, Double> doubleFunction = Integer::doubleValue;
	list.forEach(n->{
		System.out.println("lambda double value::"+doubleFunction.apply(n));
	});
	System.out.println("------------------");
	
	//predicate interface
	Predicate<Integer> isEvenFunction = n-> n%2 == 0;
	list.forEach(n->{
		System.out.println("Check for even: "+n+":"+isEvenFunction.test(n));
	});
	System.out.println("------------------");
	//processing the stream
	list.stream().forEach(n->{
		System.out.println("stream impl value: "+n);
	});
	System.out.println("------------------");
	//stream map operation to store
	List<Double> doubleList = list.stream()
							  .map(doubleFunction)
							  .collect(Collectors.toList());
	System.out.println("Double list: "+doubleList);
	}	
}

package com.divs;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Integer> consumer=i->System.out.println(i);
		Consumer<Integer> cubeConsumer=i->System.out.println(i*i*i);
		consumer.andThen(cubeConsumer).accept(2);
		
		

	}

}

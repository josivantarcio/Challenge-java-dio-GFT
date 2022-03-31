package one.digitalinovation.aplication;

import one.digitalinovation.singleton.SingletonEager;
import one.digitalinovation.singleton.SingletonLazy;
import one.digitalinovation.singleton.SingletonLazyHolder;

public class TestSingleton {
	public static void main(String[] args) {
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder= SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder= SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
	}
}

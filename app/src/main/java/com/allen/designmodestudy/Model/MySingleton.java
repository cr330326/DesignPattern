package com.allen.designmodestudy.Model;

/**
 * Android Studio 都有模板
 * Created by ChenRan on 2016-9-14.
 */
public class MySingleton {

	//内部静态类单例模式，推荐用法，线程安全，不像懒汉式写法和饿汉式写法那样，有相应的缺点
	private static MySingleton ourInstance = new MySingleton();
	
	public static MySingleton getInstance() {
		return ourInstance;
	}
	
	private MySingleton() {
	}
}

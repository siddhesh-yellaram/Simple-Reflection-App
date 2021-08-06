package com.techlab.reflection;
import java.lang.reflect.*;
import com.techlab.model.Rectangle;

public class ReflectionTest {

	public static void main(String[] args) {
		doReflection(Rectangle.class);
		doReflection(String.class);
		doReflection(Object.class);
	}
	private static void doReflection(Class<?> cls) {
		System.out.println("\nClass Name: "+cls.getName());
		
		System.out.println("\nMethods of Class "+cls.getName()+" are: ");
		Method[] methods = cls.getMethods();
		int count_method = 0;
		for(Method m: methods) {
			System.out.println(m.getName());
			count_method += 1;
		}
		System.out.println("\nTotal Methods: "+count_method);
		
		System.out.println("\nGetters of Class "+cls.getName()+" are: ");
		int tot_get = 0;
		for(Method m: methods) {
			if(m.getName().startsWith("get")) {
				System.out.println(m.getName());
				tot_get += 1;
			}
		}
		System.out.println("\nTotal Getters: "+tot_get);
		
		System.out.println("\nSetters of Class "+cls.getName()+" are: ");
		int tot_set = 0;
		for(Method m: methods) {
			if(m.getName().startsWith("set")) {
				System.out.println(m.getName());
				tot_set += 1;
			}
		}
		System.out.println("\nTotal Setters: "+tot_set);
	}
}

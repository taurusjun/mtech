package com.mtech.example.eg1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationIntro {

	public static void main(String[] args) throws Exception {
		Method[] methods = Class.forName("com.mtech.example.AnnotationTest")
				.getDeclaredMethods();

		Annotation[] annotations;

		for (Method method : methods) {
			annotations = method.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(method.getName() + ":"
						+ annotation.annotationType().getName());
			}
		}

	}

}

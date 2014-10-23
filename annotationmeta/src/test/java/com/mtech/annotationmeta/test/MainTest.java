package com.mtech.annotationmeta.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;

import javassist.bytecode.SignatureAttribute.MethodSignature;

import org.reflections.Reflections;
import org.reflections.scanners.FieldAnnotationsScanner;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import com.mtech.annotationmeta.definition.MetaInfoAnnotation;

public class MainTest {

	public static void main(String[] args) {
		String basePackageName = "com.mtech.annotationmeta.test";
		Reflections reflections = new Reflections(new ConfigurationBuilder()
				.setScanners(new SubTypesScanner(false /*
														 * don't exclude
														 * Object.class
														 */),
						new FieldAnnotationsScanner(),
						new TypeAnnotationsScanner(), new ResourcesScanner())
				.setUrls(ClasspathHelper.forPackage(basePackageName))
				/* and maybe */
				.filterInputsBy(
						new FilterBuilder().include(FilterBuilder
								.prefix(basePackageName))));
		// FieldAnnotationsScanner
		Set<Field> ids = reflections
				.getFieldsAnnotatedWith(MetaInfoAnnotation.class);

//		for (Field field : ids) {
//			MetaInfoAnnotation anno = field
//					.getAnnotation(MetaInfoAnnotation.class);
//			System.out.println(field.getDeclaringClass().getSimpleName() + ":"
//					+ field.getName() + ":" + anno.label());
//		}

		Class<MetaInfoAnnotation> metaDef=MetaInfoAnnotation.class;
		Method[] methods= metaDef.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName()+":"+method.getReturnType().getSimpleName());
		}
		
		Set<Class<? extends Object>> subTypes = reflections
				.getSubTypesOf(Object.class);

		// Set<Class<?>> annotatedClassSet = reflections
		// .getTypesAnnotatedWith(MetaInfoAnnotation.class);
		//
		// for (Class<?> annotatedClazz : annotatedClassSet) {
		// System.out.println(annotatedClazz.getSimpleName());
		// }
	}
}

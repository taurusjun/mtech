package com.mtech.annotationmeta.definition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MetaInfoAnnotation {

	public String name() default "";

	public String label() default "";

	public boolean expose() default true;

	public boolean readOnly() default false;

	public int size() default -1;

	public boolean unique() default false;
}

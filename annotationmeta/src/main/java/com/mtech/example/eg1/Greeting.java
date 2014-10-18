package com.mtech.example.eg1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.CONSTRUCTOR })
public @interface Greeting {
	public enum FontColor {
		Red, Green, Blue
	};

	String name();

	String content();

	FontColor fontColor() default FontColor.Red;
}

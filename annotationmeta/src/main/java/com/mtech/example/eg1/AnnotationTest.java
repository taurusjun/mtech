package com.mtech.example.eg1;

import com.mtech.example.eg1.Greeting.FontColor;

public class AnnotationTest {

	@Greeting(name = "name1", content = "content1", fontColor = FontColor.Blue)
	public static void main(String[] args) {
		sayHello();
	}

	@Greeting(name = "name2", content = "Hello!")
	public static void sayHello() {

	}

}

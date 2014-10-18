package com.mtech.annotationmeta.test;

import java.util.List;

import com.mtech.annotationmeta.definition.MetaInfoAnnotation;

public class Customer {

	@MetaInfoAnnotation(name = "customerName", expose = true, label = "customer.name", readOnly = false, size = 100, unique = false)
	public String name;

	@MetaInfoAnnotation(name = "customerName", expose = true, label = "customer.name", readOnly = false, size = 100, unique = false)
	public List<String> address;
}

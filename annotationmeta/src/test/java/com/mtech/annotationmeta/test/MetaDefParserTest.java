package com.mtech.annotationmeta.test;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.mtech.annotationmeta.definition.MetaDefParser;
import com.mtech.annotationmeta.definition.MetaInfoAnnotation;

public class MetaDefParserTest {

	MetaDefParser parserInst;
	@Before
	public void setUp(){
		parserInst=MetaDefParser.instance();
	}
	
	@Test
	public void testGetMetaDefMap() {
		Map<Method, Class> map=	parserInst.getMetaDefMap(MetaInfoAnnotation.class);
		Set<Method> keys= map.keySet();
		for (Method key : keys) {
			Class clazz=map.get(key);
			System.out.println(key.getName()+":"+clazz.getSimpleName());
		}
	}

}

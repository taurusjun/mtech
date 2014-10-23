package com.mtech.annotationmeta.definition;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetaDefParser {
	private Map<Class<?>, List<String>> metaDefMap=new HashMap<Class<?>, List<String>>();
	private List<String> excludeMethodsLst=Arrays.asList(new String[]{"equals","toString","hashCode","annotationType"});;
	
	private MetaDefParser(){}
	
	public static MetaDefParser instance(){
		return new MetaDefParser();
	}
	
	public Map<Method,Class> getMetaDefMap(Class metaDefClass) {
		Map<Method,Class> metaAnnoDefMap=new HashMap<Method, Class>();
		Method[] methods=metaDefClass.getMethods();
		
		
		for (Method method : methods) {
			if(!excludeMethodsLst.contains(method.getName())){
				metaAnnoDefMap.put(method, method.getReturnType());
			}
		}
		
		return metaAnnoDefMap;
	}
}

package com.mtech.annotationmeta.resolver;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import com.mtech.annotationmeta.definition.MetaInfoObject;

public class DefaultMetaInfoResponse implements IMetaInfoResponse {

	Map<String, Map<String, ?>> metaInfoObjMap = new HashMap<String, Map<String, ?>>();

	public DefaultMetaInfoResponse() {

	}

	public void addMetaInfoObj(String name, Map<String, ?> infoObject) {
		this.metaInfoObjMap.put(name, infoObject);
	}

	public void addMetaInfoRespose(IMetaInfoResponse newMetaInfoResponse) {
	}

	public String output() {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.writeValueAsString(this.metaInfoObjMap);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}

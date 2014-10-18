package com.mtech.annotationmeta.resolver;

import java.util.Set;

import org.reflections.Reflections;

public abstract class AbstractMetaInfoResolver implements IMetaInfoResolver {

	public IMetaInfoResponse exact(MetaInfoResponseFormat responseFormat) {
		return null;
	}

	public IMetaInfoResponse exact(String packageName,
			MetaInfoResponseFormat responseFormat) {
		Reflections reflections = new Reflections(packageName);
		Set<Class<? extends Object>> allClasses = reflections
				.getSubTypesOf(Object.class);
		IMetaInfoResponse metaInfoResponse = null;
		for (Class<? extends Object> clazz : allClasses) {
			IMetaInfoResponse newMetaInfoResponse = this.exact(clazz,
					responseFormat);
			if (metaInfoResponse == null) {
				metaInfoResponse = newMetaInfoResponse;
			} else {
				metaInfoResponse.addMetaInfoRespose(newMetaInfoResponse);
			}
		}
		return metaInfoResponse;
	}
}

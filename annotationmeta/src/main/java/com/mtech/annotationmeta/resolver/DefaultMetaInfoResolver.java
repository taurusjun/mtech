package com.mtech.annotationmeta.resolver;

import java.lang.reflect.Field;

import com.mtech.annotationmeta.definition.MetaInfoAnnotation;
import com.mtech.annotationmeta.definition.MetaInfoObject;

public class DefaultMetaInfoResolver extends AbstractMetaInfoResolver {

	public IMetaInfoResponse exact(Class classRef,
			MetaInfoResponseFormat responseFormat) {

		DefaultMetaInfoResponse metaInfoResponse = new DefaultMetaInfoResponse();
		MetaInfoObject infoObject = null;
		Field[] fields = classRef.getFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(MetaInfoAnnotation.class)) {
				MetaInfoAnnotation metaInfo = field
						.getAnnotation(MetaInfoAnnotation.class);
				infoObject = new MetaInfoObject(metaInfo.name(),
						metaInfo.label(), metaInfo.expose(),
						metaInfo.readOnly(), metaInfo.size(), metaInfo.unique());
				metaInfoResponse.addMetaInfoObj(metaInfo.name(), infoObject);
			}
		}

		return metaInfoResponse;
	}

}

package com.mtech.annotationmeta.resolver;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

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
//				infoObject = new MetaInfoObject(metaInfo.name(),
//						metaInfo.label(), metaInfo.expose(),
//						metaInfo.readOnly(), metaInfo.size(), metaInfo.unique());
				Map objectMap=new HashMap(); 
				//@TODO
				
				metaInfoResponse.addMetaInfoObj(metaInfo.name(), objectMap);
			}
		}

		return metaInfoResponse;
	}

}

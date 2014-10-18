package com.mtech.annotationmeta.resolver;

public interface IMetaInfoResolver {
	public IMetaInfoResponse exact(MetaInfoResponseFormat responseFormat);

	public IMetaInfoResponse exact(String packageName,
			MetaInfoResponseFormat responseFormat);

	public IMetaInfoResponse exact(Class classRef,
			MetaInfoResponseFormat responseFormat);
}

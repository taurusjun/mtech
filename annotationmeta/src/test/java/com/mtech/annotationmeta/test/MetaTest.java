package com.mtech.annotationmeta.test;

import com.mtech.annotationmeta.resolver.DefaultMetaInfoResolver;
import com.mtech.annotationmeta.resolver.IMetaInfoResolver;
import com.mtech.annotationmeta.resolver.IMetaInfoResponse;
import com.mtech.annotationmeta.resolver.MetaInfoResponseFormat;

public class MetaTest {

	public static void main(String[] args) {
		IMetaInfoResolver metaInfoResolver = new DefaultMetaInfoResolver();
		IMetaInfoResponse rslt = metaInfoResolver.exact(Customer.class,
				MetaInfoResponseFormat.JSON);
		System.out.println(rslt.output());

	}

}

package com.mtech.annotationmeta.definition;

public class MetaInfoObject {
	String name;

	String label;

	boolean expose;

	boolean readOnly;

	int size;

	boolean unique;

	public MetaInfoObject(String name, String label, boolean expose,
			boolean readOnly, int size, boolean unique) {
		super();
		this.name = name;
		this.label = label;
		this.expose = expose;
		this.readOnly = readOnly;
		this.size = size;
		this.unique = unique;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isExpose() {
		return expose;
	}

	public void setExpose(boolean expose) {
		this.expose = expose;
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isUnique() {
		return unique;
	}

	public void setUnique(boolean unique) {
		this.unique = unique;
	}

}

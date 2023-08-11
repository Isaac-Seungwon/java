package com.test.question.q100;

class Ruler implements Product {
	private int length;
	private String shape;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
	
	@Override
	public String info() {
		return String.format("%dcm %s", this.length, this.shape);
	}
}

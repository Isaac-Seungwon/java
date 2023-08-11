package com.test.question.q100;

class BallPointPen implements Product {
	private double thickness;
	private String color;
	
	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String info() {
		return String.format("%s 색상 %.1fmm 볼펜", this.color, this.thickness);
	}
}

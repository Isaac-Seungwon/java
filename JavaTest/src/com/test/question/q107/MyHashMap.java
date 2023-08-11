package com.test.question.q107;

//문자열 배열을 이용한 HashMap 구현
class MyHashMap {

	private String[] keys;
	private String[] values;
	private int index;
	
	// 생성자
	public MyHashMap() {
		this.keys = new String[4];
		this.values = new String[4];
		this.index = 0;
	}
	
	// 덤프 메소드 (객체 정보를 문자열로 표현하는 메소드)
	@Override
	public String toString() {

		String temp = "";
		
		temp = "MyHashMap [list =";
		
		for (int i = 0; i < this.index; i++) {
			temp += " " + this.keys[i] + ":" + this.values[i];
		}
		temp += ", index : " + this.index;
		temp += ", length : " + this.keys.length;
		temp += "]";
		
		return temp;
	}

	private int getIndex(String key) {
		
		for(int i=0; i<this.index; i++) {
			if (this.keys[i].equals(key)) {
				return i;
			}
		}
		
		return -1;
	}
	
	private boolean checkLength() {
		
		return (keys.length == index) && (values.length == index);
		
		/*
		// 다른 방법
		if (this.index == this.keys.length) {
			return true;
		}
		
		return false;
		*/
	}
	
	private void doubleList() {
		
		String[] temp = new String[this.keys.length * 2];
		
		for (int i=0; i<this.keys.length; i++) {
			temp[i] = this.keys[i];
		}
		
		this.keys = temp;
		
		String[] temp2 = new String[this.values.length * 2];
		
		for (int i=0; i<this.values.length; i++) {
			temp2[i] = this.values[i];
		}
		
		this.values = temp2;
	}
	
	public void put(String key, String value) {
		
		if (getIndex(key) == - 1){
			
			if (checkLength()) {
				doubleList();
			}
			
			this.keys[this.index] = key;
			this.values[this.index]= value;
			this.index++;
		} else {
			this.values[getIndex(key)] = value;
		}
	}
	
	public String get(String key) {
		
		int index = getIndex(key);
		
		if (index != -1) {
			return this.values[index];
		} else {
			return null;
		}
	}
	
	public int size() {
		
		return this.index;
	}
	
	public void remove(String key) {
		
		int index = getIndex(key);
		
		if (index > -1) {
			
			for (int i=index; i<=this.keys.length-2; i++) {
				this.keys[i] = this.keys[i + 1];
			}
			
			for (int i=index; i<= this.values.length-2; i++) {
				this.values[i] = this.values[i + 1];
			}
			
			this.index--;
		}
	}
	
	public boolean containsKey(String key) {
		
		if (getIndex(key) > -1) {
			return true;
		}
		
		return false;
	}
	
	public boolean containsValue(String value) {
		
		for (int i=0; i<this.index; i++) {
			if (this.values[i].equals(value)) {
				return true;
			}
			
		}
		
		return false;
	}
	
	public void clear() {
		
		this.index = 0;
	}
}

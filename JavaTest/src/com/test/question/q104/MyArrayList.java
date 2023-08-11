package com.test.question.q104;

import java.util.Arrays;

class MyArrayList {

	// ArrayList<String>
	private String[] list;
	private int index;
	// index 
	// 1. 현재 요소를 대입할 방번호 역할
	// 2. 현재까지 대입된 요소의 개수 역할

	// 생성자
	public MyArrayList() {
		this.list = new String[4]; // ***
		this.index = 0;
		
		/*
		1. 이름이 클래스와 동일: 생성자 메서드의 이름은 해당 클래스의 이름과 동일하다.
		2. 인스턴스 초기화: 객체를 생성할 때 호출되어 객체의 초기 상태를 설정한다.
		3. 매개변수 사용: 생성자는 객체를 초기화하는 데 필요한 매개변수를 받을 수 있다.
		4. 자동 호출: 객체를 생성할 때 자동으로 호출되며, 개발자가 직접 호출하지 않는다.
		*/
	}

	// 개발할 때 유용하게 사용 > toString
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("length: %d\n", this.list.length));
		sb.append(String.format("index: %d\n", this.index));
		sb.append(Arrays.toString(this.list));
		
		return sb.toString();
	}
	
	public String get(int index) {
		
		if (index < 0 || index >= this.index){
			
			// 없는 방번호를 요청할 경우 > ArrayIndexOutOfBoundsException 오류 발생
			throw new ArrayIndexOutOfBoundsException();
		}
		
		return this.list[index];
		
		/*
		// 다른 방법
		if (index >= 0 && index < this.index) {
			return this.list[index];
		} else {
			return "";
		}
		*/
	}

	// 배열의 방이 남아있는지 검증
	private boolean checkLength() {
		
		if (this.list.length == this.index) {
			// 방이 꽉 찼다
			return true;
		}
		
		// 방이 여유가 있다.
		return false;
	}
	
	public boolean add(String value) {
		
		if (checkLength()) {
			// 기존의 배열 크기에 2배를 증가시킨 새로운 배열 생성
			doubleList();
		} else {
			if (this.list == null) {
				this.list = new String[4];
			}
		}
		
		this.list[this.index] = value;
		this.index++;

		return true;
	}

	private void doubleList() {
		String[] temp = new String[this.list.length * 2]; // 관습적으로 2배로 처리한다.
		
		// 깊은 복사 (데이터를 하나씩 가져와 복사)
		for (int i = 0; i < this.list.length; i++) { // 루프 횟수가 짧은 배열 길이를 기준으로 반복 > 긴 배열을 기준으로 하면 ArrayIndexOutOfBoundsException 오류 발생
			temp[i] = this.list[i];
		}
		
		this.list = temp;
	}
	
	// 삽입
	public boolean add(int index, String value) {
		
        // 배열이 꽉 찼을 경우 배열 크기 2배 확장
        if (checkLength()) {
        	// 기존의 배열 크기에 2배를 증가시킨 새로운 배열 생성
            doubleList();
        } else {
			if (this.list == null) {
				this.list = new String[4];
			}
		}

        // 지정된 위치에 요소를 추가하고, 뒤의 요소들을 한 칸씩 뒤로 이동
        for (int i = this.index; i > index ; i--) {
            this.list[i] = this.list[i - 1];
        }
        this.list[index] = value;
        this.index++;

        return true;
	}

	public int size() {
		return this.index;
	}

	public String set(int index, String value) {
		
		if (index < 0 || index >= this.index){
			
			// 없는 방번호를 요청할 경우 > ArrayIndexOutOfBoundsException 오류 발생
			throw new ArrayIndexOutOfBoundsException();
		}
		
		String temp = this.list[index]; // 기존 값 가져오기
		this.list[index] = value; // 새 값으로 변경

		return temp;
	}

	public String remove(int index) {
		
		String temp = this.list[index];

		for (int i = index; i < this.index - 1; i++) {
			this.list[i] = this.list[i + 1];
		}
		this.index--;

		return temp;
	}

	public int indexOf(String value) {

		for (int i = 0; i < this.index; i++) {
			if (this.list[i].equals(value)) {
				return 1; // 발견
			}
		}

		return -1;
	}

	// 메소드 오버로딩
	public int indexOf(String value, int beginIndex) {

		for (int i = beginIndex; i < this.index; i++) {
			if (this.list[i].equals(value)) {
				return 1; // 발견
			}
		}

		return -1;
	}

	public int lastIndexOf(String value) {

		for(int i=0; i<this.index; i++) {
	        if (this.list[i].equals(value)) {
	            return i; // 발견된 위치
	        }
	    }
		
		return -1;
	}
	
	public int lastIndexOf(String value, int beginIndex) {

		for(int i=beginIndex; i<this.index; i++) {
	        if (this.list[i].equals(value)) {
	            return i; // 발견된 위치
	        }
	    }
		
		return -1;
	}

	public boolean contains(String value) {
		
		for (int i = 0; i < this.index; i++) {
			
			if (this.list[i].equals(value)) {
				return true;
			}
		}
		
		return false;
	}
	
	// 초기화
	void clear() {
		
		this.index = 0;	
		
		/*
		// 다른 방법
		this.list = new String[4]; // 새로운 배열로 교체
		this.index = 0;
		*/
		
		/*
		// 다른 방법
		for(int i = 0; i<this.index; i++) {
			this.list[i] = null;
		}
		
		this.index = 0;
		*/
	}
}

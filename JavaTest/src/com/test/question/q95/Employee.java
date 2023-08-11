package com.test.question.q95;

import java.util.Arrays;

class Employee {
	private String name;         // 직원 이름
	private String department;   // 부서
	private String position;     // 직위
	private String tel;          // 연락처
	private Employee boss;       // 직속 상사

	public void info() {
		// 직원 정보 확인
		String txt = "[";
		
		// 직원 정보를 문자열로 포맷하여 txt에 추가
		txt += this.name + "]\n"
			+ "부서: " + this.department + "\n"
			+ "직위: " + this.position + "\n"
			+ "연락처: " + this.tel + "\n"
			+ "직속상사: " + (this.boss == null ?
					"없음" : (this.boss.getName() + "(" + this.boss.getDepartment() + " " + this.boss.getPosition() + ")"))
			+ "\n";
		
		// 직원 정보 출력
		System.out.println(txt);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// 한글 2~5자 이내
		
		// 한글 이름이 2~5자 사이이며 정규식에 맞을 경우 이름 설정
		// name.matches("^[가-힣]{2,5}$");
		if (name.length() >= 2 && name.length() <= 5 && name.matches("^[가-힣]*$")) {
            this.name = name;
        }
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		// 영업부, 기획부, 총무부, 개발부, 홍보부
		String[] departmentList = {"영업부", "기획부", "총무부", "개발부", "홍보부"};

		// 지정된 부서 중 하나일 경우 부서 설정
		// Arrays.asList(departmentList).contains(department);
		for (String c : departmentList) {
            if (department.equals(c)) {
            	this.department = department;
            }
        }
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		// 부장, 과장, 대리, 사원
		String[] positionList = {"부장", "과장", "대리", "사원"};
		
		// 지정된 직위 중 하나일 경우 직위 설정
		// Arrays.asList(positionList).contains(position);
		for (String c : positionList) {
            if (position.equals(c)) {
            	this.position = position;
            }
        }
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		// 010-XXXX-XXXX 형식 확인
		
		// 연락처가 지정된 형식에 맞을 경우 연락처 설정
		// tel.matches("^010-\\d{4}-\\d{4}$");
		if (tel.length() != 13) {
			return;
		}

		for (int i = 0; i < 13; i++) {
			char c = tel.charAt(i);
			if (i == 3 || i == 8) {
				if (c != '-') {
					return;
				}
			} else {
				if (c < '0' || c > '9') {
					return;
				}
			}
		}

		this.tel = tel;
	}

	public Employee getBoss() {
		
		return boss;
	}

	public void setBoss(Employee boss) {
		
		if (boss == null) {
			return;
		}
		
		// 동일 인물일 경우 보스가 될 수 없음
		if (this.name.equals(boss.getName())
				&& this.department.equals(boss.getDepartment())
				&& this.position.equals(boss.getPosition())
				&& this.tel.equals(boss.getTel())) {
			return;
		}
		
		// 같은 부서가 아닐 경우 보스가 될 수 없음
		if (!this.department.equals(boss.getDepartment())) {
			return;
		}
		
		this.boss = boss;
	}
	
	/*
	public void setBoss(Employee boss) {
		// 상사가 지정되지 않았거나 현재 직원의 상사와 같은 경우 설정하지 않음
	    if (boss == null || !this.department.equals(boss.getDepartment())) {
	        return;
	    }
	    
	    // 상사의 부서가 현재 직원의 부서와 같을 경우 상사 설정
	    if (!this.isSameAs(boss)) {
	        this.boss = boss;
	    }
	}

	// 다른 방법으로 상사 검증
	private boolean isSameAs(Employee other) {
	    return this.name.equals(other.getName()) &&
	           this.department.equals(other.getDepartment()) &&
	           this.position.equals(other.getPosition()) &&
	           this.tel.equals(other.getTel());
	}
	*/
}
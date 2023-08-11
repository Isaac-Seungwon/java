package com.test.question.q98;

public class Student {
    private String name;         // 학생의 이름
    private int age;             // 학생의 나이
    private int grade;           // 학생의 학년
    private int classNumber;     // 학생의 반 번호
    private int number;          // 학생의 번호

    // 기본 생성자
    public Student() {
        this("미정", 0, 0, 0, 0);
    }

    // 모든 정보를 받는 생성자
    public Student(String name, int age, int grade, int classNumber, int number) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.classNumber = classNumber;
        this.number = number;
    }

    // 이름과 나이만 받는 생성자
    public Student(String name, int age) {
        this(name, age, 0, 0, 0);
    }

    // 학년, 반 번호, 번호만 받는 생성자
    public Student(int grade, int classNumber, int number) {
        this("미정", 0, grade, classNumber, number);
    }

    // 학생 정보를 문자열로 반환하는 메소드
    String info() {
        return String.format("%s(나이 : %s, 학년 : %s, 반 : %s, 번호 : %s)",
                this.name,
                this.age != 0 ? this.age + "세" : "미정",
                this.grade != 0 ? this.grade : "미정",
                this.classNumber != 0 ? this.classNumber : "미정",
                this.number != 0 ? this.number : "미정");
    }
}

package com.test.question.q99;

public class Time {

    private int hour;      // 시
    private int minute;    // 분
    private int second;    // 초

    // 기본 생성자
    public Time() {
        this(0, 0, 0);
    }

    // 시, 분, 초를 받는 생성자
    public Time(int hour, int minute, int second) {
        this.second = second % 60;  // 초를 분과 초로 변환하여 저장
        this.hour = (second / 60 + minute) / 60; // 시간 계산
        this.minute = (second / 60 + minute) % 60; // 분 계산
        this.hour += hour;  // 시간 계산 결과 더하기
    }

    // 분, 초를 받는 생성자
    public Time(int minute, int second) {
        this(0, minute, second);
    }

    // 초를 받는 생성자
    public Time(int second) {
        this(0, 0, second);
    }

    // 시간 정보를 문자열로 반환하는 메서드
    String info() {
        /*
        if (this.second >= 60) {
            this.minute += this.second / 60;
            this.second -= (this.second / 60) * 60;
        }

        if (this.minute >= 60) {
            this.hour += this.minute / 60;
            this.minute -= (this.minute / 60) * 60;
        }
        */

        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}

package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {
	
	//필드
	private Circle[] cArray;
	private int crtPos;
	
	//생성자
	public CircleList() {
		cArray = new Circle[3];
		crtPos=0;
	}
	//메소드 g/s
	
	
	
	//메소드 일반
	public void add(Circle c) {
		//현재배열개수+1 배열을 새로 만든다
		//이번배열의 값을 새배열에 옴긴다
		//마지막방에 새주소를 추가한다
		cArray[crtPos] =c;
		//crtPos=crtPos+1;
		crtPos+=1;
	}
	public int size() {
		return crtPos;
	}
	public Circle get(int i) {
		return cArray[i];
	}

	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	

}

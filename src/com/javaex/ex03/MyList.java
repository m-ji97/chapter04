package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> { //<모를때는 <T>로 가정해줌 Object로 가정하는게 아님
	
	//필드
	private T[] oArray;
	private int crtPos;
	
	
	//생성자
	public MyList() {
		//원래 만들지 않을 편의상 가정
		oArray = (T[])new Object[3]; //(T[])new object[]가 되어야 함 
		crtPos=0;
	}
	//메소드 g/s
	
	//메소드 일반
	public void add(T o) {
		//현재배열개수+1 배열을 새로 만든다
		//이번배열의 값을 새배열에 옴긴다
		//마지막방에 새주소를 추가한다
		oArray[crtPos] = o;
		//crtPos=crtPos+1;
		crtPos +=1;
	}
	public int size() {
		
		return crtPos;
		
	}
	public T get(int i) { //int i=int index
		return oArray[i];
				//index방 안에 있는 Point주소
	}

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}

}

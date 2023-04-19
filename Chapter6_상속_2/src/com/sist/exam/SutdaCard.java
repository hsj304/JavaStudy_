package com.sist.exam;
/*
 * 사용자 정의 데이터형 => 필요에 의해서 데이터를 묶어서 관리할 목적으로 만든다
 * 사용자 정의 데이터형 => ~VO
 */
public class SutdaCard {
	private int num;
	private boolean isKwang;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isKwang() {
		return isKwang;
	}
	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
}

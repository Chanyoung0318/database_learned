package com.human.ex1;

public class BankArray {
	public static final int STATE_LOGOUT = 0;
	public static final int STATE_USER_LOGIN = 1;
	public static final int STATE_ADMIN_LOGIN = 2;
	public static final int STATE_EXIT = -1;
	// enum 자바문법

	// 최대 저장할 수 있는 전체사용자 저장

	public static String id[] = new String[100];
	public static String pw[] = new String[100];
	public static double account[] = new double[100];
	//
	public static int totalUserCount = 0; // 일반사용자 전체 갯수
	public static int loginUserIndex = -1; // 로그인한 사람의 인덱스
	public static int loginUserStatus = BankArray.STATE_LOGOUT; // 로그인

	// 관리자면 LOGINUSERINDEX=-2로 변경
	public static String adminId = "admin";
	public static String adminPw = "admin";

	// 사용자 입력받기 위한 Scanner와 사용자 입력을 처리할 변수들
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static String inputId = null;
	public static String inputPw = null;
	public static double inputAccount = 0;
}

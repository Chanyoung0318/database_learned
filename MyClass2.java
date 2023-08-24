package com.human.ex1;
import java.util.Arrays;

import com.human.ex.Human;

public class MyClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Human h = new Human();
		
		h.name = "홍길동";
		
		System.out.println(h.name+h.age);*/
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		/*System.out.print("boolean입력 : ");
		String t = sc.nextLine();
		
		if(t.equals("true")) {
			System.out.println("true가 입력되었습니다");
		}
		else {
			System.out.println("true가 입력되지 않았습니다");
		}*/
		
		
		/*System.out.print("암호 입력 : ");
		int t = Integer.parseInt(sc.nextLine());
		
		if(t == 1004) {
			System.out.println("암호가 맞음");
		}
		else {
			System.out.println("암호가 틀림");
		}*/
		
		
		/*String t = sc.nextLine();
		
		if(t.equals("안녕")) {
			System.out.println("너도 안녕");
		}
		else if(t.equals("잘자")) {
			System.out.println("너도 잘자");
		}
		else if (t.equals("잘가")){
			System.out.println("너도 잘가");
		}
		else {
			System.out.println("잘못 입력됨");
		}*/
		
		/*int numbers[] = {1,2,3,4,5};
		
		int num1 = numbers[0];
		int num2 = numbers[2];
		System.out.println(num1+num2);
		
		numbers[1] = 10;
		System.out.println(java.util.Arrays.toString(numbers));

		numbers[3] = 8;
		System.out.println(java.util.Arrays.toString(numbers));*/
		
		
		/*int numbers[] = {10,20,30,40,50};
		
		int sum = 0;
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		double average = (double) sum / numbers.length;
		
		System.out.println("합계: "+sum);
		System.out.println("평균: "+average);*/ 
		
		//int arr1[] = {53,6,85,3,5};
		//System.out.print(java.util.Arrays.toString(arr1));
		
		
		/*int arr2[] = {12,1,53,6,85,3};
		int sum = 0;
		for(int i=0; i<arr2.length; i++) {
			sum += arr2[i];
		}
		System.out.println(sum);*/
		
		/*int i =0;
		it a[] = {1,2,3};
		for( i=0; i<a.length; i++) {
			a[i] = a[i] + 2;
		}
		System.out.println(java.util.Arrays.toString(a));
		
		int j = 0;
		int rea[] = {0,0,0};
		for (i = a.length - 1, j = 0; i >= 0; i--, j++) {
            rea[j] = a[i];
        }
		System.out.println(java.util.Arrays.toString(rea));
		
		/*int a[] = new int[5];
		int num = 0;
		int i =0;
		for(
				i=0; i<=a.length - 1; i++) {
			System.out.print(i+"인덱스 숫자 : ");
			num = Integer.parseInt(sc.nextLine());
			a[i] = num;
		}
		for(int j=0; j<a.length; j++) {
			if(a[j] % 2 == 0) {
				System.out.print(a[j]+" ");
			}
		}*/
		
		
		/*int a[] = new int[5];
		int num = 0;
		int i =0;
		for(
				i=0; i<=a.length - 1; i++) {
			System.out.print(i+"인덱스 숫자 : ");
			num = Integer.parseInt(sc.nextLine());
			a[i] = num;
		}
		for(int j=0; j<a.length; j++) {
			if(a[j] % 2 == 1) {
				System.out.print(a[j]+" ");
			}
		}*/
		
		
		/*Tree t[] = new Tree[4];
		
		for(int i=0; i<t.length; i++) {
			t[i]=new Tree();
			System.out.print(i+1+" 번째 나무 이름: ");
			t[i].name = sc.nextLine();
			System.out.print(i+1+" 번째 나무 가격: ");
			t[i].price = Integer.parseInt(sc.nextLine());
			System.out.print(i+1+" 번쨰 나무 자라는 시간: ");
			t[i].growTime= Integer.parseInt(sc.nextLine());
			System.out.print(i+1+" 번째 나무 경험치: ");
			t[i].exp = Integer.parseInt(sc.nextLine());
			System.out.print(i+1+" 번째 나무 현재 심은 수: ");
			t[i].presentTree = Integer.parseInt(sc.nextLine());
			System.out.print(i+1+" 번째 나무 최대 심을 수: ");
			t[i].maxTree = Integer.parseInt(sc.nextLine());
		}
		System.out.println(t[0].name+"\t"+t[1].name+"\t"+t[2].name+"\t"+t[3].name);

		System.out.println(t[0].price+"\t"+t[1].price+"\t"+t[2].price+"\t\t"+t[3].price);

		System.out.println(t[0].growTime+"\t"+t[1].growTime+"\t"+t[2].growTime+"\t\t"+t[3].growTime);

		System.out.println(t[0].exp+"\t"+t[1].exp+"\t"+t[2].exp+"\t\t"+t[3].exp);

		System.out.println(t[0].presentTree+"\t"+t[1].presentTree+"\t"+t[2].presentTree+"\t\t"+t[3].presentTree);

		System.out.println(t[0].maxTree+"\t"+t[1].maxTree+"\t"+t[2].maxTree+"\t\t"+t[3].maxTree);
		*/
		
		/*System.out.print("숫자 값 입력 : ");
		int input = Integer.parseInt(sc.nextLine());
		int a = 11;
		int b = 14;
		
		if(input == 0) {
			a=5;
		}else {
			b=a+3;
		}
		System.out.printf("a 값 : %d \nb 값 : %d",a,b);*/
		
		
		
		/*System.out.print("숫자 값 입력 : ");
		int input = Integer.parseInt(sc.nextLine());
		
		if(input<=-1) {
			input = input*-1;
		}
		System.out.printf("절대값 출력 : %d",input);*/
		
		
		
		/*System.out.print("숫자 값 입력 : ");
		int input = Integer.parseInt(sc.nextLine());
		if(input%126 == 0) {
			System.out.println("126의 약수 입니다.");
		}else {
			System.out.println("126의 약수가 아닙니다.");
		}*/
		
		
		
		/*System.out.print("국어 점수 입력 : ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어 점수 입력 : ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 점수 입력 : ");
		int mat = Integer.parseInt(sc.nextLine());
		if((kor+eng+mat)/3 >= 80) {
			System.out.print("합격");
		}else {
			System.out.print("불합격");
		}*/
		
		
		/*System.out.print("x값 입력 : ");
		int x = Integer.parseInt(sc.nextLine());
		if(x <= 5) {
			x = x+15;
		}else {
			x = x+5;
		}
		System.out.printf("값 출력 : %d",x);*/
		
		
		/*boolean b1 = 5 != 3;
		boolean b2 = 5 == 3;
		if(b1) {
			if(b2) {
				System.out.println("1번");
			}else {
				System.out.println("2번");
			}
		}else {
			System.out.println("3번");
			System.out.println("4번");
		}*/
		
		
		/*int a = 20;
		int b = 0;
		if(a >= 10) {
			a = b;
		}else {
			b = a;
		}
		System.out.printf("a값:%d, b값:%d",a,b);*/
		
		
		/*System.out.print("임의 값 입력 : ");
		int input = Integer.parseInt(sc.nextLine());
		if(input >= 10) {
			System.out.print("10보다 큰 수 입니다");
		}else {
			System.out.print("10보다 작은 수 입니다");
		}*/
		
		
		
		/*System.out.print("임의 값 입력 : ");
		int result = Integer.parseInt(sc.nextLine());
		if(result == 0) {
			System.out.print(0);
		}else {
			result = 1;
		}
		System.out.print(result);*/
		
		/*int result;
		System.out.print("첫번째 값 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 값 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		if(num1 > num2) {
			result = num1 - num2;
		}else {
			result = num2 - num1;
		}
		System.out.print(result);*/
		
		
		/*System.out.print("첫번째 값 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 값 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("세번째 값 입력 : ");
		int num3 = Integer.parseInt(sc.nextLine());
		if(num1>num2 && num1>num3) {
			System.out.print(num1);
		}else if(num2>num1 && num2>3) {
			System.out.print(num2);
		}else {
			System.out.print(num3);
		}*/
		
		
		/*System.out.print("값 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		if(num%2 == 0) {
			System.out.print("짝수");
		}else {
			System.out.print("홀수");
		}*/
		
		
		/*System.out.print("첫번째 값 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번쨰 값 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		if(num1%num2 == 0) {
			System.out.print("배수");
		}else {
			System.out.print("배수 아님");
		}*/
	
		
		
		/*int a,b;
		System.out.print("돈 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		a = num/500;
		b = (num%500)/100;
		System.out.printf("500원:%d개 100원:%d개",a,b);*/
		
		
		/*System.out.print("500원짜리 갯수 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("100원짜리 갯수 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		int sum = (num1*500) + (num2*100);
		System.out.print(sum);*/
		
		
		/*System.out.print("초 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		int time = num / 3600;
		int minute = num / 60;
		if(minute >= 60) {
			time +=1;
			minute -= 60;
		}
		int second = num% 60;
		System.out.printf("%d시 %d분 %d초",time, minute, second);*/
		
		
		/*System.out.print("시간 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("분 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("초 입력 : ");
		int num3 = Integer.parseInt(sc.nextLine());
		int result = (num1*3600)+(num2*60)+num3;
		System.out.printf("%d초",result);*/
		
		
		/*System.out.print("a 입력 : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("b 입력 : ");
		int b = Integer.parseInt(sc.nextLine());
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("a값 : %d  b값 : %d",a,b);*/
		
		
		/*System.out.print("값 입력 : ");
		int a = Integer.parseInt(sc.nextLine());
		if(a>10) {
			System.out.print("10보다 큼");
		}else {
			System.out.print("10보다 작음");
		}*/
		
		
		/*System.out.print("값 입력 : ");
		int a = Integer.parseInt(sc.nextLine());
		if(a>0) {
			System.out.print("양수");
		}else if(a == 0) {
			System.out.print("0");
		}else {
			System.out.print("음수");
		}*/
		
		/*int temp;
		int a,b,c;
		System.out.print("첫번째 값 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 값 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("세번째 값 입력 : ");
		int num3 = Integer.parseInt(sc.nextLine());
		if(num1<num2 && num1<num3) {
			a = num1;
			b = num2;
			c = num3;
		}else if(num2<num1 && num2<num3) {
			a = num2;
			b = num1;
			c = num3;
		}else {
			a = num3;
			b = num1;
			c = num2;
		}
		if(b>c) {
			temp = b;
			b = c;
			c = temp;
			
		}
		
		System.out.printf("a값 : %d, b값 : %d, c값 : %d",a,b,c);*/
		
		
		/*System.out.print("숫자 값 입력 : ");
		int input = Integer.parseInt(sc.nextLine());
		int a=5;
		int b=7;
		
		if(input == 0){
			a=a+2;
		}else if(input == 1) {
			b=b+4;
		}else if(input == 2) {
			a=a+b;
		}else {
			b=b+5;
		}
		System.out.printf("a값 : %d b값 : %d\n",a,b);
		
		switch(input) {
		case 0:
			a=a+2;
		break;
		case 1:
			b=b+4;
		break;
		case 2:
			a=a+b;
		break;
		default:
			b=b+5;
		}
		System.out.printf("a값 : %d b값 : %d",a,b);*/
		
		
		/*System.out.print("점수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(num >=90) {
			System.out.print("수");
		}else if(num>=80) {
			System.out.print("우");
		}else {
			System.out.println("미");
		}
		
		switch(num/10) {
		case 9:
			System.out.print("수");
		break;
		case 8:
			System.out.print("우");
		break;
		default:
			System.out.print("미");
		}*/
		
		
		/*System.out.print("1~5사이 숫자 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(num == 1) {
			System.out.print("일");
		}else if(num == 2) {
			System.out.print("이");
		}else if(num == 3) {
			System.out.print("삼");
		}else if(num == 4) {
			System.out.print("사");
		}else if(num == 5) {
			System.out.print("오");
		}
		switch(num) {
		case 1:
			System.out.print("일");
		break;
		case 2:
			System.out.print("이");
		break;
		case 3:
			System.out.print("삼");
		break;
		case 4:
			System.out.print("사");
		break;
		case 5:
			System.out.print("오");
		break;
		}*/

		
		/*System.out.print("월 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		if(num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10|| num == 12) {
			System.out.print("31일");
		}else if(num == 4 || num == 6 || num == 9 || num == 11) {
			System.out.print("30일");
		}else {
			System.out.print("28일");
		}
		switch(num) {
		case 1:
			System.out.print("31일");
		break;
		case 2:
			System.out.print("28일");
		break;
		case 3:
			System.out.print("31일");
		break;
		case 4:
			System.out.print("30일");
		break;
		case 5:
			System.out.print("31일");
		break;
		case 6:
			System.out.print("30일");
		break;
		case 7:
			System.out.print("31일");
		break;
		case 8:
			System.out.print("31일");
		break;
		case 9:
			System.out.print("30일");
		break;
		case 10:
			System.out.print("31일");
		break;
		case 11:
			System.out.print("30일");
		break;
		case 12:
			System.out.print("31일");
		break;
		}*/
		
		
		
		
		/*System.out.print("나이 입력 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		if(age <= 12 && age >=8) {
			System.out.print("초딩");
		}else if(age <= 16 && age >=14) {
			System.out.print("중딩");
		}else if(age <= 19 && age >=17) {
			System.out.print("고딩");
		}
		
		switch(age%10) {
		case 19:
			System.out.print("고딩");
		break;
		case 18:
			System.out.print("고딩");
		break;
		case 17:
			System.out.print("고딩");
		break;
		case 16:
			System.out.print("중딩");
		break;
		case 15:
			System.out.print("중딩");
		break;
		case 14:
			System.out.print("중딩");
		break;
		case 13:
			System.out.print("초딩");
		break;
		case 12:
			System.out.print("초딩");
		break;
		case 11:
			System.out.print("초딩");
		break;
		case 10:
			System.out.print("초딩");
		break;
		case 9:
			System.out.print("초딩");
		break;
		case 8:
			System.out.print("초딩");
		break;
		}
		*/
		
		
		
		
		/*System.out.print("값 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		if((num%3 == 0) || (num%7 == 0)) {
			System.out.print("3또는 7의 배수");
		}else if((num%2 == 0) && (num%5 == 0)) {
			System.out.print("2와 5의 배수");
		}else if(((num%2 == 0) && (num%5 == 0)) && ((num%3 == 0) || (num%7 == 0))) {
			System.out.print("둘다 만족");
		}else {
			System.out.print("없음");
		}*/
		
		
		/*System.out.print("x값 입력 : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y값 입력 : ");
		int y = Integer.parseInt(sc.nextLine());
		if(x<0 && y<0) {
			System.out.print("4번 위치");
		}else if(x>0 && y<0) {
			System.out.print("3번 위치");
		}else if(x>0 && y>0) {
			System.out.print("2번 위치");
		}else if(x<0 && y>0) {
			System.out.print("1번 위치");
		}else {
			System.out.print("정중앙");
		}*/
		
		
		/*System.out.print("나이 입력 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("카드 ? (true/false) : ");
		Boolean card = Boolean.parseBoolean(sc.nextLine());
		if(age >= 16 && card == true) {
			System.out.print("1500원");
		}else if(age >= 16) {
			System.out.print("1600원");
		}else if(age < 16 && card == true){
			System.out.print("1200원");
		}else {
			System.out.print("1300원");
		}*/
		
		
		
		/*System.out.print("밥 먹음? (true/false):");
		Boolean rice = Boolean.parseBoolean(sc.nextLine());
		if(rice == true) {
			System.out.print("밥을 먹었음");
		}*/
		
		/*System.out.print("빵 먹음? (true/false):");
		Boolean bread = Boolean.parseBoolean(sc.nextLine());
		if(bread == true) {
			System.out.print("빵을 먹었음");
		}else {
			System.out.print("밥을 먹었음");
		}*/
		
		/*System.out.print("밥 먹음? (true/false):");
		Boolean rice = Boolean.parseBoolean(sc.nextLine());
		if(rice == true) {
			System.out.print("밥을 먹었음");
		}else {
			System.out.print("빵을 먹었음");
		}*/
		
		/*System.out.print("밥 먹음? (true/false):");
		Boolean rice = Boolean.parseBoolean(sc.nextLine());
		if(rice == true) {
			System.out.print("밥을 먹었음");
		}else {
			System.out.print("아무것도 안먹었음");
		}*/
		
		
		/*System.out.print("밥? 빵? :");
		String meal = sc.nextLine();
		
		if(meal.equals("밥")) {
			System.out.print("후식으로 국, 아이스크림 택1");
		}else {
			System.out.print("후식으로 우유, 커피 택1");
		}*/
		
		
		
		/*int day = (new java.util.Date()).getDay();
		switch(day) {
		case 0:
			System.out.print("오늘은 일요일");
		break;
		case 1:
			System.out.print("오늘은 월요일");
		break;
		case 2:
			System.out.print("오늘은 화요일");
		break;
		case 3:
			System.out.print("오늘은 수요일");
		break;
		case 4:
			System.out.print("오늘은 목요일");
		break;
		case 5:
			System.out.print("오늘은 금요일");
		break;
		case 6:
			System.out.print("오늘은 토요일");
		break;
		
		}*/
		
		
		/*System.out.print("사이즈 입력 :");
		int size = Integer.parseInt(sc.nextLine());
		if(size >= 90 && size<=95) {
			System.out.print("미국 사이즈 S");
		}else if(size >= 95 && size<=100) {
			System.out.print("미국 사이즈 M");
		}else if(size >= 100 && size<=105) {
			System.out.print("미국 사이즈 L");
		}else if(size >= 105 && size<=120) {
			System.out.print("미국 사이즈 XL");
		}else if(size > 120) {
			System.out.print("미국 사이즈 XXL");
		}else {
			System.out.print("잘못된 사이즈");
		}*/
		
		
		/*System.out.print("자바 점수 입력 :");
		int ja = Integer.parseInt(sc.nextLine());
		System.out.print("html 점수 입력 :");
		int html = Integer.parseInt(sc.nextLine());
		System.out.print("db 점수 입력 :");
		int db = Integer.parseInt(sc.nextLine());
		if(ja<=46 || html <= 46 || db<=46) {
			System.out.print("과락");
		}else if(((ja+html+db)/3) >= 60) {
			System.out.print("합격");
		}else {
			System.out.print("불합격");
		}*/
		
		/*System.out.print("학생?(true/false) :");
		Boolean stu = Boolean.parseBoolean(sc.nextLine());
		System.out.print("키 입력 :");
		double he = Double.parseDouble(sc.nextLine());
		System.out.print("몸무게 입력 :");
		double kg = Double.parseDouble(sc.nextLine());
		double a = (kg/((he-100)*0.9))*100;
		if(stu==true && a<95) {
			System.out.print("체중미달");
		}else if(stu==true && a>=95 && a<=120) {
			System.out.print("정상");
		}else if(stu==true && a>=120 && a<=130) {
			System.out.print("경도비만");
		}else if(stu==true && a>=130 && a<150) {
			System.out.print("중도 비만");
		}else if(stu==true && a>=150) {
			System.out.print("고도 비만");
		}else if(stu==false && a<=100) {
			System.out.print("저체중");
		}else if(stu==false && a>=100 && a<=110) {
			System.out.print("정상");
		}else if(stu==false && a>=110 && a<=120) {
			System.out.print("과체중");
		}else if(stu==false && a>=120 && a<=150) {
			System.out.print("비만");
		}else if(stu==false && a>150) {
			System.out.print("고도 비만");
		}else {
			System.out.print("잘못 입력");
		}*/
		
		
		
		/*System.out.print("목 둘레(cm) 가슴 둘레 (cm) 팔 길이 (cm) 허리 둘레 (cm) 중 하나 입력 : ");
		int size = Integer.parseInt(sc.nextLine());
		if(size>=34 && size<=37) {
			System.out.println("목 허리중에 어느 부위?");
			String a = sc.nextLine();
			if(a.equals("허리")) {
				System.out.println("허리길이(cm) 미국 사이즈 기준 XL, 한국 사이즈 기준 105~120");
			}else if(size==34) {
				System.out.println("목둘레(cm) 미국 사이즈 기준 S, 한국 사이즈 기준 90~95");
			}
			else if(size>=36 && size<=37){
				System.out.println("목둘레(cm) 미국 사이즈 기준 M, 한국 사이즈 기준 95~100");
			}else {
				System.out.println("잘못 된 수치 입력");
			}
		}else if(size>=33 && size<=35) {
			System.out.println("목둘레(cm) 미국 사이즈 기준 S, 한국 사이즈 기준 90~95");
		}else if(size>=36 && size<=37) {
			System.out.println("목둘레(cm) 미국 사이즈 기준 M, 한국 사이즈 기준 95~100");
		}else if(size>=38 && size<=40) {
			System.out.println("목 허리중에 어느 부위?");
			String a = sc.nextLine();
			if(a.equals("허리")) {
				System.out.println("허리길이(cm) 미국 사이즈 기준 XXL, 한국 사이즈 기준 110이상");
			}else if(size>=38 && size<=39){
				System.out.println("목둘레(cm) 미국 사이즈 기준 L, 한국 사이즈 기준 100~105");
			}else {
				System.out.println("잘못 된 수치 입력");
			}
		}else if(size>=41 && size<=42) {
			System.out.println("목둘레(cm) 미국 사이즈 기준 XL, 한국 사이즈 기준 105~120");
		}else if(size>=43 && size<=45) {
			System.out.println("목둘레(cm) 미국 사이즈 기준 XXL, 한국 사이즈 기준 110이상");
		}else if(size>=84 && size<=86) {
			System.out.println("팔 가슴중에 어느 부위?");
			String a = sc.nextLine();
			if(a.equals("팔")) {
			System.out.println("팔길이(cm) 미국 사이즈 기준 L, 한국 사이즈 기준 100~105");
			}else if(size == 86) {
				System.out.println("가슴둘레(cm) 미국 사이즈 기준 S, 한국 사이즈 기준 90~95");
			}else {
				System.out.println("잘못 된 수치 입력");
				}
		}else if(size>=86 && size<=89) {
			System.out.println("팔 가슴중에 어느 부위?");
			String a = sc.nextLine();
			if(a.equals("팔")) {
			System.out.println("팔길이(cm) 미국 사이즈 기준 XL, 한국 사이즈 기준 105~120");
			}else {
				System.out.println("가슴둘레(cm) 미국 사이즈 기준 S, 한국 사이즈 기준 90~95");
			}
		}else if(size>=89 && size<=91) {
			System.out.println("팔 가슴중에 어느 부위?");
			String a = sc.nextLine();
			if(a.equals("팔")) {
			System.out.println("팔길이(cm) 미국 사이즈 기준 XXL, 한국 사이즈 기준 110이상");
			}else {
				System.out.println("가슴둘레(cm) 미국 사이즈 기준 S, 한국 사이즈 기준 90~95");
			}
		}else if(size>=86 && size<=91) {
			System.out.println("가슴둘레(cm) 미국 사이즈 기준 S, 한국 사이즈 기준 90~95");
		}else if(size>=96 && size<=102) {
			System.out.println("가슴둘레(cm) 미국 사이즈 기준 M, 한국 사이즈 기준 95~100");
		}else if(size>=107 && size<=112) {
			System.out.println("가슴둘레(cm) 미국 사이즈 기준 L, 한국 사이즈 기준 100~105");
		}else if(size>=117 && size<=122) {
			System.out.println("가슴둘레(cm) 미국 사이즈 기준 XL, 한국 사이즈 기준 105~120");
		}else if(size>=127 && size<=132) {
			System.out.println("가슴둘레(cm) 미국 사이즈 기준 XXL, 한국 사이즈 기준 110이상");
		}else if(size>=78 && size<=81) {
			System.out.println("팔길이(cm) 미국 사이즈 기준 S, 한국 사이즈 기준 90~95");
		}else if(size>=81 && size<=84) {
			System.out.println("팔길이(cm) 미국 사이즈 기준 M, 한국 사이즈 기준 95~100");
		}else if(size>=28 && size <=29) {
			System.out.println("허리둘레(cm) 미국 사이즈 기준 S, 한국 사이즈 기준 90~95");
		}else if(size>=30 && size <=31) {
			System.out.println("허리둘레(cm) 미국 사이즈 기준 L, 한국 사이즈 기준 100~105");
		}else if(size>=32 && size <=33) {
				System.out.println("허리길이(cm) 미국 사이즈 기준 L, 한국 사이즈 기준 100~105");
		}*/
			
		
		
		/*System.out.print("첫번째수 입력>>");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자 선택1.+ 2.- 3.* 4./ >>");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째수 입력>>");
		int num3 = Integer.parseInt(sc.nextLine());
		
		int result;
		switch(num2) {
		case 1:
			result=num1+num3;
			System.out.printf("%d+%d=%d 입니다",num1, num3, result);
		break;
		case 2:
			result=num1-num3;
			System.out.printf("%d-%d=%d 입니다",num1, num3, result);
		break;
		case 3:
			result=num1*num3;
			System.out.printf("%d*%d=%d 입니다",num1, num3, result);
		break;
		case 4:
			result=num1/num3;
			System.out.printf("%d/%d=%d 입니다",num1, num3, result);
		break;
		}*/
		
		
		
		
		/*System.out.print("1.가위 2.바위 3.보 입력>>");
		int user = Integer.parseInt(sc.nextLine());
		
		int a = (int)(Math.random()*3+1);
		if(user == a) {
			System.out.print("비겼다");
		}else if(user==1 && a==2) {
			System.out.print("바위. 졌다");
		}else if(user==1 && a==3) {
			System.out.print("보. 이겼다");
		}else if(user==2 && a==1) {
			System.out.print("가위. 이겼다");
		}else if(user==2 && a==3) {
			System.out.print("보. 졌다");
		}else if(user==3 && a==1) {
			System.out.print("가위. 졌다");
		}else if(user==3 && a==2) {
			System.out.print("바위. 이겼다");
		}*/
		
		
		
		/*for(int i=0; i<=10; i++) {
			int a = (int)(Math.random()*5+6);
			System.out.print(a);
			System.out.print(" ");
		}*/
		
		
		/*for(int i=0; i<=10; i++) {
			int a = (int)(Math.random()*45+1);
			System.out.print(a);
			System.out.print(" ");
		}*/
		
		
		/*int a = (int)(Math.random()*3+1);
		if(a == 1) {
			System.out.print("가위");
		}else if(a == 2) {
			System.out.print("바위");
		}else {
			System.out.print("보");
		}*/
		
		
		
		
		/*System.out.print("소득금맥 입력(만원 단위)>>");
		int user = Integer.parseInt(sc.nextLine());
		double result = 0;
		
		if(user<=1200) {
			result =(user*10000)*0.06;
		}else if(user>1200 && user<=4600) {
			result = (user*10000)*0.15+ 12000000*0.06-12000000*0.15;
		}else if(user>4600 && user<=8800) {
			result = (user*10000)*0.24 + 12000000*0.06-12000000*0.24;
		}else if(user>8800 && user<=15000) {
			result = (user*10000)*0.35 + 12000000*0.06-12000000*0.35;
		}else if(user>15000 && user<=30000) {
			result = (user*10000)*0.38 + 12000000*0.06-12000000*0.38;
		}else if(user>30000 && user<=50000) {
			result = (user*10000)*0.40 + 12000000*0.06-12000000*0.40;
		}else if(user>=50000) {
			result = (user*10000)*0.42 + 12000000*0.06-12000000*0.42;
		}else {
			System.out.println("잘못된 금액 입력");
		}
		System.out.printf("내야할 세금 : %f만원", result/10000);*/
		
		
		
		/*int a = 1;
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);*/
		
		/*int a = 1;
		System.out.println(1);
		if(a==1) {
			System.out.println(a+1);
		}
		System.out.println(4);*/
		
		/*int a = 1;
		System.out.println(1);
		if(a==1) {
			System.out.println(a+2);
		}
		System.out.println(4);*/
		
		/*int a = 0;
		System.out.println(1);
		while(a>0) {
			System.out.println(a+1);
			break;
		}
		System.out.println(3);*/
		
		
		/*int a = 0;
		System.out.println(1);
		while(a==0) {
			System.out.println(a+2);
			break;
		}
		System.out.println(3);*/
		
		
		/*int a = 0;
		System.out.println(1);
		for(a=1; a<=3; a++) {
			System.out.println(2);
		}
		System.out.println(3);*/
		
		
		/*int a=1;
		System.out.println(1);
		for(a=1; a<=1; a++) {
			System.out.println(2);
		}
		System.out.println(3);
		System.out.println(4);
		for(a=1; a<=1; a++) {
			System.out.println(11);
		}
		System.out.println(5);
		if(a==1) {
			System.out.println(7);
			System.out.println(8);
		}else {
			System.out.println(6);
		}
		System.out.println(9);
		System.out.println(10);*/
		
		
		
		/*int a=2;
		int b=1;
		b++;
		System.out.println(a+" "+b);
		while(b<15) {
			a=a+1;
			b=b+a;
		}
		System.out.println(a+" "+b);*/
		
		
		/*int a=0;
		String str;
		System.out.println("p1");
		while(a==1) {
			System.out.println("p2");
			break;
		}
		System.out.println("p3");
		if(a==0) {
			System.out.println("p4");
			str = "p4";
		}else {
			System.out.println("p6");
			str = "p6";
		}
		if(str.equals("p4")) {
			System.out.println("p5");
		}else {
			System.out.println("p7");
		}
		
		System.out.println("p8");
		System.out.println("p9");*/
		
		/*int a=0;
		String str;
		System.out.println("p1");
		while(a==0) {
			System.out.println("p2");
			break;
		}
		System.out.println("p3");
		if(a==1) {
			System.out.println("p4");
			str = "p4";
		}else {
			System.out.println("p6");
			str = "p6";
		}
		if(str.equals("p4")) {
			System.out.println("p5");
		}else {
			System.out.println("p7");
		}
		
		System.out.println("p8");
		System.out.println("p9");*/
		
		/*int a=0;
		String str;
		System.out.println("p1");
		for(a=0; a<=2; a++)
		System.out.println("p2");
		System.out.println("p3");
		if(a==3) {
			System.out.println("p4");
			str = "p4";
		}else {
			System.out.println("p6");
			str = "p6";
		}
		if(str.equals("p4")) {
			System.out.println("p5");
		}else {
			System.out.println("p7");
		}
		
		System.out.println("p8");
		System.out.println("p9");*/
		
		/*int result=0;
		for(int i=0; i<10; i++) {
			result = result+3;
			System.out.print(result+" ");
		}*/
		
		
		/*int result=3;
		do {
			System.out.print(result+" ");
			result++;
		}while(result<=10);*/
		

		/*int sum=0;
		for(int i=15; i<=30; i++) {
			sum += i;
		}
		System.out.print(sum);*/
		
		
		/*System.out.print("1~9 숫자 입력 : ");
		int a = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n",a,i,a*i);
		}*/
		
		
		/*int a = 3;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<=10);
		while(a<=10) {
			System.out.print(a+" ");
			a++;
		}
		
		for(int i=3; i<=10; i++) {
			System.out.print(a+" ");
			a++;
		}*/
		
		
		
		
		/*int b=0;
		int a=9;
		do {
			b+=a;
			a++;
		}while(a<=30);
		System.out.print(b);
		
		while(a<=30) {
			b+=a;
			a++;
		}
		System.out.print(b);
		
		for(int i=9; i<=30; i++) {
			b+=a;
			a++;
		}
		System.out.print(b);*/
		
		
		/*int a = 1;
		int b=0;
		for(b=0; b<90; a++) {
			b+=a;
			System.out.println(a+":"+b);
		}*/
		
		
		/*System.out.print("출력하고 싶은 문자열 입력>>");
		String a = sc.nextLine();
		System.out.print("출력하고 싶은 횟수 입력>>");
		int b = Integer.parseInt(sc.nextLine());
		int c = 1;
		do {
			System.out.println(a);
			c++;
		}while(c <= b);*/
		
		
		
		
		/*System.out.print("첫번째 숫자 입력>>");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자 입력>>");
		int b = Integer.parseInt(sc.nextLine());
		int result=0;
		for(int i=a+1; i<b; i++) {
			result += i;
		}
		System.out.print(result);*/
		
		
		/*System.out.print("첫번째 숫자 입력>>");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자 입력>>");
		int b = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=b; a++,i++) {
			System.out.print(a+" ");
		}*/
		
		
		/*String a;
		while(true) {
			System.out.println("종료를 입력해줘");
			a = sc.nextLine();
			if(a.equals("종료")) {
				break;
			}else {
				continue;
			}
		}*/
		
		
		
		/*for(int i=1; i<=100; i++) {
			if(100%i == 0) {
				System.out.print(i+" ");
			}else {
				continue;
			}
		}*/
		
		
		
		/*System.out.print("첫번째 숫자 입력>>");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자 입력>>");
		int b = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=a+b; i++) {
			if(a%i == 0 && b%i == 0) {
				System.out.print(i+" ");
			}
		}*/
		
		
		
		
		/*System.out.print("첫번째 숫자 입력>>");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자 입력>>");
		int b = Integer.parseInt(sc.nextLine());
		int result = 0;
		int c = 1;
		int i;
		for(i=1; i<=a+b; i++) {
			if(a%i == 0 && b%i == 0) {
				result = i;
			}
		}
		System.out.print(result);*/
		
		/*int b = 0;
		while(b<=100) {
			System.out.print("더할 숫자 입력>>");
			int a = Integer.parseInt(sc.nextLine());
			b+=a;
		}
		System.out.print(b);*/
		
		
		/*int a=0;
		int b=0;
		
		while(a<3) {
			System.out.print("1~10 사이 숫자 입력>>");
			int c = Integer.parseInt(sc.nextLine());
			if(c>=1  && c<=10) {
				a++;
			}else {
				b++;
			}
		}
		System.out.printf("제대로 입력한 횟수:%d 잘못 입력한 횟수:%d",a,b);*/
		
		
		
		/*int a = 0;
		int c = 0;
		while(a<10) {
			if(c%4==0) {
				System.out.print(c+" ");
				a++;
			}
			c++;
		}*/
		
	}
}

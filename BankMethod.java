package com.human.ex1;

public class BankMethod {
	public static void init() {
		BankArray b = new BankArray();
		BankArray.id[0] = "user1";
		BankArray.pw[0] = "user1";
		BankArray.account[0] = 1000;
		BankArray.id[1] = "user2";
		BankArray.pw[1] = "user2";
		BankArray.account[1] = 2000;
		BankArray.id[2] = "user3";
		BankArray.pw[2] = "user3";
		BankArray.account[2] = 3000;
		BankArray.totalUserCount = 3;
	}

	public static void login() {
		BankArray.loginUserStatus = BankArray.STATE_LOGOUT;
		boolean log = true;
		// 로그인 작업
		while (log) {
			System.out.println("아이디와 pw를 입력하세요. 종료하고 싶으면 EXIT를 입력하세요");
			System.out.println("id>>");
			BankArray.inputId = BankArray.sc.nextLine();
			if (BankArray.inputId.equals("EXIT")) {
				BankArray.loginUserStatus = BankArray.STATE_EXIT;
				log = false;
			} else {
				System.out.println("pw>>");
				BankArray.inputPw = BankArray.sc.nextLine();
			}
			boolean isFindUser = false;
			for (int i = 0; i < BankArray.totalUserCount; i++) {
				if (BankArray.id[i].equals(BankArray.inputId)) {
					if (BankArray.pw[i].equals(BankArray.inputPw)) {

						System.out.println(BankArray.id[i] + "님 로그인 하셨습니다.");
						BankArray.loginUserIndex = i;
						BankArray.loginUserStatus = BankArray.STATE_USER_LOGIN;
						log = false;
					} else {
						System.out.println("잘못된 패스워드 입력");
					}
					isFindUser = true;
					break;
				}
			}
			if (!isFindUser) {
				if (BankArray.inputId.equals("EXIT")) {
					BankArray.loginUserStatus = BankArray.STATE_EXIT;
					log = false;
				} else if (BankArray.adminId.equals(BankArray.inputId) && BankArray.adminPw.equals(BankArray.inputPw)) {
					// System.out.println("관리자로 로그인 하였습니다.");
					BankArray.loginUserStatus = BankArray.STATE_ADMIN_LOGIN;
					log = false;
				} else {
					System.out.println("없는 아이디 입니다. 다시 입력해주세요");
				}
			}

		}
	}

	public static void userMenu() {
		System.out.println("사용자 관련 작업메뉴");
		boolean isUseMenu = true;
		while (isUseMenu) {
			System.out.println("1.입금 2.출금 3.잔액 조회 4.종료 입력>>");
			switch (BankArray.sc.nextLine()) {
			case "1":
				System.out.println("입금액 입력>>");
				BankArray.inputAccount = Double.parseDouble(BankArray.sc.nextLine());
				BankArray.account[BankArray.loginUserIndex] += BankArray.inputAccount;
				System.out.println(
						BankArray.id[BankArray.loginUserIndex] + "님 잔액:" + BankArray.account[BankArray.loginUserIndex]);
				break;
			case "2":
				System.out.println("출금액 출력>>");
				BankArray.inputAccount = Double.parseDouble(BankArray.sc.nextLine());
				if (BankArray.account[BankArray.loginUserIndex] - BankArray.inputAccount < 0) {
					System.out.println("현재 잔고량이 부족하여 출금에 실패했습니다.");
				} else {
					BankArray.account[BankArray.loginUserIndex] -= BankArray.inputAccount;
				}

				System.out.println(
						BankArray.id[BankArray.loginUserIndex] + "님 잔액:" + BankArray.account[BankArray.loginUserIndex]);
				break;
			case "3":
				System.out.println("잔액 조회>>");
				System.out.println(
						BankArray.id[BankArray.loginUserIndex] + "님 잔액:" + BankArray.account[BankArray.loginUserIndex]);
				break;
			case "4":
				System.out.println("사용자 메뉴 종료");
				BankArray.loginUserStatus = BankArray.STATE_LOGOUT;
				isUseMenu = false;
				break;
			}
		}
	}

	public static void adminMenu() {
		System.out.println("관리자로 로그인 하였습니다.");
		boolean isAdmMenu = true;
		while (isAdmMenu) {
			System.out.println("1.계정추가 2.계정삭제 3.id변경 4.모든 사용자 출력 5.종료");
			switch (BankArray.sc.nextLine()) {
			case "1":
				System.out.println("추가할 id>>");
				BankArray.inputId = BankArray.sc.nextLine();
				System.out.println("추가할 pw>>");
				BankArray.inputPw = BankArray.sc.nextLine();
				BankArray.id[BankArray.totalUserCount] = BankArray.inputId;
				BankArray.pw[BankArray.totalUserCount] = BankArray.inputPw;
				BankArray.account[BankArray.totalUserCount] = 100;
				System.out.println(BankArray.id[BankArray.totalUserCount] + "게정생성");
				BankArray.totalUserCount++;
				break;
			case "2":
				System.out.println("삭제할 id>>");
				BankArray.inputId = BankArray.sc.nextLine();
				int findIndex = BankArray.totalUserCount;
				for (int i = 0; i < BankArray.totalUserCount; i++) {
					if (BankArray.id[i].equals(BankArray.inputId)) {
						findIndex = i;
					}
				}
				for (int i = findIndex; i < BankArray.totalUserCount - 1; i++) {
					BankArray.id[i] = BankArray.id[i + 1];
					BankArray.pw[i] = BankArray.pw[i + 1];
					BankArray.account[i] = BankArray.account[i + 1];
				}
				BankArray.totalUserCount--;
				break;
			case "3":
				System.out.println("변경할 id>>");
				BankArray.inputId = BankArray.sc.nextLine();
				for (int i = 0; i < BankArray.totalUserCount; i++) {
					if (BankArray.id[i].equals(BankArray.inputId)) {
						System.out.println("변경할 id>>");
						BankArray.id[i] = BankArray.sc.nextLine();
						System.out.println("변경할 pw>>");
						BankArray.pw[i] = BankArray.sc.nextLine();
					}
				}
				break;
			case "4":
				System.out.println("출력 시작");
				for (int i = 0; i < BankArray.totalUserCount; i++) {
					System.out.print(i + "번째 id>>" + BankArray.id[i]);
					System.out.print("pw>>" + BankArray.pw[i]);
					System.out.println("account>>" + BankArray.account[i]);
				}
				System.out.println("모두 출력");
				break;
			case "5":
				System.out.println("관리자 메뉴 종료");
				BankArray.loginUserStatus = BankArray.STATE_LOGOUT;
				isAdmMenu = false;
				break;
			}
		}
	}

	public static void playBank() {
		boolean isUseMain = true;
		while (isUseMain) {
			login();
			switch (BankArray.loginUserStatus) {
			case BankArray.STATE_LOGOUT:
				break;
			case BankArray.STATE_USER_LOGIN:
				userMenu();
				break;
			case BankArray.STATE_ADMIN_LOGIN:
				adminMenu();
				break;
			default:
				break;

			}
			System.out.println("새로 시작하시겠습니까? true or false");
			isUseMain = Boolean.parseBoolean(BankArray.sc.nextLine());
		}
	}
}

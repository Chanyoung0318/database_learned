package com.human.ex1;

public class BlackjackGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 카드 묶음
		// deck은 카드를 저장할 수 있는 공간
		// deck에 들어 있는 0~51까지의 숫자는 실제 카드정보
		int deck[] = new int[52];
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}

		// 카드 정보
		/*
		 * for(int i=0; i<deck.length; i++) { System.out.println(deck[i]); }
		 */

		// 사람이 알아보기 쉬운 카드정보 숫자 -> 카드정보 문자열로 변경하기
		String cardShape[] = { "하트", "스페이드", "다이아몬드", "클로버" };
		String cardNumber[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		// 카드정보 문자열 구현
		/*
		 * for(int i=0; i<deck.length; i++) {
		 * System.out.println(cardShape[deck[i]/13]+cardNumber[deck[i]%13]); }
		 */
		// 카드 섞기
		for (int i = 0; i <= 900000; i++) {
			int rand = (int) (Math.random() * 52);
			int temp = deck[0];
			deck[0] = deck[rand];
			deck[rand] = temp;
		}
		// 섞은 카드 확인
		/*
		 * for(int i=0; i<deck.length; i++) {
		 * System.out.println(deck[i]+":"+cardShape[deck[i]/13]+cardNumber[deck[i]%13]);
		 * }
		 */

		int deckIndex = 0; // deck 카드묶음에서 카드 사용 유무 구분 인덱스
		int p1Deck[] = new int[11];
		int p2Deck[] = new int[11];
		int p1Index = 0;
		int p2Index = 0;

		p1Deck[p1Index] = deck[deckIndex];
		p1Index++;
		deckIndex++;

		p2Deck[p2Index] = deck[deckIndex];
		p2Index++;
		deckIndex++;

		p1Deck[p1Index] = deck[deckIndex];
		p1Index++;
		deckIndex++;

		p2Deck[p2Index] = deck[deckIndex];
		p2Index++;
		deckIndex++;

		/*
		 * for(int i=0; i<deckIndex; i++) {
		 * System.out.println(cardShape[deck[i]/13]+cardNumber[deck[i]%13]); }
		 * 
		 * System.out.println(cardShape[deck[4]/13]+cardNumber[deck[4]%13]+"\n\n");
		 * 
		 * for(int i=deckIndex; i<deck.length; i++) {
		 * System.out.println(cardShape[deck[i]/13]+cardNumber[deck[i]%13]); }
		 * System.out.print("\n\n");
		 * 
		 * //for(int i=0; i<deckIndex; i++) {
		 * //System.out.println(cardShape[deck[4+i]/13]+cardNumber[deck[4+i]%13]); //}
		 * 
		 * for(int i=0; i<p1Index; i++) {
		 * System.out.println(cardShape[p1Deck[i]/13]+cardNumber[p1Deck[i]%13]); }
		 * 
		 * for(int i=0; i<p2Index; i++) {
		 * System.out.println(cardShape[p2Deck[i]/13]+cardNumber[p2Deck[i]%13]); }
		 */

		int p1Sum = 0;
		int p2Sum = 0;
		boolean p1Flag = true;
		boolean p2Flag = true;

		while (p1Flag || p2Flag) {
			if (p1Flag) {
				System.out.println("p1님 카드를 더 받으시겠습니까? 1. yes 2.no");
				String input = new java.util.Scanner(System.in).nextLine();
				if (input.equals("1")) {
					p1Deck[p1Index++] = deck[deckIndex++];

				} else {
					p1Flag = false;
				}
			}

			if (p2Flag) {
				System.out.println("p2님 카드를 더 받으시겠습니까? 1. yes 2.no");
				String input = new java.util.Scanner(System.in).nextLine();
				if (input.equals("1")) {
					p2Deck[p2Index++] = deck[deckIndex++];
				} else {
					p2Flag = false;
				}
			}

			System.out.print("p1Card:  ");
			p1Sum = 0;
			for (int i = 0; i < p1Index; i++) {
				if (p1Deck[i] % 13 < 1) {
					p1Sum = p1Sum + 11;
				} else if (p1Deck[i] % 13 < 10) {
					p1Sum = p1Sum + p1Deck[i] % 13 + 1;
				} else {
					p1Sum = p1Sum + 10;
				}
			}

			for (int i = 0; i < p1Index; i++) {
				if (p1Sum <= 21) {
					break;
				}
				if (p1Deck[i] % 13 == 0) {
					p1Sum = p1Sum - 10;
				}
			}

			System.out.println("총합 : " + p1Sum);
			for (int i = 0; i < p1Index; i++) {
				System.out.print(cardShape[p1Deck[i] / 13] + cardNumber[p1Deck[i] % 13] + " ");
			}
			System.out.println();
			if (p1Sum > 21) {
				System.out.println("21을 초과하였습니다.");
				break;
			}

			System.out.print("p2card:  ");
			p2Sum = 0;
			for (int i = 0; i < p2Index; i++) {
				if (p2Deck[i] % 13 < 1) {
					p2Sum = p2Sum + 11;
				} else if (p2Deck[i] % 13 < 10) {
					p2Sum = p2Sum + p2Deck[i] % 13 + 1;
				} else {
					p2Sum = p2Sum + 10;
				}
			}
			for (int i = 0; i < p2Index; i++) {
				if (p2Sum <= 21) {
					break;
				}
				if (p2Deck[i] % 13 == 0) {
					p2Sum = p2Sum - 10;
				}
			}
			System.out.println("총합 : " + p2Sum);
			for (int i = 0; i < p2Index; i++) {
				System.out.print(cardShape[p2Deck[i] / 13] + cardNumber[p2Deck[i] % 13] + " ");
			}
			System.out.println();
			if (p2Sum > 21) {
				System.out.println("21을 초과하였습니다");
				break;
			}

		}

		String winner = "";
		if (p1Sum > 21) {
			winner = "p2승리";
		} else if (p2Sum > 21) {
			winner = "p1승리";
		} else if (p1Sum > p2Sum) {
			winner = "p1승리";
		} else if (p1Sum == p2Sum) {
			winner = "무승부";
		} else {
			winner = "p2승리";
		}
		System.out.println("최종결과:" + winner);
		System.out.println("게임종료");

	}

}

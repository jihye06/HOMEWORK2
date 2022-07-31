package com.example.demo;

import java.util.Scanner;

public class AlTest3 {

	public static void main(String[] args) {

		int peoNum;
		int dist;
		System.out.printf("HELLO~~\n\n");
		
		CircularLinkedList<Integer> list = new CircularLinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사람수를 입력하세요\n");
		peoNum = Integer.parseInt(sc.next());
		System.out.println("이동거리를 입력하세요");
		dist = Integer.parseInt(sc.next());
		
		for(int i=1; i<= peoNum; i++) {
			list.LInsert(i);
		}

		list.LFirst();
		while(list.LCount() > 1) {			
			
			for(int i=1; i<=dist; i++) {
				
				if(i % dist == 0) list.LRemove();				
				list.LNext();
			}
		}
		
		if(list.LFirst()) {
			list.printListNode();
			
		}
		
	}

}

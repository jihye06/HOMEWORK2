package com.example.demo;

import java.util.Scanner;

public class AlTest2 {
		public static void main(String[] args) {
			String arrNum; //배열 데이터				
			String prtNum; //배열 데이터				
			int hNum; //가로줄
			int vNum; //세로줄
			
			Scanner sc = new Scanner(System.in);
			System.out.println("가로열을 입력하세요");
			hNum = Integer.parseInt(sc.next());
			System.out.println("세로열을 입력하세요");
			vNum = Integer.parseInt(sc.next());
			System.out.println("배열 데이터를 입력하세요");
			arrNum = sc.next();	
			String[] arrNumArray = arrNum.split(",");
			System.out.println("회전 명령어를 입력하세요");
			String rot = sc.next();	
			System.out.println("출력할 배열위치를 입력하세요");
			prtNum = sc.next();	
			String[] prtNumArray = prtNum.split(",");
			
			int[][] map = new int[hNum][vNum];
			
			int cnt = 0;
			for(int i=0; i<hNum; i++) {
				for(int j=0; j<map[i].length; j++) {
					map[i][j] = Integer.parseInt(arrNumArray[cnt++]);
				}
			}
			
//			print(map);

			int n = 0;
			while(n < rot.length()) {
				switch(String.valueOf(rot.charAt(n))) {
					case "R" : 	map = rotateMatR(hNum, vNum, map);
								//print(map);
								break;
					case "L" : 	map = rotateMatL(hNum, vNum, map);
								//print(map);
								break;
					case "T" : 	map = rotateMatT(hNum, vNum, map);
								//print(map);
								break;	
					default  : 	System.out.println("문자불일치");		
								break;
				}
			n++;		
			}
			
			int a = Integer.parseInt(prtNumArray[1]);
			int b = Integer.parseInt(prtNumArray[0]);
			System.out.println("\n======================================");
			
			for (int i = 0; i < map.length; i++) {
			    for (int j = 0; j < map[i].length; j++) {
			        if(i == a-1 && j == b-1)  	System.out.print("출력 : " + map[i][j]);
			    }
			}		
		}

		static void print(int[][] map) {

			for (int i = 0; i < map.length; i++) {
			    for (int j = 0; j < map[i].length; j++) {
			        System.out.print(map[i][j] + " ");
			    }
			    System.out.println();
			}		
			
		}
		
		static int[][] rotateMatR(int row, int col, int[][] mat) {

			int[][] temp = new int[row][col];

			// temp 시계방향 90도 회전
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					temp[j][row-i-1] = mat[i][j];
				}
			}
			
//			System.out.println("----- After 90 degree rotate(right) -----\n");
			return temp;
		}		

		static int[][] rotateMatL(int row, int col, int[][] mat) {

			int[][] temp = new int[row][col];

			// temp 반시계방향 90도 회전
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					temp[row-j-1][i] = mat[i][j];
				}
			}
			
//			System.out.println("----- After 90 degree rotate(left) -----\n");
			return temp;
		}	

		static int[][] rotateMatT(int row, int col, int[][] mat) {

			int[][] temp = new int[row][col];

			// temp 뒤집기
	        for(int i=0; i<row; i++){
	            for(int j=0; j<col; j++){
	            	temp[i][j] = mat[i][row-j-1];
	            }
	        }
			
//			System.out.println("----- After 뒤집기 rotate -----\n");
			return temp;
		}	
}

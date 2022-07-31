package com.example.demo;

import java.util.Scanner;

public class AlTest1 {
	 
	int hNum; //가로줄
	int vNum; //세로줄
	int [][] map;  //숫자를 채울 배열
	
	public static void main(String[] args) {
		String arrNum; //배열 데이터				
		Scanner sc = new Scanner(System.in);
		System.out.println("가로열을 입력하세요");
		int hNum = Integer.parseInt(sc.next());
		System.out.println("세로열을 입력하세요");
		int vNum = Integer.parseInt(sc.next());
		System.out.println("배열 데이터를 입력하세요");
		arrNum = sc.next();	
		String[] arrNumArray = arrNum.split(",");
		
		int[][] map = new int[hNum][vNum];
		
		int cnt = 0;
		for(int i=0; i<hNum; i++) {
			for(int j=0; j<map[i].length; j++) {
				map[i][j] = Integer.parseInt(arrNumArray[cnt++]);
			}
		}
			
		for (int i = 0; i < map.length; i++) {
		    for (int j = 0; j < map[i].length; j++) {
		        System.out.print(map[i][j] + " ");
		    }
		    System.out.println();
		}		
		
		System.out.println("======================================");

		int k = 0;
	    while ( k < cnt )
	    {
	    	if( k % 2 == 1){ //0부터 시작하는 행 인덱스 기준 홀수일때 좌측에서 우측상단으로 채우기

	    		for (int i = 0; i < vNum; i++) 
	    		{
	    			for (int j = 0; j < hNum; j++) 
	    			{
	    				if (i + j == k)		System.out.print(map[i][j] + ", ");	    					
	    			}
	    		}
	    	}else {
	    		for (int i = 0; i < vNum; i++) 
	    		{
	    			for (int j = 0; j < hNum; j++) 
	    			{
	    				if (i + j == k)		System.out.print(map[j][i] + ", ");
	    			}
	    		}	
	    	}
	    	k++;
	    }
		//1,2,3,4,5,6,7,8,9
  
	}
	

}

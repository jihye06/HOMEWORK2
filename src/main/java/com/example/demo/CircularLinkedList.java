package com.example.demo;

public class CircularLinkedList<T> {

	private class Node {
		private T data;
		private Node nextLink;

		private Node() {
			this.data = null;
			this.nextLink = null;
		}

		private Node(T data) {
			this.data = data;
			this.nextLink = null;
		}
	}

	private Node tail;
	private Node cur;
	private Node before;
	private int numOfData;
	private T data;

	public CircularLinkedList() {
		this.tail = null;
		this.cur = null;
		this.before = null;
		this.numOfData = 0;
	}

	/*
	 * 리스트에 데이터 저장(tail에 노드추가)
	 */
	public void LInsert(T data) {
		Node newNode = new Node(data);
		if (tail == null) {
			tail = newNode;
			newNode.nextLink = newNode;
		} else {
			newNode.nextLink = tail.nextLink;
			tail.nextLink = newNode;
			tail = newNode;
		}

		numOfData++;
	}

	/*
	 * 탐색초기화
	 */
	public boolean LFirst() {
		if (tail == null) {
			return false;
		}

		before = tail;
		cur = tail.nextLink;
		data = cur.data;
		return true;
	}

	/*
	 * 두번째이후 데이터 참조
	 */
	public boolean LNext() {
		if (tail == null) {
			return false;
		}

		before = cur;
		cur = cur.nextLink;
		data = cur.data;
		return true;
	}

	/*
	 * 참조한데이터 삭제
	 */
	public T LRemove() {
		Node rpos = cur;
		T rdata = rpos.data;
		if(cur == tail) {
			
			if(tail == tail.nextLink) {
				tail = null;
			}else {
				tail = before;
			}
		}
		
		before.nextLink = cur.nextLink;
		cur = before;
		numOfData--;
		return rdata;
	}
	
		/*
		 * 저장되어있는 데이터 수
		 */	
	public int LCount() {
		return numOfData;
	}

	/*
	 * 연결된 노드들을 순서대로 출력
	 */
	public void printListNode() {
        
        if (data != null) {
            System.out.print("마지막에 남는 사람번호는 " + data + "입니다.");
        }

        System.out.println();
    }

}

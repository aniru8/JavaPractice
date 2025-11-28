package com.example.Day6Stream_DS;

public class CircularQueue {
	
	private static int front=-1;
	private static int rear=-1;
	
	private static int cq[]= new int[10];
	
	public static boolean isEmpty() {
		return rear==-1;
	}
	
	public static boolean isFull() {
		return (rear+1)%10==front;
	}
	
	public static void insert(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else
		{
			if(rear==-1){
				front=0;
				rear=(rear+1)%10;
				cq[++rear]=data;
				System.out.println(data+" inserted successfully");
			}
		}
	}
	public static void delete() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}	
			else {
				System.out.println(cq[front]+" deleted successfully");
				if(front==rear)
					front=rear=-1;
				else
					front=(front+1)%10;
		}
	}
	public static void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else
			for(int i=front;i!=rear;i=(i+1)%10)
				System.out.println(cq[i]);
		System.out.println(cq[rear]);
	}
	
	public static void main(String[] args) {
	//delete();
	insert(10);
	display();
	
	
	}
}

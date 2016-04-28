package cn.edu.qdu.game;

import java.util.Scanner;

public class Computer extends Player {
	String name;
	 String choice;
	public String inputName() {
		System.out.print("请选择对方角色：(1：刘备 2：孙权 3：曹操):");
		
		boolean flag=true;
		while(flag){
		Scanner input = new Scanner(System.in);
		int role = input.nextInt();
		switch (role) {
		case 1:
			name="刘备";
			flag=false;
			break;
			
		case 2:
			name="孙权";
			flag=false;
			break;
			
		case 3:
			name="曹操";
			flag=false;
			break;
			

		default:
			System.out.println("输入错误，请重新输入！");
			flag=true;
			break;
		}}
		return name;
	}

	public String myFist() {
		int number;
		number = 1+(int) Math.random() * 3;
		
		switch (number) {
		case 1:
			choice="剪刀";
			break;
		case 2:
			choice="石头";
			break;
		case 3:
			choice="布";
			break;

		default:
			
			break;
		}
		
		System.out.println(name+"出拳："+choice);
		return choice;
      
	}

}

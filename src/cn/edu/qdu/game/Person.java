package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player {
        String choice;
      String name;
	public String inputName() {
		System.out.print("请输入你的姓名：");
		Scanner input = new Scanner(System.in);
         name = input.next();

		return name;

	}

	public String myFist() {
		System.out.println();
		System.out.print("请出拳：1.剪刀 2.石头 3.布（输入相应的数字）：");
		boolean flag=true;
		while(flag){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		
		switch (a) {
		case 1:
			choice="剪刀";
			flag=false;
			break;
		case 2:
			choice="石头";
			flag=false;
			break;
		case 3:
			choice="布";
			flag=false;
			break;

		default:
			System.out.println("输入错误，请重新输入！");
			flag=true;
			break;
		}}
		System.out.println("你出拳："+choice);
		return choice;
		

	}
}

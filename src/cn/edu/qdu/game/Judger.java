package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	private int total;
	int count;
	int personGrade;
	int computerGrade;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	Computer computer = new Computer();
	Person person = new Person();

	public void startGame() {
		System.out.println("       **********************");
		System.out.println("       **     猜拳，开始         **");
		System.out.println("       **********************");
		System.out.println();
		System.out.println();
		System.out.println("出拳规则：1.剪刀 2.石头 3.布");

	}

	public void askName() {
		String computerName = computer.inputName();
		String personName = person.inputName();
		System.out.println(personName + "vs" + computerName);
	}

	public void playGame() {
		boolean flag = false;
		    System.out.println();
			System.out.print("要开始吗？（y/n）");
			Scanner input = new Scanner(System.in);
			String yn = input.next();

			if (yn.equalsIgnoreCase("y")) {
				person.myFist();
				computer.myFist();
				flag=true;
			}
			while (flag) {
		System.out.println();
		String resultPerson = person.choice;
		count++;
		String resultComputer = computer.choice;
		if (resultComputer.equals(resultPerson)) {
			System.out.println("结果说：这场是平局");
		} else if ((resultComputer.equals("剪刀") && resultPerson.equals("布"))
				|| (resultComputer.equals("石头") && resultPerson.equals("剪刀"))
				|| (resultComputer.equals("布") && resultPerson.equals("石头"))) {
			System.out.println("结果说：o(^▽^)o，你输了，真笨！");
			computerGrade++;

		} else {
			System.out.println("结果说：(●'◡'●)，你赢了，你真聪明！");
			personGrade++;
		}
		System.out.print("是否开始下一轮(y/n):");
		Scanner input1=new Scanner(System.in);
		
		String yn1 = input.next();

		if (yn1.equalsIgnoreCase("y")) {
			person.myFist();
			computer.myFist();
			flag=true;
		}
		else{
			flag=false;
		}
		
		}

	}

	public void finalResult() {
		System.out.println("----------------------------");
		
		System.out.println(computer.name+"vs"+person.name);
		System.out.println("对战次数："+count);
		System.out.println("姓名                  得分");
		System.out.println(person.name   +"\t"+personGrade  );
		System.out.println(computer.name   +"\t"+computerGrade);
		if(personGrade<computerGrade){
			System.out.println("结果：呵呵，笨笨，下次加油啦！");
		}else if(personGrade>computerGrade){
			System.out.println("结果：嘻嘻，你很厉害啦！");
		}else{
			System.out.println("结果：嘿嘿，旗鼓相当，打成平手！");
			
		}
	}

}

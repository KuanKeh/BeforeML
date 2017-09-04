/**
 * 
 */
package beforeML;

import java.util.Scanner;

/**
 * @author Kuan
 *
 */
public class TicketMachine {
	private int price = 100;  //field  字段
	private int balance;
	private int total;
	private String name = "";
	
	public TicketMachine(int i) {
		price = i;
	}
	
	public TicketMachine(String name) {
		this.name = name;
	}
	
	public TicketMachine(String name, int price) {
		this(name);
		this.price = price;
	}

	public void showPrompt(){
		System.out.println("Welcome to buy ticket.");
		System.out.println("The price is " + this.price);
	}
	
	public void insertMoney(int bill){
		balance += bill;
		int price = 0;
		price = price - 10 ;
		printBalance();
	}
	
	public void printTicket(){
		if(balance >= price){
			System.out.println("TICKET");
			if(balance > price){
				System.out.println("change is " + (balance - price));
			}
			balance -= price;
		}
	}
	
	public void printBalance(){
		System.out.println("Welcome to buy ticket.");
		System.out.println("The price is " + price);
	}
	
	public boolean isEnough(){
		return balance >= price;
	}
	
	public static void main(String[] args){
		TicketMachine tm = new TicketMachine("tt",80);
//		System.out.println(price);
		System.out.println("name = " + tm.total);
		int bill;
		Scanner in = new Scanner(System.in);
		do{
			bill = in.nextInt();
			tm.insertMoney(bill);
		}while(tm.isEnough());
		tm.showPrompt();
		tm.insertMoney(80);
//		tm.printBalance();
		tm.insertMoney(20);
		tm.printTicket();
	}
}

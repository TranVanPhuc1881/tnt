import java.util.Scanner;
public class Person{
	private String name;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void show(){
		System.out.println("Name: "+this.name);
	}
	public void input(){
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		this.name = scn.nextLine();
	}
}
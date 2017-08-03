import java.util.Scanner;

public class RudeQuestions {
	public static void main(String[] args) {
		String name;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Hello. What's your name? ");
		name = keyboard.next();
		
		System.out.print("Hi, " + name + "! How old are you?");
		age = keyboard.nextInt();
		
		System.out.println("So you're " + age + ", huh? That's not very old.");
		System.out.print("How much do you weigh, " + name + "?");
		weight = keyboard.nextDouble();
		
		System.out.println(weight + "! That's a number that describes a physical force, and doesn't mean anything about you. You're beautiful and perfect just the way you are."); //body shaming isn't cool y'all
		System.out.print("Finally, what's your income, " + name + "?");
		income = keyboard.nextDouble();
		
		System.out.print("Capitalism is an oppressive force, and unfortunately we have to participate in order to keep ourselves safe. That " + income + " is just an imaginary number that also means nothing about you. "); //money is the root of many evils, y'all
		System.out.println("I hope that you can keep yourself financially stable in the future!");
		System.out.print("Well, thanks for answering my not very rude questions, ");
		System.out.println(name + ".");		
	}
}
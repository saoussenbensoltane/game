package meinproject;

import java.util.Scanner;

public class multiplechoice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] answers = {"c", "a", "b"};	
		String[] responses = {"", "", ""};
		
		System.out.println("what is 2 + 2?");
		System.out.println("a) 2");
		System.out.println("b) 3");
		System.out.println("c) 4");
		System.out.println("d) 5");

		System.out.println("what is the capitol  of north  Carolina?");
		System.out.println("a) Raleight");
		System.out.println("b) Durahem");
		System.out.println("c) Cary");
		System.out.println("d) winston-salam");
		
		System.out.println("what is the fastest  land animal?");
		System.out.println("a) Tiger");
		System.out.println("b) chetaah");
		System.out.println("c) Giraffe");
		System.out.println("d) Wolf");
		
		responses [0] = scan.next();
		responses [1] = scan.next();
		responses [2] =	scan.next();
		 
	int score = 0;
		for(int i= 0; i < 3; i++) {
			if(responses[i].equalsIgnoreCase(answers[i])) {
				score++;
			}
		}
		
		System.out.println("Score: " + score + "/3");
		System.out.println(responses [1]);
		System.out.println(responses [2]);
		
	}

}

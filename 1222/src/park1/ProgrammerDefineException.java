package park1;

import java.util.Scanner;


public class ProgrammerDefineException {

	public static void main(String[] args) {
		System.out.println("나이를 입력하세요:  ");

		try {
			int age = readAge();
			System.out.println("당신은" + age + "세입니다.");

		} catch (AgeInputException e) {

			System.out.println(e.getMessage());

		}

	}

	public static int readAge() throws AgeInputException {
		Scanner keyboard=new Scanner(System.in);
		int age=keyboard.nextInt();
		if(age<0) {
			throw new AgeInputException();
			
			
		}
		
		
		return age;
	}
	

}
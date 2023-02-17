package mükemmelSayi;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		
		int toplam = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayı giriniz:  ");
		int number=input.nextInt();
		
		for (int i=1; i < number; i++) {
			if (number % i == 0) {
				toplam += i;
				
			}
		}
         if (toplam == number) 
        	 System.out.println(number + " sayısı mükemmel sayıdır!");
         else
        	 System.out.println(number + " sayısı mükemmel sayı değildir!");
         

	}

}

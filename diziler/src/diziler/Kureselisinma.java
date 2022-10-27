package diziler;
import java.util.Scanner;

public class Kureselisinma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String n1;
	  String n2;
	  String n3;
	  String n4;
	  String n5;
	 String[] array = {n1,n2,n3,n4,n5};
	  Scanner ga=new Scanner(System.in);
	  System.out.println("Lütfen cevabinizi giriniz:");
	  n1=ga.nextLine();
	  
	  System.out.println("Hangisi küresel ısınmanın bir etkisi olabilir?");
	  String array[]= {"A-Deniz seviyesinin yükselmesi","B-Daha fazla ada tarımı","C-Daha çok volkanik püskürme","D-Daha fazla heyelan gerçekleşmesi"};
	  System.out.printf("%s%8s%n","Index","Value");
		for(int counter=0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter,array[counter]);
			if (array[0] equals("A")) {
				System.out.println("Dogru");
			
		}	
			else
				System.out.println("Yanlis");
			}
		System.out.println("Aşağıdakilerden hangisi küresel ısınmaya neden olabilir?");
		String array[]= {"A-Büyüyen ağaçlar","B-Balıkların yüzmesi","C-Volkanlar","D-Heyelan"};
		System.out.printf("%s%8s%n","Index","Value");
		for(int counter=0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter,array[counter]);
		}
				if ( array[1] equals("C")) {
					System.out.println("Dogru");
				
			}	
				else
					System.out.println("Yanlis");
	  

	}
	System.out.println("Bunlardan hangisi toksik bir sera gazıdır?\r\n");
	String array[]= {"A-Nitrojen","B-Oksijen","C-Karbonmonoksit\r\n","D-Metan"};
	System.out.printf("%s%8s%n","Index","Value");
	for(int counter=0; counter < array.length; counter++) {
		System.out.printf("%5d%8d%n", counter,array[counter]);
	}
			if (array [2] equals("D")) {
				System.out.println("Dogru");
			
			
			else
				System.out.println("Yanlis");
			
		}
			System.out.println("Kirlilik havaya yayıldıkça ne azalır?");
			String array[]= {"A-Ozon tabakası","B-Okyanuslar","C-Yağmur ormanları","D-Karbondioksit"};
			System.out.printf("%s%8s%n","Index","Value");
			for(int counter=0; counter < array.length; counter++) {
				System.out.printf("%5d%8d%n", counter,array[counter]);
			}
					if (array[3] equals("A")) {
						System.out.println("Dogru");
					
				}	
					else
						System.out.println("Yanlis");
							
			
					System.out.println("Aşağıdakilerden hangisi küresel ısınmanın olumsuz bir etkisi değildir?");
					String array[]= {"A-Daha büyük balık nüfusu.","B-Yeni bulaşıcı hastalıkların ortaya çıkması.","C-Türlerin yok olması.","D-Kıyı alanlarının kaybı"};
					System.out.printf("%s%8s%n","Index","Value");
					for(int counter=0; counter < array.length; counter++) {
						System.out.printf("%5d%8d%n", counter,array[counter]);
					}
							if (array[4] equals("A")) {
								System.out.println("Dogru");
							
						}	
							else
								System.out.println("Yanlis");
									
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}

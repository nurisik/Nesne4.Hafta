package Recursion;

import java.util.HashMap;
import java.util.LinkedList;

public class Hashmap {

	public static void main(String[] args) {
		LinkedList<String> cars=new LinkedList<String>();
		HashMap<String,Integer> people=new HashMap<String,Integer>();
		people.put("Umit",25);
		people.put("Ahmet",30);
		people.put("Mehmet",35);
		for(String i:people.keySet()) {
			System.out.println("key: "+ i+ " Value :"+people.get(i));
		}
		cars.add("Volvo");
		cars.add("Mercedes");
		cars.add("Ford");
		cars.add(1,"Mazda");
		String a=cars.get(1);
		if(a=="Mazda") {
			System.out.println("Esitlik saglandi");
			
		} else if(a.equals(cars.get(1))){
			System.out.println("equals saglandi");//equalsda içeriği karşılaştırır, == de adres karşılaştırır.
			
		} else
			System.out.println("esitlik saglanmadi");//linked listler eleman silmede hızlı, arrayler eklemede hızlı

	try {
		int[] dizi= {1,2,3};
		System.out.println(dizi[10]);
		System.out.println("buraya ulasti");
		
		
	}catch(Exception e) {
		System.out.println("Bir seyler yanlis gidiyor");
		}	
	}
}

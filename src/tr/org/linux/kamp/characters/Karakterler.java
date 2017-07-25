package tr.org.linux.kamp.characters;

import java.util.Random;

public class Karakterler {

	public static void main(String[] args) {

		// char veri tipinin bir sınıfı yoktur.
		// char değişkene değer atarken '' tek tırnaklar arasına yazarız.
		/*
		char a = 65;
		System.out.println(a);//A

		a = 97;
		System.out.println(a);//a
		
		System.out.println((char)97); //a
		System.out.println((char)100+1); //101
		System.out.println('a'+1); //98
		
		System.out.println((char)(100+1)); //e
		
		*/
		
		Random rgen = new Random();
		char harf;
		int sayi=rgen.nextInt(26)+'A';
		harf=(char)sayi;
		System.out.println(harf);
		
		
	}

}

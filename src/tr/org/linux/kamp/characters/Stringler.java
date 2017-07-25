package tr.org.linux.kamp.characters;

import javax.sound.midi.SysexMessage;

public class Stringler {

	public static void main(String[] args) {
		String str;

		str = "Mustafa";

		System.out.println(str.charAt(4)); // verdiğimiz değere göre 7'den fazla sayı verirsek hata mesajı alırız.
		
		String a=new String("hello");
		String b=new String("hello");
		
		System.out.println(a==b);
		
		System.out.println("hello"=="hello");
		
		str="hello";
		System.out.println(str.substring(1));
		
		System.out.println(str.indexOf('l',3)); //3. index dahil.
		
		System.out.println(str.substring(0,2)=="he");  //referansa göre eşitlik kontrolü
		System.out.println(str.substring(0,2).equals("he")); //içeriğe göre eşitlik kontrolü
		
		
		
	}
}

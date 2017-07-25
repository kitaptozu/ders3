package tr.org.linux.kamp.touppercaseyazimi;

public class ToUpperCaseYazimi {
	// Önemli
	public static void main(String[] args) {
		
		String isim="Mustafa";
		
		System.out.println(isim.toUpperCase()==toUpperCaseCeviri(isim));
		
		System.out.println(reverseString(isim));
		
		System.out.println(isPalindrome(isim));
	
	}
	
	public static String toUpperCaseCeviri (String dizi) {
		String result="";
		/*
		for(int i=0;i<dizi.length();i++) {
			result+=Character.toUpperCase(dizi.charAt(i));	
		}
		*/
		for(int i=0;i<dizi.length();i++) {
			result+=dizi.charAt(dizi.length()-i-1);
		}
		return result;
	}
	
	
	public static String reverseString(String str) {
		String result="";
		
		for(int i=str.length()-1;i>=0;i--) {
			result+=str.charAt(i);
		}
		return result;
	}

	
	public static boolean isPalindrome(String str) {
		return str.equals(reverseString(str));
				
	}
	
	
	
}

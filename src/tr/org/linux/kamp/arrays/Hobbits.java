package tr.org.linux.kamp.arrays;

public class Hobbits {

	String name;
	
	public static void main(String[] args) {
		
		Hobbits[] hobbit=new Hobbits[3]; // burada class'ın 3 boyutlu dizisini oluşturuyoruz ama nesnemiz yok.
		int z=0;
		
		while(z<3) {
			hobbit[z]=new Hobbits();//burada ise oluşturduğumuz diziye nesneler oluşturuyoruz
			hobbit[z].name="Frodo";
			
			if(z==1) {
				hobbit[z].name="Bilbo";
			}
			if(z==2) {
				hobbit[z].name="Sam";
			}
			System.out.println(hobbit[z].name+" Mordor'a ilerliyor.");
			z++;
		}

	}

}

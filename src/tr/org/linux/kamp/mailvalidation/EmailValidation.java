package tr.org.linux.kamp.mailvalidation;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Lütfen e-mail adresinizi giriniz!");
			String email = input.next();

			if (isEmailValid(email)) {
				System.out.println("Email Uygun");
			} else {
				System.out.println("Email Uygun Değil");
			}
		}

	}

	public static boolean isEmailValid(String email) {

		int i = email.indexOf("@");

		if (i == -1) {
			return false;
		}

		i = email.indexOf(".");
		if (i == -1) {
			return false;
		}

		i = email.indexOf(" ");
		if (!(i == -1)) {
			return false;
		}

		if (!(email.indexOf("@") != 0 || email.indexOf(".") != 0)) {
			return false;
		}

		if (!(email.substring(email.indexOf('@') + 1, email.indexOf('.')).length() >= 1)) {
			return false;
		}

		if (!(email.length() - email.lastIndexOf('.') > 2)) {
			return false;
		}

		return true;
	}

}

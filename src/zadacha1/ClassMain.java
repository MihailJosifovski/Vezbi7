package zadacha1;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {
	public static void main(String[] args) {
		List<String> lekovi = new ArrayList<String>();
		lekovi.add("Kafetin");
		lekovi.add("Efridol");
		lekovi.add("Tramadol");
		lekovi.add("Paracetamol");
		if (lekovi.get(lekovi.size()-1).equals("Paracetamol")) {
			System.out.println("Lekot pomaga za namaluvanje na telesnata temperatura");
		}
		else {
			System.out.println("Namenata na lekot e nepoznata");
		}
	}
}

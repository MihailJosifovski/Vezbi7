package zadacha3;

import java.util.*;

public class ClassMain {
	public static void main (String[] args) {
		List<SportskiKlub> list = new ArrayList<SportskiKlub>();
		list.add(new SportskiKlub("Empoli", "Fudbal", 20));
		list.add(new SportskiKlub("Barcelona", "Fudbal", 20));
		list.add(new SportskiKlub("Arsenal;", "Fudbal", 20));
		Collections.sort(list);
		for (SportskiKlub a: list) {
			System.out.println(a.getIme());
			System.out.println(a.getSport());
			System.out.println(a.getBrChlenovi());
			System.out.println("");
		}
	}
}

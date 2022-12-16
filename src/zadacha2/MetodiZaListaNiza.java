package zadacha2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodiZaListaNiza {
	// pretvoranje od lista vo niza
	public void listToArray (List<String> lista) {
		String[] niza = new String [lista.size()];
		lista.toArray(niza);
		System.out.println("Lista vo niza:");
		for (String s : niza) {
			System.out.println(s);
		}
	}
	// pretvoranje od niza vo lista
	public void arrayToList (String[] niza) {
		List<String> lista = new ArrayList<String>();
		lista = Arrays.asList(niza);
		System.out.println("Niza vo lista:");
		for (String s : lista) {
			System.out.println(s);
		}
	}
}

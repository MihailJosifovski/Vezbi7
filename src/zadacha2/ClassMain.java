package zadacha2;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {
	public static void main(String[] args) {
		MetodiZaListaNiza obj = new MetodiZaListaNiza();
		List<String> lista = new ArrayList<String>();
		lista.add("Tramadol");
		lista.add("Kafetin");
		obj.listToArray(lista);
		String[] niza = {"tramadol", "kafetin", "paracetamol"};
		obj.arrayToList(niza);
	}
}

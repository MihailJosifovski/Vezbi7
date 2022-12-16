package zadacha5;

import java.util.*;

public class ClassMain {
	public static void main(String[] args) {
		Set<String> mnozestvo1 = new TreeSet<String>();
		mnozestvo1.add("Real Madrid");
		mnozestvo1.add("Juventus");
		mnozestvo1.add("Tottenham");
		mnozestvo1.add("Roma");
		Set<String> mnozestvo2 = new TreeSet<String>();
		mnozestvo2.add("Tottenham");
		mnozestvo2.add("Everton");
		mnozestvo2.add("Roma");
		mnozestvo2.add("PSG");
		// unija na dvete mnozestva
		Set<String> unija = new TreeSet<String>();
		System.out.println("Unija na dvete mnozestva:");
		unija.addAll(mnozestvo2);
		unija.addAll(mnozestvo1);
		System.out.println(unija);
		// presek na dvete mnozestva
		System.out.println("presek na dvete mnozestva:");
		mnozestvo1.retainAll(mnozestvo2);
		System.out.println(mnozestvo1);
	}
}

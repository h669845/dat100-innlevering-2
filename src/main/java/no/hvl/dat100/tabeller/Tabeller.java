package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[ ");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		System.out.print("]");
		System.out.println("");
		// TODO

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String output = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			
			
			if (i == tabell.length - 1) {
				output += tabell[i];
			} else {
				output += tabell[i] + ",";
			}
		}

		output += "]";
		
		System.out.println(output);
		return output;

	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		
		System.out.println(sum);
		return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;
		
		for (int i = 0; i<tabell.length; i++) {
			if (tabell[i] == tall) {
				finnes = true;
			}
		}
		
		System.out.println(finnes);
		return finnes;
		

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int verdi = -1;
		
		for (int i = 0; i<tabell.length;i++) {
			if (tabell[i] == tall) {
				verdi = i;
				break;
			} 
		}
		
		System.out.println(verdi);
		return verdi;
		
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}

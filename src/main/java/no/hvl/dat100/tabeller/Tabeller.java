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

		for (int i = 0; i < tabell.length; i++) {
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

		for (int i = 0; i < tabell.length; i++) {
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

		int[] nytabell = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			nytabell[i] = tabell[tabell.length - 1 - i];
		}

		System.out.print("[ ");
		for (int i = 0; i < nytabell.length; i++) {
			System.out.print(nytabell[i] + " ");
		}
		System.out.print("]");
		System.out.println("");

		return nytabell;

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;

		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				sortert = false;
			}

		}

		System.out.println(sortert);
		return sortert;

	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] nyTabell = new int[tabell1.length + tabell2.length];
		
		for (int i = 0; i<tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		
		for (int i = 0; i<tabell2.length; i++) {
			nyTabell[i + tabell1.length] = tabell2[i];
		}
		
		System.out.print("[ ");
		for (int i = 0; i<nyTabell.length; i++) {
			System.out.print(nyTabell[i] + " ");
		}
		System.out.print("]");
		System.out.println("");
		
	
		return nyTabell;
		

	}
}

package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {


		for (int[] rad : matrise) {
			
			System.out.print("[ ");
			for (int linje : rad) {
				System.out.print(linje + " ");
			}
			System.out.println("]");
			System.out.println("");
		}
		System.out.println("---------------");
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String utTxt = "";

		for (int i = 0; i<matrise.length; i++) {
			for (int j = 0; j<matrise[i].length; j++) {
				utTxt += matrise[i][j] + " ";
			}
			utTxt += "\n";
			
		}
		System.out.println(utTxt);
		return utTxt;
		

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][];
		
		for(int i = 0; i<nyMatrise.length; i++) {
			nyMatrise[i] = new int[matrise[i].length];
			for (int j = 0; j<nyMatrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		
		System.out.println(nyMatrise);
		
		return nyMatrise;

		
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		
		
		if (a.length != b.length) {
			System.out.println(false);
			return false;
		}

		for(int i = 0; i<a.length; i++) {
			
			if(a[i].length != b[i].length) {
				System.out.println(false);
				return false;
			}
			
			for (int j = 0; j<a[i].length; j++) {	
				if(a[i][j] != b[i][j]) {
					System.out.println(false);
					return false;
				}
				
			}
		}
		System.out.println(true);
		return true;

	}

	// e)
	public static int[][] speile(int[][] matrise) {
		
	    int[][] nyMatrise = new int[matrise[0].length][matrise.length];

	    for(int i = 0; i < matrise.length; i++) {
	        for(int j = 0; j < matrise[i].length; j++) {
	            nyMatrise[j][i] = matrise[i][j];
	        }
	    }

	    skrivUt(nyMatrise);
	    return nyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		if(a[0].length != b.length) {
			System.out.println("kan ikke multipliseres");
		}
		
		int[][] c = new int[a.length][b[0].length];
		
		for(int i = 0; i<a.length; i++){
			for (int j = 0; j<b[0].length; j++) {
				for (int k = 0; k<a[0].length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
		
	}
}

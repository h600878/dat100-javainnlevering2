package no.hvl.dat100.lab6.matriser;

public class Matriser {
	public static void main(String[] args) {
		int[][] tabell = {
				{1, 3, 5},
				{6, 3, 1},
				{9, 2, 3},
		};
		skrivUt(skaler(2, tabell));
		
		System.out.println();
		
		System.out.println(tilStreng(tabell));
	}

	// a) Sigve (ferdig)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] tab : matrise) {
			for (int tall : tab) {
				System.out.printf("%-3s", tall);
			}
			System.out.println();
		}
	}

	// b) Sigve (ferdig)
	public static String tilStreng(int[][] matrise) {

		String streng = "";
		for (int[]tab : matrise) {
			for (int i : tab) {
				
				streng += i + " ";
			}
			streng += "\n";
		}
		
		return streng;
	}

	// c) Martin, (Test)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = new int[matrise[matrise.length-1].length][matrise.length];

		for (int r = 0; r < matrise.length; r++) {
			for (int k = 0; k < matrise[r].length; k++) {
				nyMatrise[r][k] = matrise[r][k] * tall;
			}
		}
		return nyMatrise;
	}

	// d) Erik
	public static boolean erLik(int[][] a, int[][] b) {
		// Nøstet for løkke (for inni for)


		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f) Martin
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] nyTab = new int[a[a.length-1].length][a.length];

		for (int r = 0; r < nyTab.length; r++) {
			for (int k = 0; k < nyTab[k].length; k++) {
				nyTab[r][k] = a[r][k] * b[r][k];
			}
		}
		return nyTab;
	}
}

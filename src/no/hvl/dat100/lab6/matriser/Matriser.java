package no.hvl.dat100.lab6.matriser;

public class Matriser {
	public static void main(String[] args) {
		int[][] tabell1 = {
				{1, 3, 5},
				{6, 3, 1},
				{9, 2, 3},
		};
		int[][] tabell2 = {
				{2, 1, 5},
				{3, 2, 3},
				{5, 3, 1}
		};
		
		int[][]matrise = {
				{0,0,1,1,1,1,0,0},
				{0,1,0,0,0,0,1,0},
				{0,1,0,0,0,0,1,0},
				{0,0,1,1,1,1,0,0},
				{0,1,0,0,0,0,1,0},
				{0,1,0,0,0,0,1,0},
				{0,1,0,0,0,0,1,0},
				{0,0,1,1,1,1,0,0},
		};
		skrivUt(skaler(2, tabell1));
		
		System.out.println();

		System.out.println(tilStreng(tabell1));
		
		System.out.println();

		skrivUt(multipliser(tabell1, tabell2));
		
		System.out.println();
		
		skrivUt(speile(matrise));

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

	// c) Martin (Ferdig)
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
	
	// e) Martin & Sigve (ferdig)
	public static int[][] speile(int[][] matrise) {

		int[][]speilet = new int[matrise.length][matrise[0].length];
		for (int i = 0; i <matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				speilet[i][j] = matrise[j][i];
			}
		}
		
		return speilet;
	
	}

	// f) Martin (ferdig)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int[][] nyTab = new int[a.length][a[0].length];

		for (int r = 0; r < nyTab.length; r++) {
			for (int k = 0; k < nyTab[r].length; k++) {
				nyTab[r][k] = a[r][k] * b[r][k];
			}
		}
		return nyTab;
	}
}

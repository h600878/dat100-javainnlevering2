package no.hvl.dat100.lab6.matriser;

public class Matriser {

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
		int[][] nyMatrise = new int[matrise[0].length][matrise.length];

		for (int r = 0; r < matrise.length; r++) {
			for (int k = 0; k < matrise[r].length; k++) {
				nyMatrise[r][k] = matrise[r][k] * tall;
			}
		}
		return nyMatrise;
	}

	// d) Erik (Ferdig)
	public static boolean erLik(int[][] a, int[][] b) {


		for (int r = 0; r < a.length; r++) {
			for (int k = 0; k < b.length; k++) {
				if (a[r][k] != b[r][k]){
					return false;
				}
			}
		}
		return true;
	}
	
	// e) Martin & Sigve (Ferdig)
	public static int[][] speile(int[][] matrise) {

		int[][]speilet = new int[matrise.length][matrise[0].length];

		for (int i = 0; i <matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				speilet[i][j] = matrise[j][i];
			}
		}
		
		return speilet;
	
	}

	// f) Martin (Ferdig)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a[0].length];

		for (int r = 0; r < c.length; r++) {
			for (int k = 0; k < c[r].length; k++) {
				c[r][k] = a[r][0] * b[0][k] + a[r][1] * b[1][k] + a[r][2] * b[2][k];
			}
		}
		return c;
	}
}

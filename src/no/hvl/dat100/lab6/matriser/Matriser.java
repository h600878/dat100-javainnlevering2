package no.hvl.dat100.lab6.matriser;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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

		skrivUt(multipliser(tabell1, tabell2));
		
		int[][]tab1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][]tab2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		

		
		System.out.println();
		
		System.out.println(erLik(tabell1,tabell2));

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

	// f) Martin
	// TODO Alle tall i første rad skal ganges med første tall i hver rad på den andre matrisen.
	//  Så første rad med andre tall i hver rad på den andre osv.
	//  Etter tredje gang start på neste rad også siste etter det. (a1*a1+a2*b1+a3*c1)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] c = new int[a.length][a[0].length];

		for (int r = 0; r < c.length; r++) {
			for (int k = 0; k < c[r].length; k++) {
				c[r][k] = a[r][k] * b[r][k];
			}
		}
		return c;
	}
}

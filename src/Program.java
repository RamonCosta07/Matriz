import java.util.Scanner;
public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas linhas tem a matriz? ");
		int m = sc.nextInt();
		System.out.println("Quantas colunas tem a matriz? ");
		int n = sc.nextInt();

		int[][] mat = new int[m][n];
		System.out.println ("Digite os valores dessa matriz: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Qual número deseja consultar? ");
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i] [j] == x) {
					System.out.println("Posição " + i + "," + j + ": ");

					if (j > 0) {
						System.out.println("Esqueda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Direta: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Abaixo: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();

	}

}

public class TableauxExploration{
	
	public static void initTen(int[][] tabResult){
		for(int i = 0; i < tabResult.length; i++){
			for(int j = 0; j < tabResult[0].length; j++){
				tabResult[i][j] = 10;
			}
		}
	}
	
	public static void initDiagonaleTen(int[][] tabResult){
		for(int i = 0; i < tabResult.length; i++){
			tabResult[i][i] = 10;
		}
	}
	
	public static void initPosition(String[][] tabResult){
		for(int i = 0; i < tabResult.length; i++){
			for(int j = 0; j < tabResult[0].length; j++){
				tabResult[i][j] = i + ":" + j;
			}
		}
	}
	
	public static boolean isTabCarre(int[][] tab){
		return (tab.length == tab[0].length);
	}
	
	public static boolean isTabDimEgal(int[][] tab1, int[][] tab2){
		return ((tab1.length == tab2.length) && (tab1[0].length == tab2[0].length));
	}
	
	public static int[][] getSommeMatrices(int[][] matrice1, int[][] matrice2){
		int[][] result = new int[matrice1.length][matrice1[0].length];
		for(int i = 0; i < matrice1.length; i++){
			for(int j = 0; j < matrice1[0].length; j++){
				result[i][j] = matrice1[i][j] + matrice2[i][j];
			}
		}
		return result;
	}
}

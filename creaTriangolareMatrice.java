//Matrici crea triangolare
public class provaa {
	public static void main (String[] args){
		int n = 4;
		int[][] m = creaTriangolare(n);
		
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static int[][] creaTriangolare (int n){
		int[][] s = new int[n][n];
		int c = 0;
		for(int i=0; i<s.length; i++){
			for(int j=0; j<s[i].length; j++){
				if(i>=j){
					c = c+1;
					s[i][j] = c;
				}
			}
		}
		return s;
	}
}

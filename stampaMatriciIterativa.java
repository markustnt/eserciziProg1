//Stampa di matrici iterativa
public class provaa {
	public static void main (String[] args){
		int[][] a = new int [3][3];
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				if(i<j){
					System.out.print(a[i][j]);
				}else{
					System.out.print(1);
				}
			}
			System.out.println();
		}
	}
}

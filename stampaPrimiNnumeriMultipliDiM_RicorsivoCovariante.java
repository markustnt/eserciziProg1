//stampa ricorsivaCovariante dei primi n numeri multipli di m
public class provaa {
	public static void main (String[] args){
		int m = 5;
		int n = 3;
		//output atteso: 5, 10, 15   ovvero 5*1, 5*2, 5*3
		multipliU(m,n);
		System.out.println();
		//output atteso: 15, 10, 5
		multipliD(m,n);
	}
	//ordine crescente
	public static void multipliU(int m, int n){
		if(n==0){
			//
		}else{
			multipliU(m, n-1);
			System.out.println(m*n);
		}
		return;
	}
	//ordine decrescente
	public static void multipliD (int m, int n){
		if(n==0){
			//
		}else{
			System.out.println(m*n);
			multipliD(m,n-1);
		}
		return;
	}
}

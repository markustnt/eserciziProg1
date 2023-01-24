//stampa ricorsivaControvariante dei primi n numeri multipli di m
public class provaa {
	public static void main (String[] args){
		int m = 5;
		int n = 3;
		//output atteso: 5, 10, 15   ovvero 5*1, 5*2, 5*3
		multipliU(m,n,0);
		System.out.println();
		//output atteso: 15, 10, 5
		multipliD(m,n,0);
	}
	//ordine crescente
	public static void multipliU(int m, int n, int i){
		if(i==n){
			//
		}else{
			multipliU(m, n, i+1);
			System.out.println(m*(n-i));
		}
		return;
	}
	//ordine decrescente
	public static void multipliD (int m, int n, int i){
		if(n==i){
			//
		}else{
			System.out.println(m*(n-i));
			multipliD(m,n,i+1);
		}
		return;
	}
}

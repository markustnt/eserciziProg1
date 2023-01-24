//Stampa numeri CONTROVARIANTE in ordine decrescente [0, ..., n)
public class provaa {
	public static void main (String[] args){
		int n = 10;
		stampaU(n,0);
	}
	public static void stampaU(int n, int i){
		if(i==n){
			//
		}else{
			System.out.println(n-i);
			stampaU(n,i+1);
		}
		return;
	}
}

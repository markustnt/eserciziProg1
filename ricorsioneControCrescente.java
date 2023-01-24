//Stampa numeri CONTROVARIANTE in ordine crescente [0, ..., n)
public class provaa {
	public static void main (String[] args){
		int n = 3;
		stampaU(n,0);
	}
	public static void stampaU(int n, int i){
		if(i==n){
			//
		}else{
			stampaU(n,i+1);
			System.out.println(n-(i+1));
			
		}
		return;
	}
}

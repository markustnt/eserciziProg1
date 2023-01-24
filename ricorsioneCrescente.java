//Stampa numeri in ordine crescente [0, ..., n)
public class provaa {
	public static void main (String[] args){
		int n = 5;
		stampaU(n);
	}
	public static void stampaU (int n){
		if(n == -1){
			return;
		}else{
			stampaU(n-1);
			System.out.println(n);
		}
	}
}

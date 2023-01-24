//Stampa numeri in ordine decrescente [0, ..., n)
public class provaa {
	public static void main (String[] args){
		int n = 21;
		stampaD(n);
	}
	public static void stampaD (int n){
		if(n==0){
			//
		}else{
			System.out.println(n-1);
			stampaD(n-1);
		}
		return;
	}
}

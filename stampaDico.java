//stampa dicotomica
public class provaa {
	public static void main (String[] args){
		int[] a = {1, 5, 3, 6, 3, 7, 8};
		stampaDico(a);
	}
	//wrapper
	public static void stampaDico(int[] a){
		if(a!=null && a.length!=0){
			stampaDico(a,0,a.length);
		}
	}
	//metodo
	public static void stampaDico(int[] a, int l, int r){
		if(l+1==r){
			System.out.print(a[l] + " ");
		}else{
			int m = (l+r)/2;
			stampaDico(a, l, m);
			stampaDico(a, m, r);
		}
	}
}

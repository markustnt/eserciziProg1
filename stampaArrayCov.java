public class provaa {
	public static void main (String[] args){
		int[] a = {1,4,56,9};
		stampaArray(a);
	}
	public static void stampaArray(int[] a){
		if(a!=null){
			stampa(a,a.length);
		}
	}
	public static void stampa(int[] a, int i){
		if(i==0){
			//
		}else{
			stampa(a,i-1);
			System.out.println(a[i-1]);
		}
		return;
	}
}

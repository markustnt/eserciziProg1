//esiste Pos ricorsione 
public class provaa {
	public static void main (String[] args){
		int[] a = {1,4,2,6,7,3,9,3,6,3,2,2};
		int v = 2;
		int ris = esistePos(a,v);
		System.out.println(ris);
	}
	//wrapper esistePos
	public static int esistePos (int[] a, int v){
		if(esiste(a,v)){
			//se v esiste
			return esistePos(a, v, 0);
		}else {
			return a.length;
		}
	}
	//esiste wrapper
	public static boolean esiste (int[] a, int v){
		if(a!=null && a.length!=0){
			return esiste(a, v, a.length-1);
		}else {
			return false;
		}
	}
	//metodo esiste
	public static boolean esiste(int[] a, int v, int i){
		if(i==-1){
			return false;
		}else{
			if(a[i]==v){
				return true;
			}else{
				return esiste(a, v, i-1);
			}
		}
	}
	//metodo esistePos
	public static int esistePos(int[] a, int v, int i){
		if(i==a.length){
			return a.length;
		}else{
			if(a[i]==v){
				return(i);
			}else{
				return esistePos(a, v, i+1);
			}
		}
	}
}

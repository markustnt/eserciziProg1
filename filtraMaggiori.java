//esisteMultiplo
public class provaa {
	public static void main (String[] args){
		int[] a = {1, 3, 4, 18, 5, 9, 7};
		int n = 4;
		int[] ris = maggioriDi(a, n);
		
		for (int i=0; i<ris.length; i++){
			System.out.println(ris[i]);
		}
	}
	//wrapper
	public static int[] maggioriDi (int[] a, int n){
		if(a!=null && a.length!=0){
			int[] c = new int[contaElem(a,n,0)];
			return maggioriDi(a,n,0,c,0);
		}else{
			return a;
		}
	}
	public static int[] maggioriDi (int[] a, int n, int i, int[] c, int j){
		if(i==a.length){
			return c;
		}else{
			if(a[i]>n){
				c[j] = a[i];
				j++;
			}
			return maggioriDi(a,n,i+1,c,j);
		}
	}
		
	public static int contaElem(int[] a, int n, int i){
		if(i==a.length){
			return 0;
		}else{
			if(a[i]>n){
				return contaElem(a,n,i+1) + 1;
			}else{
				return contaElem(a,n,i+1) + 0;
			}
		}
	}
}

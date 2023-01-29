public class provaa {
	public static void main (String[] args){
		int[] a = {1,3,1,7,3,5};
		int[] b = copiaPrecedente(a);
		for(int i=0; i<b.length;i++){
			System.out.println(b[i]);
		}
	}
	public static int[] copiaPrecedente (int[] a){
		if(a!=null && a.length!=0){
			return copiaPrecedente(a,0,a.length);
		}else{
			return a;
		}
	}
	public static int[] copiaPrecedente(int[] a, int l, int r){
		if(l+1==r){
			if(l>=1 && l%2==1){
				a[l-1]=a[l];
			}
		}else{
			int m = (l+r)/2;
			a = copiaPrecedente(a, l, m);
			a = copiaPrecedente(a, m, r);
		}
		return a;
	}
}

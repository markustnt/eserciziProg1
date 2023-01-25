//RaddopElemPosPariMaggioDi_v
public class provaa {
	public static void main (String[] args){
		int[] a = {1, 5, 7, 6, 5, 7, 8};
		int v = 4;
		raddPari(a,v);
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
	//wrapper
	public static void raddPari(int[] a, int v){
		if(a!=null && a.length!=0){
			raddPari(a,v,0,a.length);
		}
	} 
	public static void raddPari (int[] a, int v, int l, int r){
		if(l+1==r){
			if(l%2==0 && a[l]>v){
				a[l]=a[l]*2;
			}
		}else{
			int m = (l+r)/2;
			raddPari(a,v,l,m);
			raddPari(a,v,m,r);
		}
	}
}

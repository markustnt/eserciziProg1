public class provaa {
	public static void main (String[] args){
		int[] a = {1,3,1,7,3};
		int v = 3;
		System.out.println(RaddoppioPariCnt(a,v));
	}
	public static int RaddoppioPariCnt(int[] a, int v){
		if(a!=null && a.length!=0){
			return RaddoppioPariCnt(a,v,0,a.length);
		}else{
			return 0;
		}
	}
	public static int RaddoppioPariCnt(int[] a, int v, int l, int r){
		int cnt = 0;
		if(l+1==r){
			if(l%2==0 && a[l]>v){
				a[l]=a[l]*2;
				return cnt + 1;
			}
			
		}else{
			int m = (l+r)/2;
			int sostleft = RaddoppioPariCnt(a,v,l,m);
			int sostrigth = RaddoppioPariCnt(a,v,m,r);
			cnt = sostleft + sostrigth;
		}
		return cnt;
		
	}
}

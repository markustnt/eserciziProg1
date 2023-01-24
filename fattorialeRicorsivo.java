//fattorinale ricorsivo
public class provaa {
	public static void main (String[] args){
		int n = 4;
		int ris = fatt(n);
		System.out.println(ris);
	}
	public static int fatt (int n){
		if(n==0){
			return 1;
		}else{
			return fatt(n-1)*n;
		}
	}
}

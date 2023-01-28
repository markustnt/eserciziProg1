  
public class FD {

    // Contro-variante
    public static int contaDispari(int[] a, int i) {
        if (i == a.length)
          return 0;
        else if (a[i]%2 == 1) 
                return 1 + contaDispari(a, i+1);
             else
                return 0 + contaDispari(a, i+1);
    }

    // Co-variante
    public static int fD(int[] a, int i, int[] r) {
        if (i == 0)
          return 0;
        else {
          int indiceR = fD(a, i-1, r);
          if (a[i-1]%2 == 1) {
             r[indiceR] = a[i-1];
             return indiceR+1;
          } else 
             return indiceR;
        }
      
          // Wrapper
    public static int[] fD(int[] a) {
      int[] r = new int[contaDispari(a, 0)];
      fD(a, a.length, r); 
      return r;
    }
    }

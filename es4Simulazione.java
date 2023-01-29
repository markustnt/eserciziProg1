/* È ammesso:
 * 1. sostituire le sequenze di caratteri \*???*\ con espressioni, linee di 
 * comando, richiami ad altri metodi
 * 2. aggiungere metodi  
 * quando ritenuto necessario.
 * Non è ammesso modificare le parti di codice fornite. */
 
public static boolean e2(int[][] x) {
    return e2R(x, 0, x.length);
}

public static boolean e2R(int[][] x, int l, int r) {
    if(l+1==r){
        boolean ris = esiste(x[l]);
        return ris;
    }else{
        int m=(l+r)/2;
        return e2R(x,l,m) || e2R(x,m,r);
    }
}

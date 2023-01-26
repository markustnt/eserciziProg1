/* È ammesso:
 * - sostituire le sequenze di caratteri \*???*\ con:
 *   -- espressioni;
 *   -- una o più linee di comando;
 * - aggiungere metodi
 * quando ritenuto necessario.
 *
 * Non è ammesso modificare le parti di codice fornite. */
 
public static boolean e1(int[][] x) {
    return e2(x,0);
}
public static boolean e2 (int[][] x, int i){
    if(i==x.length){
        return true;
    }else{
        return e2(x,i+1) &&  cerca(x[i],0);
    }
} 
public static boolean cerca (int[]a, int i){
    if(i==a.length){
        return true;
    }else{
        if(a[i]==0){
          return false;  
        }else{
            return cerca(a,i+1);
        }
    }
}

// Testing
static int[][] a0 = { {0} }; //false
static int[][] a1 = { {1} }; //true
static int[][] a2 = { {1},{1} }; //true
static int[][] a3 = { {1}, {0} }; //false
static int[][] a4 = { {1,2}, {1,0} }; //false
static int[][] a5 = { {1,2}, {1,2} }; //true
static int[][] a6 = { {1,2,3}, {1,2,3} }; // true
static int[][] a7 = { {1,2,3}, {1,2,0} }; // false

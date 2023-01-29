/* È ammesso:
 * - sostituire le sequenze di caratteri \*???*\ con:
 *   -- espressioni;
 *   -- una o più linee di comando;
 * - aggiungere metodi
 * quando ritenuto necessario.
 *
 * Non è ammesso modificare le parti di codice fornite. */
 
public static boolean e1(int[][] x) {
    boolean ris = true;
    for(int i=0; i<x.length; i++){
        for(int j=0; j<x[i].length; j++){
            if(x[i][j]%2==0){
                ris = false;
            }
        }
    }
    return ris;
}

// Testing che verranno usati
static int[][] a0 = { {0} }; //false
static int[][] a1 = { {1} }; //true
static int[][] a2 = { {1},{1} }; //true
static int[][] a3 = { {1}, {0} }; //false
static int[][] a4 = { {1,3}, {1,0} }; //false
static int[][] a5 = { {1,3}, {3,5} }; //true
static int[][] a6 = { {1,3,5}, {5,5,5} }; // true
static int[][] a7 = { {1,3,5}, {5,5,0} }; // false

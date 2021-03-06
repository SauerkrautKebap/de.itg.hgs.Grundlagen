package G1b_SortierenQuicksort;

public class QuicksortUebung {
 
    public static void main(String[] args) {
        int[] unsortiert = {0,10,3,8,99,1};
        int[] sortiert = unsortiert.clone();
 
        sortiert = quicksort(sortiert, 0, sortiert.length-1);
        ausgabeArray(unsortiert);
        ausgabeArray(sortiert);
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static int[] quicksort(int[] a, int unten, int oben){
  
        int tmp;
        int i=unten;
        int j=oben;
        int x = a[(unten+oben)/2];
        
        do {
            
            while(a[i]<x){
                i++;                
            }
            
            while (a[j]>x) {
                j--;
            }
            
            if(i<=j){
                tmp = a[i];
                a[i]=a[j];
                a[j]=tmp;
                i++;
                j--;
            }
        } while (i<=j);
        
        if(unten<j){
            quicksort(a, unten, j);
        }
        
        if(i<oben){
            quicksort(a, i, oben);
        }
       
        return a;
    }
    
    

     private static void ausgabeArray(int[] sortiert) {
            for (int i = 0; i < sortiert.length; i++) {
                if (i < sortiert.length - 1) {
                    System.out.print(sortiert[i] + ", ");
                } else {
                    System.out.print(sortiert[i]);
                }
            }
    
            System.out.println("\n-----------------------");
    
        }

}

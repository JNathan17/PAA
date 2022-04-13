import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] numeros = {1, 9, 12, 4};
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(selectionSort(numeros)));

    }

        private static int[] selectionSort(int[] lista){
            int n = lista.length;

            for(int pi = 0; pi < n - 1; pi++){

                int mi = pi;
                for(int i = pi; i < n; i++){
                    if(lista[i] < lista[mi]){
                        mi = i;
                    }
                }
            if(lista[pi] > mi){
                int aux = lista[pi];
                lista[pi] = lista[mi];
                lista[mi] = aux;
            }
            }
        return lista;
    }


}

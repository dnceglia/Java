
public class BubbleSort {
    
    // logic to sort the elements
    public int[] bubble_srt(int array[]) {
        
        int n = array.length;
        int j;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                j = i + 1;
                if (array[i] > array[j]) {
                    swapNumbers(i, j, array);
                }
            }
        }
    return (array);
    
    }
    
    
    private static void swapNumbers(int i, int j, int[] array) {
        
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        
    }
    
}

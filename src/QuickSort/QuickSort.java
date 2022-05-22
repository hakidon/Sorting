package QuickSort;

// Java implementation of QuickSort 
public class QuickSort{
 
    private  long epoch;

    public  int partition(String arr[], int low_idx, int high_idx){
        epoch++; // assignments
        String pivot = arr[high_idx];
        int i = low_idx - 1;

        for(int j = low_idx; j < high_idx; j++){
            epoch += 2; // for loop assignment and comparison

            epoch++; // if comparison
            if(arr[j].compareTo(pivot) < 0){
                epoch++; // increment
                i++;

                epoch += 3; // swap
                //swap
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            epoch++; // for loop increment j
        }
        
        epoch++; // i increment
        i++;

        epoch += 3; // swap
        String temp = arr[i];
        arr[i] = pivot;
        arr[high_idx] = temp;

        epoch++; // return
        return i;//pivot index
    }

    public  void quickSort(String arr[], int low, int high) {

        epoch++; // comparison
        if(low < high){
            epoch++; // assignment
            int partition_idx = partition(arr, low, high);

            quickSort(arr, low, partition_idx-1);
            quickSort(arr, partition_idx+1, high);
        }
    }

    public  long sort (String arr[]) {
        epoch = 0;
        quickSort(arr, 0, arr.length - 1);
        return epoch;
    }

}
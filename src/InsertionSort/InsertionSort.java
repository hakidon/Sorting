package InsertionSort;

public class InsertionSort{

public long sort(String[] arr) {
  long epoch = 0;
  epoch++;   //variable for primitive counter
  int i,j;
  String key;

  epoch++; // assignment
  for (j = 1; j < arr.length; j++) { //the condition has changed
   
    epoch++; // comparison
    epoch+=2; // increment (j++)

    key = arr[j];
    i = j - 1;

    epoch++; // assignment
    epoch+=2; //arithmetic and assignment


    epoch++; //while comparison
    while (i >= 0) {

      epoch++; //if comparison
      epoch++;
      if (key.compareTo(arr[i]) > 0) {//here too
        break;
      }
      arr[i + 1] = arr[i];
      i--;
      //Counter placement is to change
      //Put where you thought would be suitable
      epoch+=2; // assignment
      epoch+=2; // decrement
    }
    arr[i + 1] = key;
    epoch+=2; // assignment
  }

  epoch++;
  return epoch;
}
    }
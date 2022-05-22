package BubbleSort;
// Java implementation
public class BubbleSort
{
    public long sort(String[] arr)
    {   
        int i, j;
        String temp;
        long counter = 0;  // primitive operation counter
        boolean swapped;

        counter += 5;
        for (i = 0; i < arr.length - 1; i++)
        {
            counter++;
            swapped = false;

            counter += 7;
            for (j = 0; j < arr.length - i - 1; j++)
            {
                counter += 3;
                if (arr[j].compareTo(arr[i]) < 0)
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                    counter += 5;
                }
            }
 
            // IF no two elements were
            // swapped by inner loop, then break
            counter ++;
            if (swapped == false)
                break;
        }

        // ArrayList<String> wordList = convertToArrayList(wordArray); // convert back to arraylist before passing to writeToFile
        // writeToFile(wordList);
        // System.out.println("Process completed. Array sorted!");
        counter ++;
        return counter;
    } 
}
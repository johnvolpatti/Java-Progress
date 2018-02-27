/**
 * Auto Generated Java Class.
 */
public class AlgorithmsRunner
{
  public static void main(String[] args) 
  {
    //Prints out array sorted with the bubble sort method.
    int [] numbers = {16, 1, 5, 7, 8};
    Algorithms sort = new Algorithms(numbers);
    sort.bubbleSort();
    sort.printArray();
    
    System.out.println();
    /*
     * Does the numbers array permanently get changed to the sorted array that got spit out in the previous set (i.e. does it get set
     * to [1,5,7,8,16] permanently or does it go back to its orignal value (i.e. [16,1,5,7,8]?
     */
    
    //Prints out array sorted with the insetion sort method.
    int [] series = {10, 1, 0, 2, 1};
    Algorithms sorted = new Algorithms(series);
    sorted.insertionSort();
    sorted.printArray();
  }
}

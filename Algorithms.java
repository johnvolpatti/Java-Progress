/**
 * Class for multiple algorithms used to sort arrays.
 */
public class Algorithms 
{
  private int [] list;
  
  public Algorithms()
  {
    list = new int [4];
  }
  
  public Algorithms(int [] numbers)
  {
    list = numbers;
  }
  
  public int [] swap(int [] array, int a, int b)
  {
    int high = array[a];
    int low = array[b];
    
    array[a] = low;
    array[b] = high;
    
    return array;
  }
  
  public void bubbleSort()
  {
    boolean sort = false;
    int count = 0;
    while(sort == false)
    {
      count = 0;
      for(int i = 0; i <= list.length - 2; i++)
      {
        if(list[i] > list[i + 1])
        {
          list = swap(list, i, i + 1);
          count++;
        }
      }
      if(count == 0)
      {
        sort = true;
      }
    }
  }
  
  public void printArray()
  {
    for(int j = 0; j <= list.length - 1; j++)
    {
        System.out.println(list[j]);
    }
  }
  
  public void insertionSort()
  {
      int element;
      int j = 0;
      
      for(int i = 1; i <= list.length - 1; i++)
      {
          element = list[i];
          
          j = i;
          
          while(j > 0 && list[j - 1] > element)
          {
              list[j] = list[j - 1];
              list[j - 1] = element;
              j--;
          }
      }
  }
}

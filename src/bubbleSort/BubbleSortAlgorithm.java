package bubbleSort;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
       int[] numbers = new int[10];
       numbers[0] = 3;
       numbers[1] = 6;
       numbers[2] = 2;
       numbers[3] = 8;
       numbers[4] = 1;
       numbers[5] = 0;
       numbers[6] = 4;
       numbers[7] = 7;
       numbers[8] = 9;
       numbers[9] = 5;

       for (int i = 0; i < numbers.length; i++){
           for(int j = 1; j< numbers.length -i; j++){
              if (numbers[j -1] > numbers[j]){
                 int temp = numbers[j];
                 numbers[j] = numbers[j-1];
                 numbers[j-1] = temp;
              }
           }
       }

       for (int number : numbers) {
          System.out.println("Sorted Array : " + number);
       }
    }

}

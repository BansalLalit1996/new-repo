public class sorting {
    public static void main(String[] args) {
        int[] arr = {454,78,79,520,645,880};
        boolean result= true;
      for (int i= 0; i< arr.length-1;i++) {
          if (arr[i] > arr[i + 1])
              result = false;
          break;
      }
      if(result)
          System.out.println("Array sorted");
      else System.out.println("Array unsorted");

    }
}

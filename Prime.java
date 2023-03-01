public class Prime {
  public static boolean isPrime(int num) {
    boolean prime = true;
   for (int i = 2; i <= Math.sqrt(num); ++i) {
      if (num % i == 0) {
        prime = false;
        break;
      }
    }
    if(num == 0 || num == 1|| num < 0) prime = false;
    if(num == 2) prime = true;
    return prime; //TODO
  }
}

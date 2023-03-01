public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    // Your code here!
    String returnV = "(";
    for(int i = 0; i < 3; i++){
      returnV = returnV + numbers[i];
    }
    returnV += ") ";
    for(int i = 3; i < 6; i++){
       returnV = returnV + numbers[i];
    }
     returnV += "-";
    for(int i = 6; i < 10; i++){
       returnV = returnV + numbers[i];
    }
    return returnV;
  }
}

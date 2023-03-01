public class Kata
{
  public static String[] towerBuilder(int nFloors)
  {
    String tower[] = new String[nFloors];
    int i = 1;
    for(int j = 0; j < nFloors; j++){
      tower[j] = new String(" ".repeat(nFloors - i)) + "*".repeat((i-1)*2+1) + new String(" ".repeat(nFloors - i ));
      i++;
    }
    return tower;
  }
}

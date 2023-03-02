class Diamond {
  public static String print(int n) {
    // TODO your code here
    String diamond = "";
    if(n > 0 && (n % 2) > 0){
      for(int i = 1; i <= n; i += 2){
        diamond += " ".repeat((n-i) / 2);
        diamond += "*".repeat(i);
        diamond += "\n";
      }
      for(int i = n - 2; i > 0; i -= 2){
        diamond += " ".repeat((n-i) / 2);
        diamond += "*".repeat(i);
        diamond += "\n";
      }
    } else diamond = null;
      return diamond;
	}
}

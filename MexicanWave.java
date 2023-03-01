import java.util.ArrayList;
public class MexicanWave {

    public static String[] wave(String str) {
        // Your code here
      ArrayList<String> list = new ArrayList<String>();
      for(int i = 0; i < str.length(); i++){
        String temp = "";
        for(int j = 0; j < str.length(); j++){
          
          if(i == j){
            temp += Character.toUpperCase(str.charAt(j));
          }else{
            temp += str.charAt(j);
          }
        }
        if(!(str.charAt(i)== ' ')){
        list.add(temp);
        }
      }
      return list.toArray(new String[0]);
    }  
}

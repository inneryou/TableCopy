package src.com.turedurenaru;

public class TextTransform{
  public static String inputText(String str){
    String[] aryStr = str.split("");
    StringBuilder sb = new StringBuilder();
    for(String s:aryStr){
      sb.append("<span style='color:red;'>" + s + "</span>");
    }
    return sb.toString();
  }
}

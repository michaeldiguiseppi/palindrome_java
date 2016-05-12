public class Palindrome {
  public static void main(String [] args) {
    String str = args[0].toLowerCase();
    int len = str.length();
    Boolean truthy = true;
    char [] splitStr = new char[len];
    for (int i = 0; i < len; i++) {
      splitStr[i] = str.charAt(i);
    }
    for (int a = 0; a <= splitStr.length - 1; a++) {
      for (int b = splitStr.length - 1; b >= 0; b--) {
        if (splitStr[a] != splitStr[b]) {
          truthy = false;
        } else {
          truthy = true;
        }
      }
    }
    if (truthy) {
      System.out.println(str + " is a palindrome.");
    } else {
      System.out.println(str + " is not a palindrome.");
    }
  }
}

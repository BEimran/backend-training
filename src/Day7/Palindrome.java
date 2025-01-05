package Day7;
import java.util.Scanner;
public class Palindrome {
   public static String isPali(String str) {
      StringBuffer vl = new StringBuffer(str);
      if(vl.reverse().toString().equals(str))
      {
          return str;
      }
     return "";
    }

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String s = d.next();
        boolean v = false;
        for(int i=0;i<s.length();i++)
        {
            if(isPali(s.substring(0,i)+s.substring(i+1)) != "")
            {
                v = true;
                break;
            }
        }
        if(v)
        {
            System.out.println(v);
        }
        else {
            System.out.println(v);
        }
    }
}

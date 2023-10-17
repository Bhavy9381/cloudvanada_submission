import java.util.HashMap;

 public class RonamNumber{
   public static  int Ronam(String s){
    HashMap<Character,Integer> r= new HashMap<>();
    r.put('I', 1);
    r.put('V', 5);
    r.put('L', 50);
    r.put('C', 100);
    r.put('D', 500);
    r.put('X', 10);
     int result =0;
     int p =0;

     for(int i =s.length() -1;i>=0;i--){
        int b=r.get(s.charAt(i));
        if (b<p){
            result -=b;

        }
        else{
            result +=b;
        }
        p=b;
     }
     return result;
   }
   public static void main(String[] args){
    String c="D";
    int d=Ronam(c);
    System.out.println("the integer of" + c+ "is:" +d);
   }
 }
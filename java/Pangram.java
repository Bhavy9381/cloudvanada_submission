
public class Pangram {

    public static boolean isPangram(String arg){
        String s  = arg.toLowerCase();
        boolean[] letters =new boolean[26];

        for(char c : s.toCharArray()){
            if (Character.isLetter(c)){
                 int index = c-'a';
                 letters[index]=true;
            }
        }
        for (boolean letter : letters){
             System.out.println(letter);
            if(!letter){
           
                return false;
            }
        }
       return true;

       
    }
    public static void main(String[] args){
        String input=" abcdefghijklmnopqrstuvwxyz";
        boolean c = isPangram(input);
        if (c){
            System.out.println("The input is a pangram");

        }
        else{
            System.out.println("the input is not a pangram");
        }

    }
}

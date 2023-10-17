import java.util.ArrayList;
import java.util.Collections;
import java. util.List;

public class shuffleArray{
    public static void main(String[] args)
    {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
       Collections.shuffle(a);
       for(int number: a){
        System.out.print(number + " ");
       }
    }
}
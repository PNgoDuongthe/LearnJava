package Variable_Scope;

import java.util.Random;

public class DiceRoller {
    Random random;
    int number =0;
     DiceRoller(){
         random = new Random();
         roll(random, number);
     }
     public void roll(Random random, int numbers){
        numbers = random.nextInt(6)+1;
        System.out.println(numbers);
    }

}

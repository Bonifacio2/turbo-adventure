/**
 * Created by bonifacio on 4/19/15.
 */
public class FizzBuzz {

    public static void main(String args[]){
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.run();

    }

    private void run(){

        boolean divisibleBy3;
        boolean divisibleBy5;

        for (int i = 1; i <= 100; i++){

            divisibleBy3 = (i % 3) == 0;
            divisibleBy5 = (i % 5) == 0;

            if (divisibleBy3 || divisibleBy5) {

                if (divisibleBy3) {
                    System.out.print("Fizz");
                }

                if (divisibleBy5) {
                    System.out.print("Buzz");
                }

            } else {
                System.out.print(i);
            }


            System.out.println();
        }
    }

}

/**
 * Created by bonifacio on 4/19/15.
 */
public class Exercicio6 {

    public static void main(String[] args){

        int diamondSize = 0;

        try {
            diamondSize = Integer.parseInt(args[0]);
        } catch (Exception e){
            System.err.println("Invalid diamondSize");
        }

        Diamond diamond = new Diamond(diamondSize);
        diamond.draw();

    }
}

/**
 * Created by bonifacio on 4/19/15.
 */
public class Exercicio7 {

    public static void main(String[] args){

        int diamondSize = 0;
        String name = "";

        try {
            diamondSize = Integer.parseInt(args[0]);
            name = args[1];
        } catch (Exception e){
            System.err.println("Invalid diamondSize");
        }

        DiamondWithName diamond = new DiamondWithName(diamondSize, name);
        diamond.draw();

    }
}


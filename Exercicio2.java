/**
 * Created by bonifacio on 4/18/15.
 */
public class Exercicio2 {

    public static void main(String[] args){

        int lineLength = 0;

        try {
            lineLength = Integer.parseInt(args[0]);
        } catch (Exception e){
            System.err.println("Invalid lineLength");
        }


        Exercicio2 e2 = new Exercicio2();
        e2.drawLine(lineLength);
    }

    private void drawLine(int lineLength){
        for (int i = 0; i < lineLength; i++){
            System.out.print("*");
        }

        System.out.println();
    }
}

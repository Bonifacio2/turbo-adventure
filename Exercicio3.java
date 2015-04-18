/**
 * Created by bonifacio on 4/18/15.
 */
public class Exercicio3 {

    public static void main(String[] args){

        int lineHeight = 0;

        try {
            lineHeight = Integer.parseInt(args[0]);
        } catch (Exception e){
            System.err.println("Invalid lineHeight");
        }


        Exercicio3 e3 = new Exercicio3();
        e3.drawLine(lineHeight);
    }

    private void drawLine(int lineHeight){
        for (int i = 0; i < lineHeight; i++){
            System.out.println("*");
        }
    }
}

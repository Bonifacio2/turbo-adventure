/**
 * Created by bonifacio on 4/18/15.
 */
public class Exercicio4 {

    public static void main(String[] args){

        int triangleHeight = 0;

        try {
            triangleHeight = Integer.parseInt(args[0]);
        } catch (Exception e){
            System.err.println("Invalid triangleHeight");
        }


        Exercicio4 e4 = new Exercicio4();
        e4.drawRightTriangle(triangleHeight);
    }

    private void drawRightTriangle(int triangleHeight){
        for (int lineLength = 1; lineLength <= triangleHeight; lineLength++){

            for (int i = 0; i < lineLength; i++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}

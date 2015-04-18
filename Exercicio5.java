/**
 * Created by bonifacio on 4/18/15.
 */
public class Exercicio5 {

    public static void main(String[] args){

        int triangleHeight = 0;

        try {
            triangleHeight = Integer.parseInt(args[0]);
        } catch (Exception e){
            System.err.println("Invalid triangleHeight");
        }

        IsoscelesTriangle triangle = new IsoscelesTriangle(triangleHeight);
        triangle.draw();
    }
}

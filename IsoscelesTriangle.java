/**
 * Created by bonifacio on 4/18/15.
 */
public class IsoscelesTriangle {

    private int height;

    IsoscelesTriangle(int height){
        this.height = height;
    }

    public void draw(){

        int lineOffset;
        int starCount;

        for (int i = 0; i < height; i++){
            lineOffset = height - (i + 1);
            starCount = (i * 2) + 1;

            drawOffset(lineOffset);
            drawStars(starCount);
            System.out.println();
        }
    }


    private void drawOffset(int size){
        for (int i = 0; i < size; i++){
            System.out.print(" ");
        }
    }

    private void drawStars(int starCount){
        for (int i = 0; i < starCount; i++){
            System.out.print("*");
        }
    }
}

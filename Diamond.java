/**
 * Created by bonifacio on 4/19/15.
 */
public class Diamond {

    private int size;

    Diamond(int size){
        this.size = size;
    }

    public void draw(){

        drawUpperHalf();

        drawLowerHalf();

    }

    private void drawLowerHalf() {
        int lineOffset;
        int starCount;
        for (int i = size - 2; i >= 0; i--){
            lineOffset = size - (i + 1);
            starCount = (i * 2) + 1;

            drawOffset(lineOffset);
            drawStars(starCount);
            System.out.println();
        }
    }

    private void drawUpperHalf() {
        int lineOffset;
        int starCount;
        for (int i = 0; i < size; i++){
            lineOffset = size - (i + 1);
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

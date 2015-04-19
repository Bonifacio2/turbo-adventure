/**
 * Created by bonifacio on 4/19/15.
 */
public class DiamondWithName {

    private int size;
    private String name;

    DiamondWithName(int size, String name){
        this.size = size;
        this.name = name;
    }

    public void draw(){

        drawUpperHalf();

        drawName();

        drawLowerHalf();

    }

    private void drawName(){
        System.out.println(name);
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
        for (int i = 0; i < size - 1; i++){
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


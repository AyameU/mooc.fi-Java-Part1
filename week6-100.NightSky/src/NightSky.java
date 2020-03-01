import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {

        // for loop to set max line length
        for(int i = 0; i < this.width; i++) {

            // create new random every loop
            Random random = new Random();
            double probability = random.nextDouble();

            //if probability is less than density, print either star or whitespace
            if(probability <= this.density) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
    }

    public void print() {
        for(int i = 0; i < this.height; i++ ) {
            printLine();
            System.out.println();
        }
    }
}

import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private Random random = new Random();

    public NightSky(double density) {
        this.density = density;
    }

    public NightSky(int width, int height) {
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
}

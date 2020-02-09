import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random;


    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        int i = 0;
        char chars = '\0';

        /*
        The string must be created and initialized in the method, not in the class
        itself, otherwise each new password will be added to the string every
        time the method is called, instead of an empty string being used.
        eg.
        Password: cijmelebcedge
        Password: cijmelebcedgebijklccmhjhea
        Password: cijmelebcedgebijklccmhjheafkkdaealelkcd
        Password: cijmelebcedgebijklccmhjheafkkdaealelkcdalbabjdjdfhcl
        */
        String password = "";

        while(i < this.length) {

            // remember '.nextInt(THIS PART!)' defines the range of the random nums
            int num = this.random.nextInt(26);

            chars = "abcdefghijklmnopqrstuvwxyz".charAt(num);
            password = password + chars;
            i++;
        }
        return password;
    }
}

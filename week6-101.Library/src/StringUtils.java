public class StringUtils {

    public static boolean included(String word, String searched) {

        if(word.toUpperCase().contains(searched.trim().toUpperCase())) {
            return true;
        }
        if(word.toLowerCase().contains(searched.trim().toLowerCase())) {
            return true;
        }
        if(word.contains(searched.trim())) {
            return true;
        }
        else {
            return false;
        }
    }
}

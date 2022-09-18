package recursion;

public class Length {
    public static void main(String[] args) {
        System.out.println(length("ace"));
    }

    public static int length(String str) {
        if (str.equals("")) return 0;
        else {
            return 1 + length(str.substring(1));
        }
    }
}

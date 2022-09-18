package recursion;

public class PrintBinary {
    public static void main(String[] args) {
        printbinary(14);
    }

    public static void printbinary(int n){
        if(n<2)System.out.print(n);
        else{
            printbinary(n/2);
            System.out.print(n%2);
        }
    }
}

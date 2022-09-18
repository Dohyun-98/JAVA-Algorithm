package recursion;
//recursion 은 항상 무한 루프에 빠지는 것은 아니다.


public class Code2 {
    public static void main(String[] args) {
        int n = 4;
        func(4);
    }

    public static void func(int k) {
        if (k <= 0) {   //base case 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야 한다.
            return;
        } else {
            System.out.println("Hello...");
            func(k - 1);  // recursion case : recursion을 반복하다보면 결국 base case로 수렴해야 한다.
        }
    }
}

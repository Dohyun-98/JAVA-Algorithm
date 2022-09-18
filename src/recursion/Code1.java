package recursion;

// recursion - 재귀함수
// - 자기 자신을 호출하는 함수
// func 함수를 무한 호출

public class Code1 {
    public static void main(String[] args) {
        func();
    }

    public static void func() {
        System.out.println("Hello");
        func();
    }
}

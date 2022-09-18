package recursion;

//  Euclid : 최대 공약수 구하기
//  수함함수 뿐만 아니라 다른 많은 문제를 recursion으로 해결할 수 있다.

public class Euclid {
    public static void main(String[] args) {

    }

    public static int euclid(int m, int n) {
        if (m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        if (m % n == 0) {
            return n;
        } else {
            return euclid(n, n % m);
        }
    }
}

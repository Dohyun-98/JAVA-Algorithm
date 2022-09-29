package recursion;
// 멱집합
// 임의의 집합 data에서 모든 부분집합을 출력하라
// {a,b,c,d,e,f}의 모든 부분집을 나열하려면
// a를 제외한 {b,c,d,e,f}의 모든 부분집합을 나열하고
// {b,c,d,e,f}의 모든 부분집합에 {a}를 추가 집합들을 나열한다.

//sudo code
// mission : s의 멱집합을 구한 후 각각의 집합 P를 합집합하여 출력하라
// powerSet(P,S)
// if(s is an empty set)
//  print P
// else
// let t be the first element of S;
// powerSet(P,{S-[t})
// powerSet(PU{t},S-[t})

// recursion 함수가 두 개의 집합을 매개변수로 받도록 설계해야 한다는 의미,
// 두 번째 집합의 모든 부분집합들에 첫번째 집합을 합집합하여 출력한다.

public class PowerSet {
    private static char data[] = {'a', 'b', 'c', 'd'};
    private static int n = data.length;
    private static boolean[] include = new boolean[n];
    // include 의 역할은 각 k의 값을 포함하는지 포함하지 않는 지 상태를 표현하여 그 값을
    // 출력할 때 포함할 때만
    public static void powerSet(int k) {
        System.out.format("powerSet(%d) 호출됨.\n", k);
        if (n == k) { //k까지의 모든 boolean 값이 호출되었을 시,
            for (int i = 0; i < n; i++) {
                if (include[i]) System.out.print(data[i] + " ");
            }
            System.out.println();
            return;
        }
        System.out.format("집합 %c 원소는 미포함한 부분집합 구하기 powerSet(%d)\n", data[k], k + 1);
        include[k] = false;
        powerSet(k + 1);
        System.out.format("집합 %c 원소를 포함시킨 부분집합 구하기 powerSet(%d)\n", data[k], k + 1);
        include[k] = true;
        powerSet(k + 1);

    }

    public static void printArray() {
        for (char c : data) {
            System.out.format("%c ", c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        powerSet(0);
    }

}

package backtracking;
// backtracking
// 문제가 해결되지 않을시, 가장 최근의 결정을 번복하여 결과값을 찾아가는 방법

// 상태공간트리
// 찾는 해를 포함하는 트리
// 즉 해가 존재한다면, 그것은 반드시 이트리 어떤 한 노에 해당
// 따라서 이 트리를 체계적으로 탐색하면 해를 구할수 있음

// 되추적 기법(backtracking)
// 깊이 우선 탐색
// 상태 트리 공간을 깊이 우선 탐색하여 해를 구하는 알고리즘을 말한다.
// 재귀함수와 스택으로 구현한다.

// N-Queen 문제
// - 크기가 N x N 인 체스판 위에 퀸 N개가 서로를 공격할 수 없게 놓는 경우의 수를 구하는 문제
// 문제 해결 과정
// 체스판에 퀸을 새롭게 놓을 때마다 확인해야 하는것
// 1. 상하좌우 같은 줄에 이미 위치한 퀸이 존재하는가?
// 2. 대각선 같은 줄에 이미 위치한 퀸이 있는가?
// 3. 현재 놓는 퀸이 N번째 퀸인가?

import java.sql.Array;
import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n값 입력");
        int n = sc.nextInt();


    }




}

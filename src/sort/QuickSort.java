package sort;
// 분할정복법
// 분할 : 배열을 다음과 같은 조건이 만족되도록 두 부분으로 나눈다.
//          elements            <=         element
//         in lower parts               in uppper parts
// 정복 : 각 부분을 순환적으로 정렬한다.
// 합병 : nothing to do

// 퀵 정렬
// 하나의 pivot 을 두고 pivot 보다 작은 값은 pivot 앞쪽 pivot 보다 큰 값은 pivot 뒤쪽으로 정렬
//
// 1. 정렬할 배열이 주어짐. 마지막 수를 기준(pivot)으로 삼는다.
// 2. 기준보다 작은 수는 기준의 오른쪽 나머지는 기준의 오른쪽에 오도록 재분할 한다.
// 3. 기준의 왼쪽과 오른쪽을 각각 순환적으로 정렬한다.(recursion)
// sudo code
//quickSort(A[],p,r){
//    if(p<r)then {
//        q = partition(A,p,r)       //분할
//        quickSort(A,p,q-1);        //왼쪽 부분배열 정렬
//        quickSort(A,q+1,r);        //오른쪽 부분배열 정렬
//        }
//     }
//
//    Partition(A[], p , r){
//    배열 A의 원소들을 A[r]을 기준으로 양쪽으로 재배치하고 A[r]이 자리한 위치를 return 한다.
//    }



// Partition(A,p,r){
// x = A[r]   -> // 인덱스의 마지막 값을 넣고 pivot 으로 설정
// i = p - 1  -> // 인덱스 시작 전 값을 넣고 pivot 보다 작은 값 i로  설정
// for j=p to r-1
//    if A[j] <= x then // 비교할 값이 pivot보다 작다면
//        i = i+1;          // i+1
//        exchange a[i] and A[j]  A[i] 와 A[j]를 교환
// exchangeA[i] and A[r]; 피봇 위치 변경
// return i + 1
public class QuickSort {
}

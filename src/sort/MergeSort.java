package sort;

// 분할정복법을 사용하는 합병정렬
// 분할 : 해결하고자 하는 문제를 작은 크기의 동일한 문제들로 분할
// 정복 : 각각의 작은 문제를 순환적으로 해결
// 합병 : 작은 문제의 해를 합하여(merge) 원래 문제에 대한 해를 구함

// 동일한 알고리즘을 작은 문제를 해결할 때 적용
// recursion 을 사용하여 문제를 해결한다.


// 합병정렬
// 1. 데이터가 저장된 배열을 절반으로 나눈다.
// 2. 각각을 순환적으로 정렬
// 3. 정렬된 두 대그이 배열을 합쳐서 전체 정렬

// 절반으로 배열을 나누다. 배열의 길이가 1이 되면,
//  merge 할 때 정렬이 된다.

// 추가 배열을 이용해서 합병
// 두 개의 배열을 비교하기 위해서는 각 배열의 첫번째 인덱스를 비교한다.


// merge sort는 반복문을 사용하지 않는다.
// 재귀함수를 사용한다.
// 재귀함수는 반복문보다 느리다.
// 재귀함수는 스택을 사용한다.
// 스택은 메모리를 사용한다.

// Time Complexity
// Best : O(n log n)
// Average : O(n log n)
// Worst : O(n log n)



public class MergeSort {
    public static void main(String args[]){

    }

    public static void merge(int data[] , int p, int q, int r){

        int i=p,j=q+1, k=p;

        int tmp[] = new int[data.length];

        while(i<=q && j<=r){     // 한배열이 사라지기 전까지
            if(data[i] <= data[j]){  // 두 배열의 첫번째 인덱스를 비교
                tmp[k++] = data[i++];  // 작은 값을 tmp에 넣고, 그 다음 인덱스를 비교
            }else{ // data[i] > data[j]
                tmp[k++] = data[j++];  // 작은 값을 tmp에 넣고, 그 다음 인덱스를 비교
            }
        }
        while(i<=q){  // 왼쪽 배열이 남아있을 경우
            tmp[k++] = data[i++];  // 남아있는 값을 tmp에 넣는다.
        }
        while(j<=r){   // 오른쪽 배열이 남아있을 경우
            tmp[k++] = data[j++];  // 남아있는 값을 tmp에 넣는다.
        }
        for(i=p; i<=r; i++){ // tmp에 있는 값을 data에 넣는다.
            data[i] = tmp[i]; // tmp에 있는 값을 data에 넣는다.
        }


    }

}

package recursion;
// 순차 검색 : 정렬되어 있지 않을 때 , 조건이 존재하지 않는다면, 배열안에 원하는 값이 존재하는 지 확인하는 알고리즘

public class Search {
    public static void main(String[] args) {

    }

    // 이 함수의 미션은 data[0] ~ data[n-1] 사이에 target을 검색하는 것이다.
    // 하지만 검색 구간의 시작 인덱스 0은 보통 생략한다. 즉 암시적 매개변수이다.
//    public static int search(int data[], int n, int target) {  //data[]:배열 , n:데이터 개수, target:찾는 값
//        for (int i = 0; i < n; i++) {
//            if (data[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }
    //이 함수의 미션은 data[begin]에서 data[end] 사이에 target 검색한다, 즉 검색 구간의 시작점을 명시적으로 지정한다.
    //외부에서 넣어주는 매개변수만을 생각하지말고, 재귀호출시, 필요한 매개변수를 생각하여 설계하여야 한다.
//    public static int search(int data[], int begin,int end, int target){
//        if(begin>end){   //검색할 데이터의 개수
//            return -1;
//        }else if(target==data[begin]){
//            return begin;
//        }else{
//            return search(data,begin+1,end,target);
//        }
//    }


    public static int search(int data[], int begin, int end, int target) {
        if (begin > end) {
            return -1;
        } else {
            int middle = (begin + end) / 2;
            if (data[middle] == target) {
                return middle;
            }
            int index = search(data, begin, middle - 1, target);
            if (index != -1) {
                return index;
            } else {
                return search(data, middle + 1, end, target);
            }
        }
    }

}

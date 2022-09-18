package recursion;

//이진 검색은 데이터가 정렬되어 있을 때 사용하는 검색방법
// 가운데 값을 구하여 가운데 값과 타켓이 같다면 리턴
// 가운데 값보다 타켓이 크다면 뒤쪽으로 재귀함수 호출
// 가운데 값보다 타켓이 작다면 앞쪽으로 재귀함수 호출

public class BinarySearch {
    public static void main(String[] args) {

    }

    public static int binarysearch(String[] items, String target, int begin, int end) {
        if (begin > end) {
            return -1;
        } else {
            int middle = (begin + end) / 2;
            int compResult = target.compareTo(items[middle]);
            if (compResult == 0) {
                return middle;
            } else if (compResult < 0) {
                return binarysearch(items, target, begin, middle - 1);
            } else {
                return binarysearch(items, target, middle + 1, end);
            }
        }
    }
}

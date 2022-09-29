package recursion;

// 입력 : 하나의 binary 이미지
// 각 픽셀은 background pixel이거나 혹은 image pixel
// 서로 연결된 image pixel들의 집합을 Blob이라고 함
// 상하좌우 및 대각 방향으로 인접한 경우 연결된 것으로 간주

// 입력 :
// n * n 크기의 2차원 그리드
// 하나의 좌표(x,y)

//출력 :
// 픽셀 (x,y)가 포함된 blob의 크기
// (x,y)가 어떤 blob에도 속하는 않는 경우에는 0

//recursion think
// 현재 픽셀이 image pixel이 아니라면
// 0을 반환

// 현재 픽셀이 image pixel이라면
// 현재 픽셀을 카운트한다.
// 현재 픽셀이 중복 카운트가 되는것을 막기 위 다른 색으로 칠한다.
// 현재 픽셀이 인접한 셀 검사하여 카운트한다.
// 카운트를 반환한다.


public class CountBlob {
    private static int BACKGROUND_COLOR = 0;
    private static int IMAGE_COLOR = 1;
    private static int ALREADY_COUNTED = 2;
    private static int N = 8;
    public static void main(String[] args) {

    }

    public static int countCell(int x, int y) {
        int result;
         int grid[][] = {
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 1, 0, 1, 1, 0, 1},
                {0, 0, 0, 1, 0, 0, 0, 1},
                {0, 1, 0, 0, 1, 1, 0, 0},
                {0, 1, 1, 1, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 1, 0, 1},
                {0, 0, 0, 1, 0, 0, 0, 1},
                {0, 1, 1, 1, 0, 1, 0, 0}
        };
        if (x < 0 || x >= N || y < 0 || y >= N) {
            return 0;
        } else if (grid[x][y] !=IMAGE_COLOR){
            return 0;
        }else{
            grid[x][y] = ALREADY_COUNTED;
            return 1 + countCell(x - 1, y + 1) + countCell(x, y + 1)
                    + countCell(x + 1, y + 1) + countCell(x - 1, y)
                    + countCell(x + 1, y) + countCell(x - 1, y - 1)
                    + countCell(x, y - 1) + countCell(x + 1, y - 1);

        }
    }
}



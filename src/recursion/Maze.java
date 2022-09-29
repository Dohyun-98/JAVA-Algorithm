package recursion;
// 미로 찾기
//현재 내가 위치한 경로에 출구까지 가려고 하면
//1) 현재 위치가 출구이거 혹은
//2) 이웃한 셀들  하나에서 현재 위치를 지나지 않 출구까지 가는 경로가 있거나


public class Maze {
    private static int N = 8;
    private static int maze[][] = {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 1, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 1, 1, 0, 0},
            {0, 1, 1, 1, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 1, 1, 0, 1, 0, 0}
    };
    private static final int PATHWAY_COLOUR = 0; // WHITE
    private static final int WALL_COLOUR = 1; // BLUE
    private static final int BLOCKED_COLOUR = 2; // RED  visited 이며 출구까지의 경로 경로상에 있지 않음이 밝혀진 cell
    private static final int PATH_COLOUR = 3; // GREEN   visited 이며, 아직 출구로 가는 경로가 될 수 가능성이 있는 cell

    public static void main(String[] args) {
        printMaze(); // 에러
       boolean result =  findMazePath(0,0);
        printMaze(); // 에러
        System.out.println(result);
    }

    public static boolean findMazePath(int x, int y) {
        if (x < 0 || y < 0 || x >= N || y >= N) // 좌표 내 유효한 범위인가를 체크
            return false;
        else if (maze[x][y] != PATHWAY_COLOUR)
            return false;
        else if (x == N - 1 && y == N - 1) {
            maze[x][y] = PATH_COLOUR;
            return true;
        } else {
            maze[x][y] = PATH_COLOUR;
            if (findMazePath(x - 1, y) || findMazePath(x, y + 1) || findMazePath(x + 1, y) || findMazePath(x, y - 1)) { // 탐색하기
                return true;
            }
            maze[x][y] = BLOCKED_COLOUR; // dead end 어떤 방향으로 가도 출구까지 가는 경로가 없다.
            return false;
        }
    }
    public static void printMaze() {
        // 2차원 배열 출력 메서드
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}





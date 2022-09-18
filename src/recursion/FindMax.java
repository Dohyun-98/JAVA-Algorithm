package recursion;

public class FindMax {
    public static void main(String[] args) {

    }
    public  static  int findMax(int[] data,int begin,int end){
        if(begin==end){
            return data[begin];
        }
        else{
            return Math.max(data[begin],findMax(data,begin+1,end));
        }
    }
}



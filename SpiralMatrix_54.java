import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
    public static void main (String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List <Integer> list = spiralOrder(matrix);
        list.forEach(System.out::print);
        System.out.println();

        int[][]matrix2 = {{1,2},{3,4}};
        list = spiralOrder(matrix2);
        list.forEach(System.out::print);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int rowStart = 0;
        int columnStart = 0;
        int rowEnd = matrix.length;
        int columnEnd = matrix[0].length;
        while (rowStart < rowEnd && columnStart < columnEnd) {
            for(int i=columnStart; i<columnEnd; i++) {
                list.add(matrix[rowStart][i]);
            }
            rowStart++;
            for (int i=rowStart; i < rowEnd; i++) {
                list.add(matrix[i][columnEnd-1]);
            }
            columnEnd--;

            if (!(columnStart < columnEnd && rowStart < rowEnd))
                break;

            for (int i=columnEnd-1; i >= columnStart; i--) {
                list.add(matrix[rowEnd-1][i]);
            }
            rowEnd--;
            for (int i=rowEnd-1; i >= rowStart; i--) {
                list.add(matrix[i][columnStart]);
            }
            columnStart++;
        }
        return list;
    }
}

public class numOfIslands_200 {
    public static void main(String[] args) {
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(numIslands(grid));
    }
    public static int numIslands(char[][] grid) {
        int numOfIslands = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    numOfIslands++;
                    updateFoundLand(grid, i, j);
                }
            }
        }
        return numOfIslands;
    }

    public static void updateFoundLand(char[][] grid, int r, int c) {
        if (r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c] != '1')
            return;
        grid[r][c] = '2';
        updateFoundLand(grid, r-1, c);
        updateFoundLand(grid, r+1, c);
        updateFoundLand(grid, r, c-1);
        updateFoundLand(grid, r, c+1);
    }
}

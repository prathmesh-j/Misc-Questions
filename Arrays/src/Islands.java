/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 * Example
 * 11000
 * 11000
 * 00100
 * 00011
 * Answer = 3
 */
public class Islands {
    public static void main(String[] args) {
     int[][] map = {{1,1,1,1,0},
                    {1,1,0,1,0},
                    {1,1,0,0,0},
                    {0,0,0,0,0}};

     int[][] map2 = {{1,1,0,0,0},
                     {1,1,0,0,0},
                     {0,0,1,0,0},
                     {0,0,0,1,1}};

     System.out.println(numberOfIslands(map));
     System.out.println(numberOfIslands(map2));
    }

    public static int numberOfIslands(int[][] map) {
        int islands = 0;
        for (int i=0;i<map.length;i++) {
            for (int j=0;j<map[0].length;j++) {
                if (map[i][j] == 1){
                    islands++;
                    exploreIsland(map, i, j);
                }
            }
        }

        return islands;
    }

    public static void exploreIsland(int[][] map, int i, int j) {

        if (i<0 || j<0 || i>= map.length || j>= map[i].length || map[i][j] != 1)
            return;

        map[i][j] = 0;

        exploreIsland(map, i, j-1);
        exploreIsland(map, i, j+1);
        exploreIsland(map, i+1, j);
        exploreIsland(map, i-1, j);
        // if diagonal 1's are also to be considered
        // We may want to check a 8-point connection instead of a 4 point
        // exploreIsland(map, i+1, j+1);
        // exploreIsland(map, i-1, j+1);
        // exploreIsland(map, i+1, j-1);
        // exploreIsland(map, i-1, j-1);

        return;
    }
}

package Backtracking;

public class ObstacleMaze {

    public static void main(String[] args) {
        boolean [][] maze={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        System.out.println("the paths are:");
        obstacle("", maze, 0, 0);
    }

        static void obstacle(String ans,boolean[][] maze,int r,int c){
            if(r==maze.length-1 && c==maze[0].length-1){
                System.out.println(ans);
                return;
            }

            //obstacle
            if(maze[r][c]==false){
                return;
            }

            if(r<maze.length-1){
                obstacle(ans+'D', maze, r+1, c);
            }
            if(c<maze[0].length-1){
                obstacle(ans+'R', maze, r, c+1);
            }
        }
    
}

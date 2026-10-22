package Backtracking;

public class AllPath {
    public static void main(String[] args) {
        boolean [][] maze={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        System.out.println("the paths are:");
        allpath("", maze, 0, 0);
    }

        static void allpath(String ans,boolean[][] maze,int r,int c){
            if(r==maze.length-1 && c==maze[0].length-1){
                System.out.println(ans);
                return;
            }

            if(maze[r][c]==false){
                return;
            }
            //if its false i m considering its block in path
            maze[r][c]=false;

            if(r<maze.length-1){
                allpath(ans+'D', maze, r+1, c);
            }
            if(c<maze[0].length-1){
                allpath(ans+'R', maze, r, c+1);
            }
            if(r>0){
                allpath(ans+'U',maze,r-1,c);
            }
            if(c>0){
                allpath(ans+'L', maze, r, c-1);
            }
            //this is where a function is over
            // so before the function get removed from stack,also remove the changes which we made
            maze[r][c]=true;
        }
}

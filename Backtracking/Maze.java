package Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(pathRet("",3, 3));
        // mazePath("", 3, 3);
        System.out.println( diagonalPath("", 3, 3));
    }

    static int maze(int r,int c){
        if(r==1||c==1){
            return 1;
        }

        int down=maze(r-1, c);
        int right=maze(r, c-1);

        return down+right; //count from both right and left side 
    }
    

    // finding the path
    static void mazePath(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            // going down
            mazePath(p+'D', r-1, c);
        }
        if(c>1){
            // going Right
            mazePath(p+'R', r, c-1);
        }
    }

    //returning all the paths in arraylist
    static ArrayList<String> pathRet(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list=new ArrayList<>();

        if(r>1){
            // going down
            list.addAll(pathRet(p+'D', r-1, c));
        }
        if(c>1){
            // going Right
            list.addAll(pathRet(p+'R', r, c-1));
        }
        return list;
    }

    static ArrayList <String> diagonalPath(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList <String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList <String> list=new ArrayList<>();

        if(r>1){
            // going down
            list.addAll(diagonalPath(p+'D', r-1, c));
        }
        if(c>1){
            // going Right
            list.addAll(diagonalPath(p+'R', r, c-1));
        }
        if(r>1 &&c>1){
            list.addAll(diagonalPath(p+'d', r-1, c-1));
        }

        return list;
    }

}

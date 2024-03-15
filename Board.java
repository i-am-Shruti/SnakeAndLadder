package board;

import java.util.HashMap;
//import java.util.Scanner;
import jumper.Jumper;
public class Board {
   int size;
   public String board[][];
   //jumpers 
   public HashMap<String, Jumper>jumpers;

   public Board(int size,HashMap<String, Jumper> jumpers){
    this.size = size;
   this.jumpers= jumpers;

    board = new String[size][size];
    int cnt =1;
for(int i=size-1;i>=0;i--){
        if(i%2!=0){
            for(int j=0;j<size;j++){
            board[i][j]= cnt+"";
            cnt++;
        }
    }else{
            for(int col=size-1;col>=0;col--){
                board[i][col]=cnt+"";
                cnt++;
            }
        }
    }
}
public  int getBoardSize(){
 return this.size;
}
public void printBoard(){
for(int i=0;i<size;i++){
for(int j=0;j<size;j++){
   System.out.print(board[i][j]+" ");
}
System.out.println();
}
}
}
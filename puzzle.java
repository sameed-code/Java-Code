/*
 * Project_2:  Part 2.
 * Code has written by Syed Qaddri.
 * LSC# 7480513
 * To Nina Javaher.
 */

package puzzle;
import java.util.*; 
import java.util.ArrayList;						//importing a library for an ArrayList

public class puzzle {										//My class starts from here.
  
   static boolean Board = false;
   static int[] R = {-1,1};									//This line is for rows
   static int[] C = {-2,2};									//This line is for columns
   static ArrayList<Integer> path;       
  
   
   //BoardSize * boardSize
  
   public static boolean isRowColValid(int x,int y,int sizeoftheBoard) {
       if(x < 0 || x >= sizeoftheBoard)
           return false;
       if(y < 0 || y >= sizeoftheBoard)
           return false;
       return true;
   }
  
   public static boolean Stack(ArrayList<Integer> stack,int pos) {    //Function for getting a position
       for(int a : stack) {
           if(pos == a) {
               return true;
           }
       }
       return false;
   }
  
   public static void dfs(ArrayList<Integer> stack,int curPos,int sizeoftheBoard) {
      
       //if we have already traversed the chess board in the desired way, no need to find other possible routes
       if(Board) {
           return;
       }
      
       //if number of elements in the stack is equal to the boardSize then we have found the desired path and thus we can return
       int n = stack.size();
       if(n == sizeoftheBoard*sizeoftheBoard) {
           Board = true;
           for(int i : stack) {
               path.add(i);
           }
           return;
       }
      
      
       // getting row and column
       int row = (curPos - 1)/sizeoftheBoard;				
       /*
        * Basically creating these column and row variable for a position.
       */
       int col = (curPos - 1) % sizeoftheBoard;
      
       // valid row and column should be between 0 .. boardSize-1
       for(int i : R) {
           for(int j : C) {
               int currentRow = row + i;					//This line is for the new row
               int currentCol = col + j;					//This line is for the new column
               if( isRowColValid(currentRow,currentCol,sizeoftheBoard) && !Stack(stack,currentRow*sizeoftheBoard+currentCol+1) ) {
                   // Adding a newPosition into the stack
                   stack.add(currentRow*sizeoftheBoard+currentCol+1);
                   dfs(stack, currentRow*sizeoftheBoard+currentCol+1, sizeoftheBoard);
                   
                   stack.remove(stack.size()-1); 				// Removing new position from the stack
               }
           }
       }
      
       for(int i : C) {
           for(int j : R) {
               int currentRow = row + i;
               int currentcolumn = col + j;
               if( isRowColValid(currentRow,currentcolumn,sizeoftheBoard) && !Stack(stack,currentRow*sizeoftheBoard+currentcolumn+1) ) {
                   // add newPos to the stack
                   stack.add(currentRow*sizeoftheBoard+currentcolumn+1);
                   dfs(stack, currentRow*sizeoftheBoard+currentcolumn+1, sizeoftheBoard);
                   // remove newPos from the stack
                   stack.remove(stack.size()-1);
               }
           }
       }
   }
  
  
   public static void main(String[] args) {
      
       //BoardSize * boardSize
       int boardSize = 5;				//Setting boardsize variable = 5
      
       // Give the starting position for the knight
       int curPos = 1;					//Current index
      
      
       ArrayList<Integer> stack = new ArrayList<Integer>();
       path = new ArrayList<Integer>(boardSize*boardSize);
      
       //pushing top element in stack
       stack.add(curPos);
       dfs(stack, curPos , boardSize);
       stack.remove(stack.size()-1);
            
       if(!Board) {					//Conditions applying for if and else statement 
           System.out.println("At this time Knight Tour is not possible for " + boardSize + " * " + boardSize);
       }else {
           System.out.println("Knight's Tour on a " + boardSize + " * " + boardSize + " chess board\n");
           int[][] board = new int[boardSize][boardSize];
           int count = 1;
           for(int i : path) {
               //System.out.println(i);
               System.out.println("Proceed to " + count + " at square number "+ i);
               board[(i-1)/boardSize][(i-1)%boardSize] = count;
               count += 1;
           }
          
          
           System.out.println("\nChess Board: ");
           for(int i=0;i<boardSize;i++) {						//Starting For loops here
               for(int j=0;j<boardSize;j++) {
                   System.out.format("%4d",board[i][j]);
                   System.out.print(" --> ");
               }
               System.out.println();
           }
       }
      
   }

}  //End of the Program
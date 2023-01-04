import java.io.*;
import java.util.*;

// Created Matrix with values range [0,100]
// 33 13 50 26 
// 89 81 97 64 
// 70 5 74 26 
// 91 40 72 35 
// Sort Matrix with Column index 1
// 33 5 50 26 
// 89 13 97 64 
// 70 40 74 26 
// 91 81 72 35

class GFG {
    public static int[][] createMatrix(int n,int m){
        int [][]arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=(int)(Math.random() * 101);
            }
        }
        return arr;
    }
    public static int[][] sortMatrixBasedOnColumn(int [][]arr,int columnInd){
        int n=arr.length;
        int m=arr[0].length;
        
        List<Integer> list=new ArrayList<Integer>();  
        for(int i=0;i<n;i++){
            list.add(arr[i][columnInd]);
        }
        
        Collections.sort(list);
        for(int i=0;i<n;i++){
            arr[i][columnInd]=list.get(i);
        }
        
        return arr;
    }
	public static void main (String[] args) {
	    int [][]arr = createMatrix(4,4);
	    
	    System.out.println("Created Matrix with values range [0,100]");
	    for(int i=0;i<4;i++){
	        for(int j=0;j<4;j++){
	            System.out.print(arr[i][j] + " ");
	        }
	        System.out.println();
	    }
	    
		System.out.println("Sort Matrix with Column index 1");
		int [][]sortArr = sortMatrixBasedOnColumn(arr,1);
		for(int i=0;i<4;i++){
	        for(int j=0;j<4;j++){
	            System.out.print(arr[i][j] + " ");
	        }
	        System.out.println();
	    }
	    
	}
}
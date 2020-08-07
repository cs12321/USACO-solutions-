package USACO;
import java.util.*;
import java.io.*;

public class planting_silver {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("planting.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("planting.out")));
    StringTokenizer st = new StringTokenizer(br.readLine()); 
    int n = Integer.parseInt(st.nextToken()); int[] array = new int[n]; 
    for (int i = 0; i < n-1; i++) {
   	 st = new StringTokenizer(br.readLine()); 
   	 int a = Integer.parseInt(st.nextToken()); int b = Integer.parseInt(st.nextToken()); 
   	 array[a-1]++; array[b-1]++; 
    }
    int max = 0; 
    for (int j = 0; j < array.length; j++) {
   	 max = Math.max(array[j], max); 
    }
    out.println(max+1); out.close(); 
    
        
  }
}
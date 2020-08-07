package USACO;

import java.util.*;
import java.io.*;

public class mountains_silver {

  public static void main(String[] args) throws IOException {
	  	 BufferedReader br = new BufferedReader(new FileReader("mountains.in"));
	    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mountains.out")));
	    StringTokenizer st = new StringTokenizer(br.readLine()); 
	    int n = Integer.parseInt(st.nextToken()); 
	    int[] xcoord = new int[n]; int[] ycoord = new int[n]; 
	    for (int i = 0; i < n; i++) {
	   	 st = new StringTokenizer(br.readLine());
	   	 xcoord[i] = Integer.parseInt(st.nextToken()); 
	   	 ycoord[i] = Integer.parseInt(st.nextToken()); 
	    }
	    int count = 0; boolean bool = false; 
	  for (int j = 0; j < n; j++) {	
		  bool = true;
		  for (int k = 0; k < n; k++) {
		   
			  if ( k == j)
				  continue; 
			  if (!calc(xcoord[j], ycoord[j], xcoord[k], ycoord[k])) { 
				 bool = false;
				 break; 
			  }
		  }
			 if (bool) 
				 count++;
		  
		 
			  
	  }

	  pw.println(count); pw.close(); 

	  
  }
  
  public static boolean calc(int x, int y, int x1, int y1) {
	  if ( y > (x1-x+y1) || y > (x-x1+y1))
			  return true;
	  return false; 
  }
}

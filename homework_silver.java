package USACO;

import java.io.*;
import java.util.*;

public class homework_silver {
	public static void main(String[] args) throws IOException {
	  	 BufferedReader br = new BufferedReader(new FileReader("homework.in"));
	    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("homework.out")));
	    StringTokenizer st = new StringTokenizer(br.readLine()); 
	    int n = Integer.parseInt(st.nextToken()); 
	    double min = Integer.MAX_VALUE; 
	    double sum = 0; 
	    ArrayList<Double> m_avg = new ArrayList<>(); 
	    double avg = 0; 
	    double temp = 0; 
	    double[] list = new double[n];
	    st = new StringTokenizer(br.readLine()); 
	    for (int g = 0; g < n; g++)
	   	 list[g] = Integer.parseInt(st.nextToken());
	    
	    
	    for (int j = n-1; j >= n-2; j--) {
	   	 double a = list[j];
	   	 sum += a; 
	   	 min = Math.min(min, a);
	   	 avg = sum-min; 
	    }
	    
	    m_avg.add((double)n-2); 
	   
	    for (int i = n-3; i > 0; i--) {
	   	 double num = list[i];
	   	 sum += num; 
	   	 min = Math.min(min, num);
	   	 
	   	 temp = (sum-min)/(n-i-1); 
	   	
	   	 if (temp > avg) {
	   		 m_avg.clear();
	   		 m_avg.add((double) (i));
	   		 avg = temp;
	   		 
	   	 }
	   	 else if (temp == avg) {
	   		 m_avg.add((double)(i)); 
	   		 
	   	 }
	   	 
	    }
	    Collections.sort(m_avg);
	    
	    for (double b: m_avg) 
	   	 pw.println((long)b); 
	    
	    pw.close();
 }

}

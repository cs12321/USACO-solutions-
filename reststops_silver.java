package USACO;
import java.util.*;
import java.io.*;

public class reststops_silver {

  public static void main(String[] args) throws IOException {
	  	 BufferedReader br = new BufferedReader(new FileReader("reststops.in"));
	    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("reststops.out")));
	    StringTokenizer st = new StringTokenizer(br.readLine()); 
	    int L = Integer.parseInt(st.nextToken());
	    int n = Integer.parseInt(st.nextToken());
	    int fj = Integer.parseInt(st.nextToken());
	    int bessie = Integer.parseInt(st.nextToken());
	    
	    TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>(); 
	    for (int i = 0; i < n; i++) {
	   	 st = new StringTokenizer(br.readLine());
	   	 int g = Integer.parseInt(st.nextToken()); int f = Integer.parseInt(st.nextToken());
	   	 map.put(f, g); 
	    }
	    long grass = 0L; 
	    int track = 0; 
	   
	   
	    
	    while (map.size() > 0) {
	   	  
	   	 int lastKey = map.lastKey(); 
	   	 int time = map.get(map.lastKey()); 
	   	 
	   	if (time > track) {	
	   	 long diff = (long) (time-track)*(fj-bessie); 
	   	 grass += (long) lastKey*diff; 
	   	 map.remove(lastKey);
	   	 track = time; 
	   	}
	   	 else map.remove(lastKey); 
	    }
	   
	   
	
	    
	    pw.println(grass);
	    
	    pw.close();
  }
}
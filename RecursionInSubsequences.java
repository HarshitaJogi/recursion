import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RecursionInSubsequences{

	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

	public static void main(String[] args) {
		

		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		FastReader sc = new FastReader();
		
        int [] arr = {3, 1, 2};
        int n = 3;
        ArrayList <Integer> ds = new ArrayList<Integer>();
        printF(0, ds, arr, n);

	}

    // getting the nth term of fibonacci series
    static void printF(int index, ArrayList <Integer> ds, int arr[], int n){

        if(index == n){
            for(Integer it: ds){
                System.out.print(it + " ");
            }
            // if you want to print the empty array also
            if(ds.size() == 0){
                System.out.println("{}");
            }
            System.out.println();
            return;
        }

        // take or pick the particular index into the sequence
        ds.add(arr[index]);
        printF(index+1, ds, arr, n);
        // removing last element from list
        int l = ds.size()-1;
        ds.remove(l);

        // not pick or not take condition
        printF(index+1, ds, arr, n);
    }

    
}
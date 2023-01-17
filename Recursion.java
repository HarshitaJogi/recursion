import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Recursion{

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
		
        // String name = "Harshita";
        // int count = 0;
        //name(name, count);

        int n = 1;
        //OneToN(1, n);
        NtoOne(n, 10);

	}

    // print name 5 times
    static void name(String name, int count){

        if(count == 5){
            return;
        }

        System.out.println(name);
        count++;
        name(name, count);
        

    }

    // print linearly from one to n
    static void OneToN(int i, int n){

        if(i > n){
            return;
        }

        System.out.println(i);
        OneToN(i+1, n);

    }

    // print linearly from n to one
    static void NtoOne(int n, int i){
        if(i < n){
            return;
        }

        System.out.println(i);
        NtoOne(n, i-1);
    }

}
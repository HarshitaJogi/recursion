import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ParameterizedAndFunctionalRecursion{

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
		
        int n = 3;
        int sum=0;
        parameterized(n, sum);
        System.out.println(functional(n));
        System.out.println(factorial(n));


	}

    // parameterized recursion : print sum of first n numbers
    static void parameterized(int n, int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }

        parameterized(n-1, sum+n);
    }

    // functional recursion : print sum of first n numbers
    static int functional(int n){

        if(n==0){
            return 0;
        }

        return n + functional(n-1);
    }

    // print factorial of n 
    static int factorial(int n){
        if(n == 1){
            return 1;
        }

        return n*factorial(n-1);
    }
}
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Functional{

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
		//FastReader sc = new FastReader();
        Scanner sc = new Scanner(System.in);

        // int [] arr = {2, 6, 1, 8};
        // int l = 0;
        // int r = arr.length-1;
        // reverse_parameterized(arr, l, r);
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        String s = "madam";
        int i=0;
        System.out.println(isPalindrome(s, i));
		

	}

    // reverse an array using two pointers
    static void reverse_parameterized(int arr[], int l, int r){
        if(l>=r){
            return;
        }

        int temp=0;
        temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse_parameterized(arr, l+1, r-1);

    }

    // check if string is palindrome or not using functional recursion
    static boolean isPalindrome(String s, int i){
        int l = s.length()-1;

        if(i >= s.length()/2){
            return true;
        }

        if(s.charAt(i) != s.charAt(l-i)){
            return false;
        }

        return isPalindrome(s, i+1);

    }
}
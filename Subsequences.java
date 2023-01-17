import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Subsequences{

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
		
        int [] arr = {1, 2, 1};
        int n = 3;
        int sum = 2;
        ArrayList <Integer> ds = new ArrayList<Integer>();
        //printS(0, ds, 0, sum, arr, n);
        System.out.println(printS(0, ds, 0, sum, arr, n));


	}

    // to print all those subsequences whose sum = sum (here 2) where every element can be picked only once
    // static void printS(int index, ArrayList <Integer> ds, int s, int sum, int arr[], int n){

    //     if(index == n){
    //         if(s == sum){
    //             for(Integer it: ds){
    //                 System.out.print(it + " ");
    //             }
    //             System.out.println();
    //         } 
    //         return;
    //     }

    //     // take or pick the particular index into the sequence
    //     ds.add(arr[index]);
    //     s = s + arr[index];
    //     printS(index+1, ds, s, sum, arr, n);
    //     s = s - arr[index];
    //     // removing last element from list
    //     int l = ds.size()-1;
    //     ds.remove(l);

    //     // not pick or not take condition
    //     printS(index+1, ds, s, sum, arr, n);
    // }


//------------------------------------------------------------------------------


    // to print only one subsequence whose sum is sum
    // static boolean printS(int index, ArrayList <Integer> ds, int s, int sum, int arr[], int n){

    //     if(index == n){
    //         if(s == sum){
    //             for(Integer it: ds){
    //                 System.out.print(it + " ");
    //             }
    //             System.out.println();
    //             return true;
    //         } 
    //         else return false;
    //     }

        
    //     ds.add(arr[index]);
    //     s = s + arr[index];

    //     if(printS(index+1, ds, s, sum, arr, n) == true){
    //         return true;
    //     }

    //     s = s - arr[index];
    //     int l = ds.size()-1;
    //     ds.remove(l);

    //     // not pick or not take condition
    //     if(printS(index+1, ds, s, sum, arr, n) == true){
    //         return true;
    //     }

    //     return false;
    // }


//-------------------------------------------------------------------------------


    // to count the number of subsequences with sum = sum
    static int printS(int index, ArrayList <Integer> ds, int s, int sum, int arr[], int n){

        if(index == n){
            // condition satisfies
            if(s == sum){
                return 1;
            } 
            // condition not satisfied
            else return 0;
        }

        s = s + arr[index];
        int l = printS(index+1, ds, s, sum, arr, n);
        
        s = s - arr[index];
        // not pick or not take condition
        int r = printS(index+1, ds, s, sum, arr, n);
        

        return l+r;
    }

}
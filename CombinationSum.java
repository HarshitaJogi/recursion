import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CombinationSum{

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

        //Solution s = new Solution();
		
        int [] candidates = {3, 4, 1, 0};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());

        for(List<Integer> it: ans){
            System.out.println(it);
        }


	}

    static void findCombinations(int index, int arr[], int target, List<List<Integer>> ans, List<Integer> ds){
        if(index == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[index] <= target){
            ds.add(arr[index]);
            findCombinations(index, arr, target-arr[index], ans, ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(index+1, arr, target, ans, ds);

    }
}

// class Solution{

//     public void findCombinations(int index, int arr[], int target, List<List<Integer>> ans, List<Integer> ds){
//         if(index == arr.length){
//             if(target == 0){
//                 ans.add(new ArrayList<>(ds));
//             }
//             return;
//         }

//         if(arr[index] <= target){
//             ds.add(arr[index]);
//             findCombinations(index, arr, target-arr[index], ans, ds);
//             ds.remove(ds.size()-1);
//         }
//         findCombinations(index+1, arr, target, ans, ds);

//     }
// }
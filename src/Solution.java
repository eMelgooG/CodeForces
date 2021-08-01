import java.io.*;
import java.util.*;
import java.math.*;
//@SuppressWarnings("unused")

public class Solution {

    private static void one() throws Exception {
        rl();
        int n = nin();

        int[] a = new int[n];




    }

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl();
        int t = nin() ;
        for(int i =1 ;i<=t;i++) {
            one();
        }
        bw.flush();
    }

    //helper methods and classes
    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;

    static void rl() throws Exception{
        st = new StringTokenizer(br.readLine());
    }
    static long nlo(){
        return Long.parseLong(st.nextToken());
    }
    static int nin(){
        return Integer.parseInt(st.nextToken());
    }
    /*private static void te(){
      }*/
    static double ndo(){
        return Double.parseDouble(st.nextToken());
    }
    static char[] nca(){
        return st.nextToken().toCharArray();
    }


    //helper class
    static class Pair<T,K>{
        T first;
        K second;
        Pair(T first,K second) {
            this.first = first;
            this.second = second;
        }

        public Pair() {

        }
    }
}

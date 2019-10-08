import java.io.*;
import java.util.*;

public class mixmilk {

    static int[] currentFill = new int[3];
    static int[] capcity = new int[3];
    public static void pour(int index1, int index2){
        int amountPoured = Math.min(currentFill[index1], capcity[index2] - currentFill[index2]);
        currentFill[index1] -= amountPoured;
        currentFill[index2] += amountPoured;
//        System.out.println(Arrays.toString(currentFill));
    }
    public static void main(String[] args) throws Exception {
//        FastScanner input = new FastScanner(System.in);
//        PrintWriter out = new PrintWrite(System.out);

      FastScanner input = new FastScanner("mixmilk.in");
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));

        for (int i = 0; i < 3; i++){
            capcity[i] = input.nextInt();
            currentFill[i] = input.nextInt();
        }

        for (int i = 0; i < 33; i++){

            pour(0, 1);
            pour(1, 2);
            pour(2, 0);
        }
        pour(0, 1);
        for (int i = 0; i < 3; i++){
            out.println(currentFill[i]);
        }
        out.close();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream));
            st = new StringTokenizer("");
        }

        public FastScanner(String fileName) throws Exception {
            br = new BufferedReader(new FileReader(new File(fileName)));
            st = new StringTokenizer("");
        }

        public String next() throws Exception {
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        public int nextInt() throws Exception {
            return Integer.parseInt(next());
        }

        public long nextLong() throws Exception {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws Exception {
            return Double.parseDouble(next());
        }

        public String nextLine() throws Exception {
            if (st.hasMoreTokens()) {
                StringBuilder str = new StringBuilder();
                boolean first = true;
                while (st.hasMoreTokens()) {
                    if (first) {
                        first = false;
                    } else {
                        str.append(" ");
                    }
                    str.append(st.nextToken());
                }
                return str.toString();
            } else {
                return br.readLine();
            }
        }
    }
}

import java.io.*;
import java.util.*;

public class template {
    public static void main(String[] args) throws Exception {
        FastScanner input = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
//      FastScanner input = new FastScanner("file_name_here.in");
//      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("file_name_here.out")));
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

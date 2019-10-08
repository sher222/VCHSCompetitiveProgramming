import java.io.*;
import java.util.Scanner;

public class milkFarm {
    static bucket buckets[] = new bucket[3];
    static void printBuckets(PrintWriter out) {
	int i;
	for(i=0;i < 3;i++) {
	    out.println(buckets[i].milkIn());
	}
    }
    static void printBuckets(PrintStream out) {
	int i;
	for(i=0;i < 3;i++) {
	    out.print(" "+buckets[i].milkIn());
	}
	out.println();
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
	File file = new File("mixmilk.in");
	FileWriter outWriter = new FileWriter("mixmilk.out");
	PrintWriter out = new PrintWriter(outWriter);
	Scanner sc = new Scanner(file);
	int i;

	for(i=0;i<3;i++) {
	    buckets[i] = new bucket(sc.nextInt(),sc.nextInt());
	    sc.nextLine();
	}
	System.out.print("Initial state: ");
	printBuckets(System.out);
	for(i=0;i<100;i++) {
	    buckets[(i+1)%3].pour(buckets[(i%3)]);
	    System.out.print((i+1)+". Pour "+(i%3+1)+"->"+((i+1)%3+1)+" ");
	    printBuckets(System.out);
	}
	printBuckets(out);
	out.close();
    }
}
 

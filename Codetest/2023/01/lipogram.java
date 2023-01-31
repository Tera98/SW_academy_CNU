import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        str = str.toLowerCase(Locale.ROOT);
        List<Integer> arr = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            arr.add(str.codePointAt(i));
        }
        String output = "NO";
        for (int i = 97; i < 123; i++) {
            if (!arr.contains(i)) {
                output = "YES";
                out.add(i);
            }
        }
        bw.write(output + "\n");
        bw.flush();
        if (output.equals("YES")) {
            for (int integer : out) {
                bw.write((char) integer);
                bw.flush();
            }
        }
        bw.close();
    }
}

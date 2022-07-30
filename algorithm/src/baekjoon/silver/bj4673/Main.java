package baekjoon.silver.bj4673;


import java.util.ArrayList;

public class Main {
    public void solution() {
        int n = 0;
        String nStr = "";
        int dn = 0;
        ArrayList list = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            n = i;
            dn += n;
            nStr = String.valueOf(n);

            for (String s: nStr.split("")) {
                dn += Integer.parseInt(s);
            }

            if (!list.contains(dn)) {
                list.add(dn);
            }

            n = 0;
            dn = 0;
        }

        for (int i = 1; i <= 10000; i++) {
            if (!list.contains(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.solution();
    }
}

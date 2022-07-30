package codingtestinflearn.string.string2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainOthers {
    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) { // 대문자는 아스키코드 65 ~ 90, 소문자는 97 ~ 122이다. 동일 알파벳의 대소문자는 32다.
                answer += (char) (str.charAt(i) + 32);
            } else {
                answer += (char) (str.charAt(i) - 32);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        MainOthers m = new MainOthers();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();

        System.out.println(m.solution(str));
    }
}

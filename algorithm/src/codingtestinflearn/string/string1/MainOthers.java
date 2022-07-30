package codingtestinflearn.string.string1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainOthers {
    public int solution(String str, char c) {
        int answer = 0;

        // str과 c를 모두 대문자로 변환한다.
        str = str.toUpperCase();
        c = Character.toUpperCase(c); // Character.toUpperCase(char), Character.toLowerCase(char)로 문자의 대소문자 변환이 가능함.

        for (char check: str.toCharArray()) { // 문자열.toCharArray()를 통해 해당 문자열의 구성 문자를 원소로 가지는 char[]를 생성함.
            if (c == check) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        MainOthers m = new MainOthers();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char c = br.readLine().charAt(0);

        System.out.println(m.solution(str, c));
    }
}

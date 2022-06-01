package String;
import java.util.*;

/*

설명
한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

입력
첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
문자열은 영어 알파벳으로만 구성되어 있습니다.

출력
첫 줄에 해당 문자의 개수를 출력한다.

예시 입력 1                  예시 출력 1

Computercooler              2
c

*/

public class First_Find_text {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        // System.out.println(str);
        /*for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==t) answer++; // charAt: string을 index로 접근하는것 (index로 탐색)
        }
*/

        // 향상된 for문
        for (char x : /*배열이나 collection framework가 와야됨 */ str.toCharArray()) { // toCharArray() : 문자 한개한개를 분리하여 문자 배열을 생성해줌
            if (x == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        First_Find_text T = new First_Find_text();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0); // kb.next()는 문자열을 읽은 상태에서 charAt()의 0번째 함수를 가져와라
        System.out.print(T.solution(str, c));

    }
}

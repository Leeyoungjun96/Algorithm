package String;

import java.util.*;

/*
* 설명
대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

* 입력
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
문자열은 영어 알파벳으로만 구성되어 있습니다.

* 출력
첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.

* 예시 입력 1
StuDY

* 예시 출력 1
sTUdy
*/

public class Second_Case_Conversion {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) { // toCharArray: string을 기반으로한 문자배열 생성( 문자를 하나하나 뽑아서 배열로 만들어줌)
            /*if (Character.isLowerCase(x)) // 만약 Character가 lowercase 이면
                answer += Character.toUpperCase(x); // answer에 character을 uppercase로 변경
            else
                answer += Character.toLowerCase(x); // lowercase가 아니면 lowercase로 변경하여 answer에 추가해 줌*/
            // 아스키 코드로 하는법
            if(x >= 97 && x <= 122)  // 대문자
                answer += (char)(x-32); // 32를 빼서 소문자로 바꾼고 cast한뒤 더함
            else
                answer += (char)(x+32);

        }
        return answer;
    }

    public static void main(String[] args) {
        Second_Case_Conversion T = new Second_Case_Conversion();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));

    }
}

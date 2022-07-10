public class FindTheBug {
    public int findTheBug(String word) {
        // TODO:
        int cnt = word.length();

        for (int i=0; i<cnt; i++) {
            if (word.charAt(i)=='#') {
                return i;
            }
        }
        return -1;    // 조건 충족하지 않으면 -1 값 리턴
    }
}
/*
문자열을 입력받아 버그('#')의 인덱스를 리턴해야 합니다.
int 타입을 리턴해야 합니다.
반복문(for)문을 사용해야 합니다.
'#' 기호가 없는 경우 -1을 리턴해야 합니다.

모든 문자열의 인덱스는 0부터 시작합니다.
String타입의 문자열에서 한가지 문자(char)타입의 값을 사용하려면 word.charAt(문자열의 인덱스) 명령어를 사용해야 합니다

 */

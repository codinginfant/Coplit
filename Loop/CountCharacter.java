public class CountCharacter {
    public int countCharacter(String str, char letter) {
        // TODO:
        int cnt = str.length();
        int x = 0;

        for (int i=0; i<cnt; i++) {
            if (str.charAt(i)==letter) {
                x++;
            }    //else 없으면 그냥 넘어가버림
        }
        return x;
    }
}
/*
문자열과 문자를 입력받아 문자열에서 문자(letter)가 등장하는 횟수를 리턴해야 합니다.
int 타입을 리턴해야 합니다.
반복문(for)문을 사용해야 합니다.
빈 문자열을 입력받은 경우, 0을 리턴해야 합니다.
 */
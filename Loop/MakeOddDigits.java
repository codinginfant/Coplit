public class MakeOddDigits {
    public String makeOddDigits(int num) {
        // TODO:
        String result = "";
        int i = 1;
        int cnt = 0;

        while (cnt<num) {
            result += i;
            i += 2;
            cnt ++;
        }
        return result;
    }
}


/*
수(num)를 입력받아 1을 포함하여 num개의 홀수로 구성된 문자열을 리턴해야 합니다.
반복문(while)문을 사용해야 합니다.
숫자(number string) 사이의 구분은 없습니다. ('13579')

int i =1; i<=num; i+2


while문
"+ ~~ +"

*/


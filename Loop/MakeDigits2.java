public class MakeDigits2 {
    public String makeDigits2(int num) {
        // TODO:
        int i = 1;
        String result = ""; // 변수 밖에 빼주고
        while (i<=num) {
            if (i==1) {
                result += i;
            }
            else {
                result = result + '-' + i;
            }
            i++;
        }
        return result;
    }
}
/*
string 타입을 리턴해야 합니다.
반복문(while)문을 사용해야 합니다.
for문 사용은 금지됩니다.
숫자(number string) 사이를 '-'로 구분합니다. ('1-2-3-4-5'
 */
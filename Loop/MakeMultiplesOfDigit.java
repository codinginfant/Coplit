public class MakeMultiplesOfDigit {
    public String makeMultiplesOfDigit(int num) {
        // TODO:
        String result = "";
        for (int i = 3; i<=num; i+=3) {
            result += i;
        }
        return result;
    }
}
/*
수를 입력받아 1부터 해당 수까지의 수 중에서 3의 배수로만 구성된 문자열을 리턴해야 합니다.
string 타입을 리턴해야 합니다.
반복문(for)문을 사용해야 합니다.
숫자(number string) 사이의 구분은 없습니다. ('3691215')
3의 배수가 없을 경우, 빈 문자열을 리턴해야 합니다.



 */
public class isOdd {
    public boolean isOdd(int num) {
        //조건문을 사용하여 짝수인 경우 return false를,
        //홀수인 경우 return true;를 작성해야 합니다.
        //TODO :
        if (num<0) {
            num = -num;
        }
        while (num>0) {
            if (num==1) {
                return true;
            }
            num -= 2;
        }
        return false;
    }
}
//    반복문(while)문을 사용해야 합니다.
//        for문 사용은 금지됩니다.
//        나눗셈(/), 나머지(%) 연산자 사용은 금지됩니다.
//        0은 짝수로 간주합니다.
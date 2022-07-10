public class MakeMultiplesOfDigit2 {
    public int makeMultiplesOfDigit2(int num1, int num2) {
        //TODO:
        int cnt = 0;
        int big;
        int small;
        if (num1> num2) {
            big = num1;
            small = num2;
        }
        else {
            small = num1;
            big = num2;
        }

        for (int i = small; i<=big; i++) {
            if (i!=0) {
                if (i%2==0) {
                    cnt ++;
                }
            }
        }
        return cnt;
    }
}


    /*
    두 개의 수를 입력받아 두 수를 포함해 두 수 사이의 수 중 2의 배수의 개수를 리턴해야 합니다.
   반복문(for)문을 사용해야 합니다.
    num1이 num2보다 작지 않을 수도 있습니다.
    0은 2의 배수가 아니라고 가정합니다.

    큰수 작은수 정하고
    작은수부터 큰수까지 1씩 더하면서 반복문
    2의 배수면 변수 새로 지정해서 1씩 더해준다
    */
}

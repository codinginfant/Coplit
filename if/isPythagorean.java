/*
삼각형의 세 변을 입력받아 직각삼각형(pythagorean)인지 여부를 리턴해야 합니다.
삼각형의 각 세 변은 무작위로 입력됩니다.
arr.sort 사용은 금지됩니다.
제곱을 구할 때는 입력으로 주어지는 변수를 그대로 사용해야 합니다.
 */


public class isPythagorean {
    public boolean isPythagorean(int side1, int side2, int side3) {
        // TODO:
        public boolean isPythagorean(int side1, int side2, int side3) {
            // TODO:
            int dside1 = side1 * side1;
            int dside2 = side2 * side2;
            int dside3 = side3 * side3;

            if (dside1==dside2+dside3 || dside2==dside1+dside3 || dside3==dside1+dside2) {
                return true;
            }
            else return false;

        }
    }
}

public class RepeatString {
    public String repeatString(String str, int num) {
        String result = "";
        // TODO:
        if (str.isEmpty()) {
            return "";
        }
        for (int i = 0; i<num; i++) {
            result = result + str;
        }
        return result;
    }
}
/*
반복문(for)문을 사용해야 합니다.
0을 입력받은 경우, 빈 문자열을 리턴해야 합니다.
빈 문자열을 확인하는 방법은 str.isEmpty()를 사용하여 쉽게 확인이 가능합니다.
 */
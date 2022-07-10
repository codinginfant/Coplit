public class GetMaxNumberFromString {
    public int getMaxNumberFromString(String str) {
        // TODO:
        int big =0;
        for (int i=0; i<str.length(); i++) {
            if (big <= Character.getNumericValue(str.charAt(i))) {
                big = Character.getNumericValue(str.charAt(i));
            }
        }
        return big;
    }
}



/*
숫자 문자열을 입력받아 문자열을 구성하는 각 숫자 중 가장 큰 수를 나타내는 숫자를 리턴해야 합니다.
int 타입을 리턴해야 합니다.
반복문(for)문을 사용해야 합니다.
str.split 사용은 금지됩니다.
빈 문자열을 입력받은 경우, 0을 리턴해야 합니다.

index 값 비교
index 0을 big으로 임의로 두고
나머지값들 대소 비교

*/


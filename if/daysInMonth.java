public class daysInMonth {
    public int daysInMonth(int month) {
        // TODO:
        switch (month) {
            case 2:
                return 28;

            case 4:     // return 써줘야 루프에서 나가는 걸 역이용해서
            case 6:     // 맨 마지막 11까지 가야 30 리턴 되도록
            case 9:
            case 11:
                return 30;

            default:    // 가장 많은 달 수는 default 값으로 줘서 코드 간단히
                return 31;
        }
}

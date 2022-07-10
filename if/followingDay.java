/*
요일을 입력받아 해당 요일의 다음 요일을 리턴해야 합니다.
올바른 요일이 아닌 경우에는 "올바른 요일이 아닙니다" 라는 문구를 리턴해야 합니다.

 */

public class followingDay {
    public String followingDay(String day) {
        // TODO:
        if (day.equals("월요일"))                 // str.equals() 사용하여 두 변수 값 비교
            return "화요일";

        else if (day.equals("화요일"))
            return "수요일";

        else if (day.equals("수요일"))
            return "목요일";

        else if (day.equals("목요일"))
            return "금요일";

        else if (day.equals("금요일"))
            return "토요일";

        else if (day.equals("토요일"))
            return "일요일";

        else if (day.equals("일요일"))
            return "월요일";

        else
            return "올바른 요일이 아닙니다";

    }

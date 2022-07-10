/*
점수를 입력받아 점수에 해당하는 등급을 리턴해야 합니다.
만약 주어진 점수가 100을 초과하거나 0 미만이라면 문자 'X'를 리턴해야 합니다.
 */

public class convertScoreToGrage {
    public char convertScoreToGrade(int score) {
        // TODO:

        if (score>100 || score<0) {
            return 'X';
        }
        else if (score >=90) return 'A';
        else if (score >=80) return 'B';
        else if (score >=70) return 'C';
        else if (score >=60) return 'D';
        else return 'F';
    }

}

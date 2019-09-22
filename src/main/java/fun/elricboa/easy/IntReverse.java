package fun.elricboa.easy;

/**
 * @author shentongzhou on 2019-09-22
 */
public class IntReverse {

    public int reverseInt(int x) {
        int answer = 0;
        while (x != 0) {
            int pop = x % 10;
            if (answer > Integer.MAX_VALUE / 10 || (answer == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (answer < Integer.MIN_VALUE / 10 || (answer == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            answer = answer * 10 + x % 10;
            x /= 10;
        }
        return answer;
    }
}

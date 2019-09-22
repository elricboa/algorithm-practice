package fun.elricboa.easy;

/**
 * @author shentongzhou on 2019-09-22
 */
public class PlalindromNum {
    public boolean isPalindrome(int x) {
        int revertNum = 0;
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        while (x > revertNum) {
            revertNum = revertNum * 10 + x % 10;
            x /= 10;
        }
        return x == revertNum || x == revertNum / 10;
    }
}

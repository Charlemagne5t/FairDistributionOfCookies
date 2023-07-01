import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void distributeCookiesTest1() {
        int[] cookies = {8, 15, 10, 20, 8};
        int k = 2;
        int expected = 31;
        int actual = new Solution().distributeCookies(cookies, k);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void distributeCookiesTest2() {
        int[] cookies = {6, 1, 3, 2, 2, 4, 1, 2};
        int k = 3;
        int expected = 7;
        int actual = new Solution().distributeCookies(cookies, k);
        Assert.assertEquals(expected, actual);
    }

}

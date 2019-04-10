import org.junit.Assert;
import org.junit.Test;

public class UnderscorifyingTheStringTest {


    @Test
    public void canary() {
        Assert.assertTrue(true);
    }

    @Test
    public void Test1() {
        String input = UnderScorifyingTheString.underScorifyingString("this is a test to see if it works", "test");
        String output = "this is a _test_ to see if it works";
        Assert.assertEquals(input, output);
    }

    @Test
    public void Test2() {
        String input = UnderScorifyingTheString.underScorifyingString("test this is a test to see if it works", "test");
        String output = "_test_ this is a _test_ to see if it works";
        Assert.assertEquals(input, output);
    }

    @Test
    public void Test3() {
        String input = UnderScorifyingTheString.
                underScorifyingString("test this is a test to see if it works", "test");
        String output = "_test_ this is a _test_ to see if it works";
        Assert.assertEquals(input, output);
    }

    @Test
    public void Test4() {
        String input = UnderScorifyingTheString
                .underScorifyingString("test jagadish is not a " +
                        "fool he will come and win the game", "jagadish");
        String output = "test _jagadish_ is not a fool he will come and win the game";
        Assert.assertEquals(input, output);
    }

    @Test
    public void Test5() {
        String input = UnderScorifyingTheString.underScorifyingString("testtesttesttest", "test");
        String output = "_testtesttesttest_";
        Assert.assertEquals(input, output);
    }

    @Test
    public void Test6() {
        String input = UnderScorifyingTheString
                .underScorifyingString("test test test test", "test");
        String output = "_test_ _test_ _test_ _test_";
        Assert.assertEquals(input, output);
    }

    @Test
    public void Test7() {
        String input = UnderScorifyingTheString
                .underScorifyingString("testestestest", "test");
        String output = "_testestestest_";
        Assert.assertEquals(input, output);
    }

    @Test
    public void Test8() {
        String input = UnderScorifyingTheString.underScorifyingString("jagadish is a artist in devolping software", "jagadish");
        String output = "_jagadish_ is a artist in devolping software";
        Assert.assertEquals(input, output);
    }

    @Test
    public void Test9() {
        String input = UnderScorifyingTheString.underScorifyingString("just fly high", "fly");
        String output = "just _fly_ high";
        Assert.assertEquals(input, output);
    }

    @Test
    public void Test10() {
        String input = UnderScorifyingTheString.underScorifyingString("practice practice practice", "practice");
        String output = "_practice_ _practice_ _practice_";
        Assert.assertEquals(input, output);
    }


}

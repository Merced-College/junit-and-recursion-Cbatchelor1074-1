// Chase Batchelor
// CPSC-39
// April 12, 2026

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RecursionPracticeTest {

    @Test
    public void testCount8One8() {
        assertEquals(1, RecursionPractice.count8(8));
    }

    @Test
    public void testCount8TwoSeparated8s() {
        assertEquals(2, RecursionPractice.count8(818));
    }

    @Test
    public void testCount8Double8Rule() {
        assertEquals(4, RecursionPractice.count8(8818));
    }

    @Test
    public void testCount8No8s() {
        assertEquals(0, RecursionPractice.count8(12345));
    }

    @Test
    public void testCount8Triple8() {
        assertEquals(5, RecursionPractice.count8(888));
    }

    @Test
    public void testCountHiOne() {
        assertEquals(1, RecursionPractice.countHi("xxhixx"));
    }

    @Test
    public void testCountHiTwo() {
        assertEquals(2, RecursionPractice.countHi("xhixhix"));
    }

    @Test
    public void testCountHiJustHi() {
        assertEquals(1, RecursionPractice.countHi("hi"));
    }

    @Test
    public void testCountHiNone() {
        assertEquals(0, RecursionPractice.countHi("hello"));
    }

    @Test
    public void testCountHiThree() {
        assertEquals(3, RecursionPractice.countHi("hihihi"));
    }

    @Test
    public void testCountHi2OneValidHi() {
        assertEquals(1, RecursionPractice.countHi2("ahixhi"));
    }

    @Test
    public void testCountHi2TwoValidHi() {
        assertEquals(2, RecursionPractice.countHi2("ahibhi"));
    }

    @Test
    public void testCountHi2IgnoreXhi() {
        assertEquals(0, RecursionPractice.countHi2("xhixhi"));
    }

    @Test
    public void testCountHi2MixedCase() {
        assertEquals(1, RecursionPractice.countHi2("hixhi"));
    }

    @Test
    public void testCountHi2OnlyIgnored() {
        assertEquals(0, RecursionPractice.countHi2("xhi"));
    }

    @Test
    public void testStrCountCat() {
        assertEquals(2, RecursionPractice.strCount("catcowcat", "cat"));
    }

    @Test
    public void testStrCountCow() {
        assertEquals(1, RecursionPractice.strCount("catcowcat", "cow"));
    }

    @Test
    public void testStrCountDog() {
        assertEquals(0, RecursionPractice.strCount("catcowcat", "dog"));
    }

    @Test
    public void testStrCountNonOverlapping() {
        assertEquals(2, RecursionPractice.strCount("aaaa", "aa"));
    }

    @Test
    public void testStrCountWholeString() {
        assertEquals(1, RecursionPractice.strCount("abc", "abc"));
    }

    @Test
    public void testStringCleanBasic() {
        assertEquals("yza", RecursionPractice.stringClean("yyzzza"));
    }

    @Test
    public void testStringCleanMultipleDuplicates() {
        assertEquals("abcd", RecursionPractice.stringClean("abbbcdd"));
    }

    @Test
    public void testStringCleanHello() {
        assertEquals("Helo", RecursionPractice.stringClean("Hello"));
    }

    @Test
    public void testStringCleanAllSame() {
        assertEquals("a", RecursionPractice.stringClean("aaaa"));
    }

    @Test
    public void testStringCleanEmpty() {
        assertEquals("", RecursionPractice.stringClean(""));
    }
}
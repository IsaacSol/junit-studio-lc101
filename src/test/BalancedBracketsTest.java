package test;

import main.BalancedBrackets;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    } "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void balancedBracketsBetweenTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void textBracketsContainingTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void emptyReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void stringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello World!"));
    }

    @Test
    public void emptyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singleBracketTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void textCloseBracketTextOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void closeOpenCloseBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][[[]][]]]"));
    }

    @Test
    public void nestedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[[]][]]]"));
    }

//    @Test()
//    public void numberReturnsFalse() {
//        assertFalse(BalancedBrackets.hasBalancedBrackets(52));
//        fail("haha");
//    }
}

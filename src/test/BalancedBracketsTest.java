package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void onlyClosedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singleBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void goodTestingIsHard() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Good] [testing] [is] [hard.]]"));
    }

    @Test
    public void nestedClosedBracketsWithinOtherCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Lunch]Code]"));
    }

    @Test
    public void multipleClosedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][]"));
    }

    @Test
    public void nestedClosedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    public void nestedOpenBracketsWithinOtherCharactersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]][[Code]][[Rocks]"));
    }

    @Test
    public void zeroBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode Rocks!"));
    }

    @Test
    public void multipleNestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[][]]]"));
    }

    @Test
    public void multipleSameBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[["));
    }

    @Test
    public void onlyOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void multipleOpenInsideClosedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]][[[]"));
    }

}

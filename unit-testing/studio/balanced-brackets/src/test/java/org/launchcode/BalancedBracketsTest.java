package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //checks there are two brackets in the string
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //checks to see if brackets are mismatched (curly vs square)
    @Test
    public void mismatchedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("{Brackets]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Brackets]{"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("{Brack}}ets"));
    }

    //perfectly balanced, like everything should be - thanos
    @Test
    public void includesBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[Bracket]]]]]s"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("{Bracket}s"));
    }

   //
    @Test
    public void notBalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
}
package ru.netology.service;


import static org.testng.Assert.*;

public class CashbackHackerTest {
    CashbackHacker hacker = new CashbackHacker();


    @org.testng.annotations.Test
    public void shouldTestRemain() {
        int expected = 0;
        int actual = hacker.remain(1000);
        assertEquals(actual, expected);
    }  // This test failed, because function return 1000, but must 0;

    @org.testng.annotations.Test
    public void shouldTestRemainLow() {
        int expected = 1;
        int actual = hacker.remain(999);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldTestRemainHigh() {
        int expected = 999;
        int actual = hacker.remain(1001);
        assertEquals(actual, expected);
    }


}
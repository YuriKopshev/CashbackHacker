package ru.netology.service;


import static org.junit.Assert.*;


public class CashbackHackerTest {
    CashbackHacker hacker = new CashbackHacker();


    @org.junit.Test
    public void shouldTestRemain() {
        int expected = 0;
        int actual = hacker.remain(1000);
        assertEquals(expected,actual);
    }  // This test failed, because function return 1000, but must 0;

      @org.junit.Test
    public void shouldTestRemainLow() {
        int expected = 1;
        int actual = hacker.remain(999);
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void shouldTestRemainHigh() {
        int expected = 999;
        int actual = hacker.remain(1001);
        assertEquals(expected,actual);
    }


}
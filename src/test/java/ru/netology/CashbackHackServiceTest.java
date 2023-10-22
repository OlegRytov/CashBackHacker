package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldMissingAmount999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldAmountZero(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldMissingAmount1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldMissingAmount800() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3200;
        int expected = 800;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}
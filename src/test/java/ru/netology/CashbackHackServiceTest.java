package ru.netology;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 15;
        int actual = service.remain(985);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remain3() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remain4() {
        CashbackHackService service = new CashbackHackService();
        int expected = 990;
        int actual = service.remain(1010);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remain5() {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(1800);

        Assert.assertEquals(expected, actual);
    }
}
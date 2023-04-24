package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 15;
        int actual = service.remain(985);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemain4() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900 ;
        int actual = service.remain(1100);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemain5() {
        CashbackHackService service = new CashbackHackService();
        int expected = 20;
        int actual = service.remain(1980);

        Assert.assertEquals(actual, expected);
    }

}
package ru.netology.unit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;


class CashbackHackServiceTest {

//    @Test
//    void mustOfferToBuyUpTo1000() {
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int amount = 900;
//
//        int actual = cashbackHackService.remain(amount);
//        int expected = 100;
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void must2OfferToBuyUpTo1000() {
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int amount = 1000;
//
//        int actual = cashbackHackService.remain(amount);
//        int expected = 0;
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void must3OfferToBuyUpTo1000() {
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int amount = 1100;
//
//        int actual = cashbackHackService.remain(amount);
//        int expected = 900;
//
//        assertEquals(expected, actual);
//    }
//
//
     @ParameterizedTest
     @CsvFileSource(resources="/BonusData.csv",numLinesToSkip=1)
     void shouldCalculateCashback(int amount,int expected,String message) {
         CashbackHackService cashbackHackService = new CashbackHackService();
         int actual = cashbackHackService.remain(amount);
         assertEquals(expected, actual);
     }
}




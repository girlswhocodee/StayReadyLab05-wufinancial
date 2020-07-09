package com.codedifferently.stayready;


import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class CurrencyConversionsTest {
    CurrencyConversions test;
    @Before
    public void initialize() {
        test = new CurrencyConversions();
    }
    @Test
    public void dollarToEuroTest() {
        
        Double input = 10.00;
        
        Double expectedValue = input * 0.94;
        Double actualValue = test.dollarToEuro(input);
        
        Assert.assertEquals(expectedValue, actualValue,0);
    }
    
    @Test
    public void euroToDollarTest() {
        
        Double input = 10.00;
        
        Double expectedValue = input * (1.00/0.94);
        Double actualValue = test.euroToDollar(input);
        
        Assert.assertEquals(expectedValue, actualValue,0);
    }
    
    @Test
    public void euroToBritishPoundTest() {
        
        Double input = 10.00;
        
        Double expectedValue = input * (0.82/0.94);
        Double actualValue = test.euroToBritishPound(input);
        
        Assert.assertEquals(expectedValue, actualValue,0);
    }
    
    @Test
    public void britishPoundToIndianRupeeTest() {
        
        Double input = 10.00;
        
        Double expectedValue = input * (68.32/0.82);
        Double actualValue = test.britishPoundToIndianRupee(input);
        
        Assert.assertEquals(expectedValue, actualValue,0);
    }
    
    @Test
    public void rupeeToCanadianDollarTest() {
        
        Double input = 10.00;
        
        Double expectedValue = input * (1.32/68.32);
        Double actualValue = test.rupeeToCanadianDollar(input);
        
        Assert.assertEquals(expectedValue, actualValue,0);
    }
    
    @Test
    public void singaporeDollarToSwissFrancTest() {
        
        Double input = 10.00;
        
        Double expectedValue = input * (1.01/1.43);
        Double actualValue = test.singaporeDollarToSwissFranc(input);
        
        Assert.assertEquals(expectedValue, actualValue,0);
    }
    
    @Test
    public void swissFrancToMalaysianRinggitTest() {
        
        Double input = 10.00;
        
        Double expectedValue = input * (4.47/1.01);
        Double actualValue = test.swissFrancToMalaysianRinggit(input);
        
        Assert.assertEquals(expectedValue, actualValue,0);
    }
    
    @Test
    public void malaysianRinggitToJapaneseYenTest() {
        
        Double input = 10.00;
        
        Double expectedValue = input * (115.84/4.47);
        Double actualValue = test.malaysianRinggitToJapaneseYen(input);
        
        Assert.assertEquals(expectedValue, actualValue,0);
    }
    
    
    @Test
    public void japaneseYenToChineseYuanRenminbiTest() {
        
        Double input = 10.00;
        
        Double expectedValue = input * (6.92/115.84);
        Double actualValue = test.japaneseYenToChineseYuanRenminbi(input);
        
        Assert.assertEquals(expectedValue, actualValue,0);
    }
    
    
    
}
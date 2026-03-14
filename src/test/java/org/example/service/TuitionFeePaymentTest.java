package org.example.service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TuitionFeePaymentTest {
    private TuitionFeePayment tuition;
    @BeforeEach
    void setup(){
        tuition = new TuitionFeePayment();
    }
    @Test
    void shouldReturnCorrectCalculationOfTuitionFeeWithDiscount(){
//        Act and Assert
        assertEquals(2700, tuition.calculateTuitionfees(3, 0.10));
    }
    @Test
    void shouldReturnCorrectCalculationOfTuitionFeeNoDiscount(){
        assertEquals(3000, tuition.calculateTuitionfees(3,0));
    }
    @Test
    void shouldMakePayment(){
//
        tuition.calculateTuitionfees(3,0);
//        Act
        tuition.makePayment(1000);
//        Assert
        assertEquals(2000, tuition.getRemainingBalance());
    }
    @Test
    void shouldVerifyPaymentIsFalse(){
        tuition.calculateTuitionfees(3,0);
        tuition.makePayment(1000);
//        Assert
        assertFalse(tuition.isFullyPaid());
    }
    @Test
    void shouldVerifyPaymentIsTrue(){
        tuition.calculateTuitionfees(1,0);
        tuition.makePayment(1000);
//        Assert
        assertTrue(tuition.isFullyPaid());
    }
}
package org.example.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TuitionFeePaymentTest {
    @Test
    void whenCalculateTuition_ThenReturnTotal(){
//        Arrange
        TuitionFeePayment tuition = new TuitionFeePayment();
//        Act and Assert
        assertEquals(2400, tuition.calculateTuitionfees(3, 0.20));
    }
  
}
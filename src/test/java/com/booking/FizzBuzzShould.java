package com.booking;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class FizzBuzzShould
{

    @Test
    void print_from_1_to_100() {

        Approvals.verify(Main.print());

    }

}

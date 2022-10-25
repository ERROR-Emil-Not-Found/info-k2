package Bankomat;

import java.lang.Exception;

class Bankomat {
    private double accountBalance;

    public Bankomat() {
        this.accountBalance = 0;
    }

    public void deposit(double value) throws Exception {
        if (value < 0) {
            throw new Exception("Value lower than 0");
        }

        this.accountBalance += value;
        System.out.println(String.format("New balance: %s", accountBalance));

    }

}
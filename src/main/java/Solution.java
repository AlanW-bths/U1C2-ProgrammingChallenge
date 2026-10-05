public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1 + t2 + t3 + t4)/4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int) Math.round(average);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return (roundedAverage >= 65);
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return (shares * price);
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        return (int) Math.round(totalStock);
    }

    /*
    Problem 3: Digit Incrementer 
    */

    //i made a helper :)-----------------------
   public double addone(double input) {
        double next = input + 1;
        if (next == 10)
        {
            next = 0.0;
        };
        return next;
    };
    //-----------------------------------------
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        double hundreds = userDouble - (userDouble / 100);
        userDouble = userDouble % 100;

        double tens = userDouble / 10;
        userDouble = userDouble % 10;

        double ones = userDouble / 1;
        userDouble = userDouble % 1;

        double tenths = userDouble / 0.1;
        userDouble = userDouble % 0.1;

        double hundredths = userDouble / 0.01;

        System.out.println("b " + hundreds + " " + tens + " " + ones + " " + tenths + " " + hundredths);

        hundreds = addone(hundreds);
        tens = addone(tens);
        ones = addone(ones);
        tenths = addone(tenths);
        hundredths = addone(hundredths);

        System.out.println("a " + hundreds + " " + tens + " " + ones + " " + tenths + " " + hundredths);

        double answer = (hundreds*100) + (tens*10) + (ones) + (tenths*0.1) + (hundredths*0.01);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}

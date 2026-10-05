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
   public int addone(int input) {
        int next = input + 1;
        if (input == 9)
        {
            next = 0;
        };
        return next;
    };
    //-----------------------------------------
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        //remove decimal
        userDouble *= 100;
        //hundreds
        int hundreds = (int) Math.floor((userDouble / 10000));
        userDouble = userDouble % 10000;
        //tens
        int tens = (int) Math.floor((userDouble / 1000));
        userDouble = userDouble % 1000;
        //ones
        int ones = (int) Math.floor((userDouble / 100));
        userDouble = userDouble % 100;
        //tenths
        int tenths = (int) Math.floor((userDouble / 10));
        userDouble = userDouble % 10;
        //hundredths
        int hundredths = (int) Math.floor((userDouble / 1));
        //addone (used a helper func)
        hundreds = addone(hundreds);
        tens = addone(tens);
        ones = addone(ones);
        tenths = addone(tenths);
        hundredths = addone(hundredths);
        //combine
        double answer = (hundreds*100) + (tens*10) + (ones) + (tenths*0.1) + (hundredths*0.01);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPassing(64));
        //231.01
    }

}

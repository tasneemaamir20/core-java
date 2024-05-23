public class emirpNum {
    // public static int countDigits(int n){
    //         int count = 0;
    //         while(n>0){
    //             count++;
    //             n = n/10;
    //         }
    //         return count;
    //     }
    
    //     public static boolean isPrime(int n){
    //         boolean isit = true;
    //         for (int i=2; i<n; i++){
    //             if(n%i==0){
    //                 isit = false;
    //             }
    //         }
    //         return isit;
    //     }
    
    //     public static int findReverse(int n){
    //         int reverse = 0;
    //         int digits = countDigits(n);
    
    //         for(int i=1; i<=digits; i++){
    //             int ld = n%10;
    //             reverse = (reverse*10) + ld;
    //             n = n/10;
    //         }
    
    //         return reverse;
    //     }
    
    //     public static boolean isEmirp(int n){
    //         if(isPrime(n)==true && isPrime(findReverse(n))){
    //             return true;
    //         }else{
    //             return false;
    //         }
    //     }
    
    //     public static void main(String[] args) {
    //         int n = 37;
    //         boolean answer = isEmirp(n);
    //         System.out.println(answer);
    //     }








     // METHOD TO FIND NUMBER OF ODD DIGITS IN A GIVEN NUMBER.
     public static int countOddDig(int n){
        int count = 0;
        while(n>0){
            int ld = n%10;
            if(ld%2==1){
                count++;
            }
            n = n/10;
        }
        return count;
    }

    // METHOD TO FIND NUMBER OF EVEN DIGITS IN A GIVEN NUMBER.
    public static int countEvenDig(int n){
        int count = 0;
        while(n>0){
            int ld = n%10;
            if(ld%2==0){
                count++;
            }
            n = n/10;
        }
        return count;
    }

    // METHOD TO CALCULATE THE SUM OF ODD AND EVEN POWER OF RESPECTIVE DIGIT
    // i.e. IF THE PICKED DIGIT(EVERY TIME WE PICK LAST DIGIT AND DO SOME OPERATION AND REMOVE THE DIGIT) IS ODD
    // WE ARE GOING TO MULTIPLY THE DIGIT WITH ITSELF FOR N TIMES (HERE N IS THE COUNT OF ODD DIGITS IN THE ORG NUMBER)
    // AND ADD IT TO A VARIABLE CALLED AS SUM
    // OR IF THE PICKED DIGIT IS EVEN
    // WE ARE GOING TO MULTIPLY THE DIGIT WITH ITSELF FOR M TIMES (HERE M IS THE COUNT OF EVEN DIGITS IN THE NUMBER)
    // AND ADD IT TO A VARIABLE CALLED AS SUM
    public static int calPowOfDig(int n){
        // DECLARE AND INITIALIZE A SUM VARIABLE VARIABLE WITH 0
        int sum = 0;
        // FIND NUMBER OF EVEN DIGITS IN THE NUMBER AND STORE IT IN A VARIABLE
        int evenDig = countEvenDig(n);
        // FIND NUMBER OF ODD DIGITS IN THE NUMBER AND STORE IT IN A VARIABLE
        int oddDig = countOddDig(n);
        // LOOP USED TO PICK-UP THE LAST DIGIT AND PERFORM ALL THE POWER AND SUM OPERATIONS AND REMOVE IT, DO IT TILL NO. BECOMES 0
        while(n>0){
            int ld = n%10;
            // IF THE PICKED NUMBER IS EVEN (i.e. IF ld IS EVEN)
            if(ld%2==0){
                // DECLARE AND INITIALIZE A POWER VARIABLE WITH 1
                int power = 1;
                // MULTIPLY THE DIGIT M TIMES. (HERE DIGIT MEANS ld AND M IS THE COUNT OF EVEN DIGITS IN THE ORG NUMBER)
                for(int i=1; i<=evenDig; i++){
                    power *= ld;
                }
                // NOW ADD THE ABOVE CALCULATED POWER IN SUM VARIABLE
                sum += power;
            }
            // OR IF THE PICKED NUMBER IS ODD (i.e. IF ld IS ODD) 
            else{
                // DECLARE AND INITIALIZE A POWER VARIABLE WITH 1
                int power = 1;
                // MULTIPLY THE DIGIT N TIMES (HERE DIGIT MEANS ld AND N IS THE COUNT OF ODD DIGITS IN THE ORG NUMBER)
                for(int i=1; i<=oddDig; i++){
                    power *= ld;
                }
                // NOW ADD THE ABOVE CALCULATED POWER IN SUM VARIABLE
                sum += power;
            }
            // NOW REMOVE THE LAST DIGIT
            n /= 10;
        }
        // WHEN N BECOMES 0 AND WHILE LOOP GET TERMINATED RETURN THE SUM
        return sum;
    }

    public static void main(String[] args) {
        int n = 1234;
        int answer = calPowOfDig(n);
        System.out.println("Sum of the power of digits is " + answer);
    }

    
}

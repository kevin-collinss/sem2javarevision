import java.util.ArrayList;

public class Exercise_1_3 {

    public static void main(String[] args){
        displayAPattern();
    }

    static void displayAPattern(){
        System.out.println("   J    A    V     V    A");
        System.out.println("   J   A A    V   V    A A");
        System.out.println("J  J  AAAAA    V V    AAAAA");
        System.out.println(" JJ  A     A    V    A     A");
    }
}



public class Exercise_1_5 {

        public static void main(String[] args ) {
            double x, y;
            x = ((7.5 * 2.5) - (1.5 * 3));
            y = ((33.5 -2.5));
            double answer = x/y;
            System.out.printf("%f%n" , +  answer);
        }
    }



import java.util.Scanner;

public class Exercise2_13 {
    public static void main(String args[]){
        System.out.print("Enter the monthly savings amount ");
        Scanner value = new Scanner(System.in);
        double amount = value.nextDouble();

        double withdraw = 0;
        for (int i=6 ; i>0 ; i-- ){
            withdraw = ((withdraw + amount)* 1.00417);
        }

        System.out.print("After the sixth month, the account value is $");
        System.out.printf("%2f", withdraw);
    }
}



import java.util.Scanner;
public class Exercise_2_25 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's name: ");
        String name = input.next();
        System.out.println("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double pay = input.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double fed_tax = input.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double state_tax = input.nextDouble();

        double gross = pay*hours;
        double tax = ((gross*fed_tax)+(gross*state_tax));

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + pay);
        System.out.println("Gross Pay: $" + gross);
        System.out.println("Deductions:");
        System.out.println("    Federal Withholding (" + fed_tax +"): $" + (gross*fed_tax));
        System.out.println("    State Withholding (" + state_tax +"): $" + (gross*state_tax));
        System.out.println("    Total Deduction: $" + tax);
        System.out.println("Net Pay: $" + (gross-tax));


    }
}



import java.util.Scanner;

public class Exercise_3_21 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g. 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        if (month == 1 || month == 2) {
            month = month + 12;
            year = year - 1;
        }

        System.out.print("Enter the day of the month: 1-31: ");
        int day = input.nextInt();

        int date = ((day + ((26 * (month + 1)) / 10) + (year % 100) + ((year % 100) / 4) + ((year / 100) / 4) + (5 * (year / 100))) % 7);

        String dayOfWeek = "void";
        if (date == 0) {
            dayOfWeek = "Saturday";
        } else if (date == 1) {
            dayOfWeek = "Sunday";
        } else if (date == 2) {
            dayOfWeek = "Monday";
        } else if (date == 3) {
            dayOfWeek = "Tuesday";
        } else if (date == 4) {
            dayOfWeek = "Wednesday";
        } else if (date == 5) {
            dayOfWeek = "Thursday";
        } else if(date == 6) {
            dayOfWeek = "Friday";
        }

        System.out.println("Day of the week is " + dayOfWeek );
    }
}



import java.util.Scanner;import java.util.Random;

public class Exercise_3_17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //input number
        System.out.println("scissor (0), rock (1), paper (2): ");
        int input = scanner.nextInt();

        //gives name to number
        String playerMove;
        if (input == 0) {
            playerMove = "rock";
        } else if (input == 1) {
            playerMove = "paper";
        } else {
            playerMove = "scissors";
        }

        //sets random number
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        //gives name to number
        String computerMove;
        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }

        //prints outcome
        if (playerMove.equals(computerMove)) {
            System.out.println("The computer is " + computerMove + ". You are " + playerMove + " too. It is a draw");
        } else if (playerWins(playerMove, computerMove)) {
            System.out.println("The computer is " + computerMove + ". You are " + playerMove + ". You won");
        } else {
            System.out.println("The computer is " + computerMove + ". You are " + playerMove + ". You lost");
        }

    }
    //compares playerMove to computerMove to see if player wins
    static boolean playerWins(String playerMove, String computerMove) {
        if (playerMove.equals("rock")) {
            return computerMove.equals("scissors");
        } else if (playerMove.equals("paper")) {
            return computerMove.equals("rock");
        } else {
            return computerMove.equals("paper");
        }
    }

}



import java.util.Scanner;
public class Exercise_4_16 {
    public static void main(String[] args) {
        
        //takes input
        Scanner s = new Scanner(System.in);
        System.out.print("Enter input number : ");
        int input = s.nextInt();
        System.out.println("List of prime numbers between 0 and " + input);
        
        //loop that prints numbers in ascending order after checking values fit criteria
        for (int i = 0; i <= input; i++) {
            if (isPrime(i) && input % i ==0) {
                System.out.println(i);
            }
        }
    }
    
    //Method to check if number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}



import java.util.Scanner;

public class Exercise_4_25 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        double input = scanner.nextInt();

        double output = 0;
        for(double i = 1; i<= input; i++){
            output = output + (output + 1);
            System.out.println(output);
        }

    }
}



import java.util.Scanner;

public class Exercise_5_5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double numA, numB, numC;

        System.out.println("Enter 3 number: ");
        numA = scanner.nextDouble();
        numB = scanner.nextDouble();
        numC = scanner.nextDouble();

        displayLargestNumber(numA,numB,numC);
    }

    public static void displayLargestNumber(
            double num1, double num2, double num3){
            if (num1>num2){
                if(num1>num3){
                    System.out.print(num1);
                }else{
                    System.out.print(num3);
                }
            }else if(num2>num3) {
                System.out.print(num2);
            }else{
                System.out.print(num3);
            }
    }
}



public class Exercise_5_9 {
    public static void main(String args[]){
        System.out.println("Feet    Meters    |    Meters   Feet");
        System.out.println("____________________________________");
        System.out.println("1.0     " + footToMeter(1) +"     |    20.0     " + (meterToFoot(20)));
        System.out.println("2.0     " + footToMeter(2) +"      |    25.0     " + (meterToFoot(25)));
        System.out.println("...");
        System.out.println("9.0     " + footToMeter(9) +"     |    60.0     " + (meterToFoot(60)));
        System.out.println("10.0    " + footToMeter(10) +"      |    65.0     " + (meterToFoot(65)));

    }

    public static double footToMeter(double foot){
        double meter = 0.305 * foot;

        return meter;
    }

    public static double meterToFoot(double meter){
        double foot = 3.279 * meter;

        return foot;
    }
}



public class Exercise_6_13 {
    public static void main(String args[]){
        System.out.print(getRandom(4,5,7,8));


    }
    public static int getRandom(int... numbers) {

        Random rand = new Random();
        int upper = 8;
        int randomNumber = rand.nextInt(upper) + 1;
        System.out.println(randomNumber);

        if (Arrays.asList(numbers).contains(randomNumber)) {
            getRandom(numbers);
        }
        return randomNumber;
    }
}



import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise_6_21 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int ballAmt = scanner.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int slotAmt = scanner.nextInt();

        theBalls(ballAmt,slotAmt);
    }

    public static void theBalls(int ballAmount, int slotAmount) {

        //Creates array for bottom row
        int[] theGrid = new int[slotAmount];

        //position tracks the ball as it moves right
        int position;

        //loop to repeat as each ball comes in
        for (int j = ballAmount; j > 0; j--) {
            //pushes down a line after "LRLR" input put in
            System.out.println();
            position = 0;
            //loop for bounces
            //random num between 1 - 2
            for (int i = slotAmount - 1; i > 0; i--) {
                Random rand = new Random();
                int upper = 2;
                int randomNumber = rand.nextInt(upper) + 1;

                //random num determines left or right
                // if right position increases by 1
                if (randomNumber % 2 == 0) {
                    position = position + 1;
                    System.out.print("R");
                } else {
                    System.out.print("L");
                }
            }
            theGrid[position]++;
        }
        System.out.println();
        //System.out.println(Arrays.toString(theGrid)); -- used for testing
        int count;
        for(count = ballAmount; count > 0; count-- ) {
            for (int i = 0; i < slotAmount; i++) {
                if (theGrid[i] == count) {
                    System.out.print("0");
                    theGrid[i]--;
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double[][] array = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 4; i++) {
                array[j][i] = scanner.nextDouble();
            }
        }

        System.out.println("Enter the column to get the sum: ");
        int column = scanner.nextInt();

        double finalSum = sumColumn(array, column);
        System.out.println(Arrays.deepToString(array));

        System.out.println("Sum of the elements at column " + column + " is " + finalSum);
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int j = 0; j < 3; j++) {
            sum = sum + m[j][columnIndex];
        }
        return sum;
    }
}



import java.util.Scanner;

public class Exercise_7_9 {

    public static void main(String[] args) {

        int outcome;
        // creates board & tokens
        String[] tokens = {" X "," O "};
        String [][] board = getBoard();

        do {
            print(board);

            int[] cell = getCell(board, tokens[0]);


            placeToken(board, cell, tokens[0]);
            outcome = gameStatus(board, tokens[0]);
            if (outcome == 2) {
                swap(tokens);
            }

        } while(outcome == 2);

        print(board);

        if (outcome == 0)
            System.out.println(tokens[0] + "player won");
        else
            System.out.println("Players draw");

    }

    public static int gameStatus(String[][] m, String e) {
        if (isWin(m, e))
            return 0;
        else if (isDraw(m))
            return 1;
        else
            return 2;
    }

    public static boolean isWin(String[][] m, String t) {
        return isHorizontalWin(m, t) || isVerticalWin(m, t) || isDiagonalWin(m, t);
    }

    public static boolean isHorizontalWin(String[][] m, String t) {
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == t)
                    count++;
            }
            if (count == 3)
                return true;
        }
        return false;
    }

    public static boolean isVerticalWin(String[][] m, String t) {
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[j][i] == t)
                    count++;
            }
            if (count == 3)
                return true;
        }
        return false;
    }

    public static boolean isDiagonalWin(String[][] m, String t) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i][i] == t)
                count++;
            if (count == 3)
                return true;
        }

        count = 0;
        for (int i = 0, j = m[i].length - 1; j >= 0 ; j--, i++) {
            if (m[i][j] == t)
                count++;
            if (count == 3)
                return true;
        }
        return false;
    }

    public static boolean isDraw(String[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == "   ")
                    return false;
            }
        }
        return true;
    }

    public static void swap(String[] p) {
        String temp = p[0];
        p[0] = p[1];
        p[1] = temp;
    }

    public static void placeToken(String[][] m, int[] e, String t) {
        m[e[0]][e[1]] = t;
    }

    public static int[] getCell(String[][] m, String t) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        int[] cell = new int[2]; // Cell row and column

        // Prompt player to enter a token
        do {
            System.out.print("Enter a row(0, 1, or 2) for player " + t + ": ");
            cell[0] = input.nextInt();
            System.out.print("Enter a column(0, 1, or 2) for player " + t + ": ");
            cell[1] = input.nextInt();

        } while (!isValidCell(m, cell));
        return cell;
    }

    public static boolean isValidCell(String[][] m, int[] cell) {
        for (int i = 0; i < cell.length; i++) {
            if (cell[i] < 0 || cell[i] >= 3) {
                System.out.println("Invalid cell");
                return false;
            }
        }
        if (m[cell[0]][cell[1]] != "   ") {
            System.out.println(
                    "\nRow " + cell[0] + " column " + cell[1] + " is filled");
            return false;
        }
        return true;
    }

    public static String[][] getBoard() {
        String[][] m = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = "   ";
            }
        }
        return m;
    }

    public static void print(String[][] m) {
        System.out.println("\n-------------");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("|" + m[i][j]);
            }
            System.out.println("|\n-------------");
        }
    }
}
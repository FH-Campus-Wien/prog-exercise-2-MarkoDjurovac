package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    public void largestNumber(){

        int i = 1;
        double currentNumber;
        double largestNumber = 0;
        Scanner scanner = new Scanner( System.in );

        System.out.print( "Number " + i + ": ");
        currentNumber = scanner.nextDouble();

        if( currentNumber <= 0 )
        {
            System.out.println( "No number entered." );
        }
        else
        {
            i++;
            while( currentNumber > 0 )
            {
                System.out.print( "Number " + i + ": ");
                currentNumber = scanner.nextDouble();

                if( largestNumber < currentNumber ) {
                    largestNumber = currentNumber;
                }

                i++;
            }

            System.out.println( "The largest number is " + String.format( "%.2f", largestNumber ) );
        }

    }

    public void stairs(){

        int n;
        int numberToPrint = 1;
        Scanner scanner = new Scanner( System.in );

        System.out.print( "n: " );
        n = scanner.nextInt();

        if( n <= 0 )
        {
            System.out.println( "Invalid number!" );
        }
        else
        {
            for( int i = 1; i <= n; i++ )
            {
                for( int j = 0; j < i; j++ )
                {
                    System.out.print( numberToPrint + " ");
                    numberToPrint++;
                }
                System.out.println();
            }
        }

    }

    public void printPyramid(){

        final int PYRAMID_SIZE = 6;

        for( int i = 1; i <= PYRAMID_SIZE; i++ )
        {
            for( int j = i; j < PYRAMID_SIZE; j++ )
            {
                System.out.print( " " );
            }

            for( int k = 1; k < ( 2*i ); k++ )
            {
                System.out.print( "*" );
            }
            System.out.println();
        }
    }

    public void printRhombus(){
        int h;
        char c;
        Scanner scanner = new Scanner( System.in );

        System.out.print( "h: " );
        h = scanner.nextInt();

        System.out.print( "c: " );
        c = scanner.next().charAt( 0 );

        if( h % 2 == 0 )
        {
            System.out.println( "Invalid number!" );
        }
        else
        {
            // Upper half
            for( int i = 1; i <=  ( h / 2 ) + 1; i++ )
            {
                // Print spaces for alignment
                for( int j = 1; j <= h - i - 2; j++ )
                {
                    System.out.print( " " );
                }

                // Print char sequence in first triangle
                for( int k = i; k >= 1; k-- )
                {
                    System.out.print( (char)( c - k + 1 ) );
                }

                // Print char sequence in second triangle
                for( int l = 2; l <= i; l++ )
                {
                    System.out.print( (char)( c - l + 1 ) );
                }

                System.out.println();
            }

            // Lower half
            for( int i = ( h / 2 ); i >= 1; i-- )
            {
                for( int j = 1; j <= h - i - 2; j++ )
                {
                    System.out.print( " " );
                }
                for( int k = i; k >= 1; k-- )
                {
                    System.out.print( (char)( c - k + 1 ) );
                }
                for( int l = 2; l <= i; l++ )
                {
                    System.out.print( (char)( c - l + 1 ) );
                }
                System.out.println();
            }
        }
    }

    public void marks(){

        double grade;
        double sumGrades = 0;
        double average;
        int countGrades = 0;
        int countNegatives = 0;
        Scanner scanner = new Scanner( System.in );

        System.out.print( "Mark " + ( countGrades + 1 )  + ": " );
        grade = scanner.nextDouble();

        while( grade != 0 )
        {
            if( grade < 0 || grade > 5 )
            {
                System.out.println( "Invalid mark!" );
            }
            else
            {
                if( grade == 5 )
                {
                    countNegatives++;
                }

                sumGrades += grade;
                countGrades++;
            }

            System.out.print( "Mark " + ( countGrades + 1 ) + ": " );
            grade = scanner.nextDouble();
        }

        if( sumGrades == 0 )
        {
            System.out.println( "Average: " + String.format( "%.2f", sumGrades ) );
        }
        else
        {
            average = sumGrades / countGrades;
            System.out.println( "Average: " + String.format( "%.2f", average ) );
        }

        System.out.println( "Negative marks: " + countNegatives );

    }

    public void happyNumbers(){

        int number;
        int digit;
        int sum = 0;
        Scanner scanner = new Scanner( System.in );

        System.out.print( "n: " );
        number = scanner.nextInt();

        while( number > 9 )
        {
            while( number > 0 )
            {
                digit = number % 10;
                sum +=  digit * digit;
                number /= 10;
            }

            number = sum;
            sum = 0;
        }

        if( number == 1 )
        {
            System.out.println( "Happy number!" );
        }
        else
        {
            System.out.println( "Sad number!" );
        }

    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}
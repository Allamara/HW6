public class Main {
    public static void main(String[] args) {
        ;
// TASK_1
        for (int a = 1; a <= 10; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        
// TASK_2
        for (int a = 10; a > 0; a--) {
            System.out.print(a + " ");
            }
        System.out.println();
        
// TASK_3
        for (int a = 2; a < 17; a += 2) {
            System.out.print(a + " ");
        }
        System.out.println();
        
// TASK_4
        for (int a = 10; a >= -10; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        
// TASK_5
        for (int year = 1904; year <= 2096 ; year = year + 4) {
            System.out.println(year + " год является високосным");
        }
        System.out.println();

// TASK_6
        for (int number = 7; number <= 98; number = number + 7) {
            System.out.print(number + " ");
        }
        System.out.println();

// TASK_7
        for (int number = 1; number <= 512; number = number * 2) {
            System.out.print(number + " ");
        }
        System.out.println();

// TASK_8
        int month = 29000;
        int year = 0;
        for (int a = 1; a <= 12; a ++) {
            year += month;
            System.out.println("В месяце " + a + " сумма накоплений равна " + year);
        }
        System.out.println();

// TASK_9
        int monthDeposit = 29000;
        int yearTotal = 0;
        for (int a = 1; a < 12; a ++) {
            yearTotal += monthDeposit;
            yearTotal += (int) (yearTotal * 1.01);
            System.out.println("В месяце " + a + " сумма накоплений равна " + yearTotal);
        }
        System.out.println();

// TASK_10
        for (int a = 1; a <= 10; a ++) {
            System.out.println("2 * " + a + " = " + a * 2);
        }
        System.out.println();
        }
        }
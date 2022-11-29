package main;

public class PT6_Switch {
    public static void main(String[] args) {

        // Switch || If

        int month = 1;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                if(month == 1) {
                    System.out.println("oi");
                }
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5: case 15:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }

        System.out.println(monthString);

        // ----------------------------------------

        String operacao = "subtração";

        double a = 1;
        double b = 2;

        switch (operacao) {
            case "soma":
                System.out.println(a+b);
                break;
            case "subtração":
                System.out.println(a-b);
                break;
            case "multiplicação":
                System.out.println(a*b);
                break;
            case "divisão":
                System.out.println(a/b);
                break;
            default:
                System.out.println("O Valor escolhido está inválido");
                break;
        }

        // ----------------------------------------
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
    }
}

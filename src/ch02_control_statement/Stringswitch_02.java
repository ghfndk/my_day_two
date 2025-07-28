package ch02_control_statement;

public class Stringswitch_02 {
    public static void main(String[] args) {
        String month = "January" ;
        int monthNumber = 0 ;

        switch (month){
            case "January":
                monthNumber = 1 ;
                break;
            case "February":
                monthNumber = 2 ;
                break;
            case "Marth":
                monthNumber = 3 ;
                break;
            case "Apri":
                monthNumber = 4 ;
                break;
            case "May":
                monthNumber = 5 ;
                break;
            case "June ":
                monthNumber = 6 ;
                break;
            case "July ":
                monthNumber = 7 ;
                break;
            case "August":
                monthNumber = 8 ;
                break;
            case "September":
                monthNumber = 9 ;
                break;
            case "Octobe":
                monthNumber = 10 ;
                break;
            case "November":
                monthNumber = 11 ;
                break;
            case "Decembe":
                monthNumber = 12 ;
                break;
        }

        String message = month + "는(은) " + monthNumber + "월 입니다.";
        System.out.println(message);
    }
}

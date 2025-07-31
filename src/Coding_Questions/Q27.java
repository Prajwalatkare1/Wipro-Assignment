package Coding_Questions;

public class Q27 {

    enum Currency {
        DOLLAR,
        EURO,
        POUND,
        YEN,
        RUPEE,
        FRANC
    }

    public static void main(String[] args) {
     
        for (Currency currency : Currency.values()) {
            System.out.println("Currency: " + currency);
        }

        System.out.println();

      
        for (Currency currency : Currency.values()) {
            switch (currency) {
                case DOLLAR:
                    System.out.println("Dollar: Official currency of the United States.");
                    break;
                case EURO:
                    System.out.println("Euro: Official currency of the Eurozone countries.");
                    break;
                case POUND:
                    System.out.println("Pound: Official currency of the United Kingdom.");
                    break;
                case YEN:
                    System.out.println("Yen: Official currency of Japan.");
                    break;
                case RUPEE:
                    System.out.println("Rupee: Official currency of India.");
                    break;
                case FRANC:
                    System.out.println("Franc: Former currency of Switzerland and some African countries.");
                    break;
                default:
                    System.out.println("Unknown currency.");
            }
        }
    }
}

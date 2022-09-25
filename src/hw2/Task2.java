package hw2;

public class Task2 {
    public static void main(String[] args) {
        double sum = 700;
        int saleCode = 4525;
        switch (saleCode) {
            case 4525:
                sum = sum * 0.7;
                System.out.println("сумма покупки " + sum);
                break;
            case 6424:
            case 7012:
                sum = sum * 0.8;
                System.out.println("сумма покупки " + sum);
                break;
            case 7647:
            case 9011:
            case 6612:
                sum = sum * 0.9;
                System.out.println("сумма покупки " + sum);
                break;
            default:
                System.out.println("сумма покупки " + sum);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 1;
        int miles = service.calculate(price);
        System.out.println("Начислено миль: " + miles);
    }
}


public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 108_975;
        int miles = service.calculate(price); // должно получиться 5_448
        System.out.println("Количество начисленных миль: " + miles);
    }
}
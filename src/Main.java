public class Main {
    public static void main(String[] args) {
        int priceTicket = 1000;  //цена за один билет
        int priceMile = 20;  //стоимость одной мили

        int bonusMiles = (int) (priceTicket / priceMile);

        System.out.println("Начисленных миль после расчете: " + bonusMiles);
    }
}

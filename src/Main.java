public class Main {
    public static void main(String[] args) {

        int ticketCost = 13676;
        int rublesPerMile = 20;

        int bonusMiles = ticketCost / rublesPerMile;

        System.out.println("Начислено бонусные мили: " + bonusMiles);
    }
}
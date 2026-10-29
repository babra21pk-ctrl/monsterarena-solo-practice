public class Main {
    public static void main(String[] args) {

        Player player = new Player("Halako");
        Monster monster = new Monster("Dragon", 100);

        System.out.println("Player: " + player.getName());
        System.out.println("Monster: " + monster.describe());
    }
}

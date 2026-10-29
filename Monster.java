
public class Monster {
    private String name;
    private int hp;

    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String describe() {
        return name + " has " + hp + " HP";
    }
}
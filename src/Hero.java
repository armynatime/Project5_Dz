public class Hero {
    private int health;
    private int damage;
    private int superPower;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getSuperPower() {
        return superPower;
    }

    public Hero(int health, int damage, int superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
}
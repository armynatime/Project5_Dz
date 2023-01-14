public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(700, 50, 15);
        Boss boss = new Boss();
        boss.setHealth(900);
        boss.setDamage(60);
        boss.setProtectionType("enemy");
        System.out.println("Boss " + "health:" + boss.getHealth() + " " + "damage:" + boss.getDamage() + " " + "protection type:" + boss.getProtectionType());
        System.out.println("*********************");
        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Kinetic"+ " " + "Health:" + createHeroes()[0].getHealth()
                    + " " + "Damage:" + createHeroes()[0].getDamage() + " " + "SuperPower:" + createHeroes()[0].getSuperPower()

            );
            System.out.println("Adam" + " " + "Health:" + createHeroes()[1].getHealth()
                    + " " + "Damage:" + createHeroes()[1].getDamage());
            System.out.println("Iven" + " " + "Health:" + createHeroes()[2].getHealth()
                    + " " + "Damage:" + createHeroes()[2].getDamage() + " " + "SuperPower:" + createHeroes()[2].getSuperPower());
            break;
        }
    }

    public static Hero[] createHeroes() {
        Hero Kinetic = new Hero(550, 45, 18);
        Hero Adam = new Hero(650, 65);
        Hero Iven = new Hero(680, 58, 7);

        Hero[] heroes = {Kinetic, Adam, Iven};
        return heroes;
    }
}
import java.util.Scanner;
import java.lang.Math;

public class ConsoleAdventureGame {
    public static Scanner scanner = new Scanner(System.in);

    public static double attack() {
        return Math.floor(Math.random() * 20 + 1);
    }

    public static int evade() {
        int evadeChance = (int) (Math.random() * 100 + 1);
        if (evadeChance <= 5) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double critAttack() {
        double modifier = 2;
        int critChance = (int) (Math.random() * 100 + 1);
        if (critChance <= 15) {
            return modifier;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Are you ready to start the game? (y/n)");
        String start = scanner.nextLine();
        if (!start.equalsIgnoreCase("y")) {
            System.out.println("Game over.");
            return;
        }

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        int enemyHealth = 100;
        int heroHealth = 100;
        int potions = 3;

        System.out.println("Welcome, " + name + "!");
        System.out.printf("%s is a brave hero who encounters an enemy on their quest for glory.\n", name);
        System.out.println("The enemy has " + enemyHealth + " health points.");
        System.out.println("You have " + heroHealth + " health points and " + potions + " potions.");

        while (enemyHealth > 0 && heroHealth > 0) {
            int heroEvade = evade();
            int enemyEvade = evade();
            double heroAttack = attack();
            double heroCritAttack = critAttack();
            double heroTotalAttackDamage = heroAttack * heroCritAttack * enemyEvade;
            double enemyAttack = attack();
            double enemyCritAttack = critAttack();
            double enemyTotalAttackDamage = enemyAttack * enemyCritAttack * heroEvade;
            System.out.println("What do you want to do?");
            System.out.println("1. Attack");
            System.out.println("2. Drink potion");
            System.out.println("3. Run away");
            int action = scanner.nextInt();
            if (action == 1) {
                enemyHealth -= heroTotalAttackDamage;
                heroHealth -= enemyTotalAttackDamage;
                if (enemyEvade == 0) {
                    System.out.println("\nYou missed!");
                } else if (heroCritAttack == 1) {
                    System.out.println("\nYou attack the enemy and deal " + (int) heroAttack + " damage.");
                } else {
                    System.out.println("\nThat was a critical hit! You attack the enemy and deals " + (int) heroTotalAttackDamage + " damage.");
                }
                if (enemyHealth <= 0) {
                    System.out.println("\nThe enemy has zero health remaining\n");
                    break;
                }
                System.out.println("The enemy has " + enemyHealth + " health points remaining.\n");
                if (heroEvade == 0) {
                    System.out.println("The enemy missed!");
                } else if (enemyCritAttack == 1) {
                    System.out.println("The enemy attacks you and deal " + (int) enemyAttack + " damage.");
                } else {
                    System.out.println("That was a critical hit! The enemy attack you and deals " + (int) enemyTotalAttackDamage + " damage.");
                }

                System.out.println("You have " + heroHealth + " health points remaining.");
            } else if (action == 2) {
                if (potions > 0) {
                    heroHealth += 20;
                    potions--;
                    heroHealth -= enemyTotalAttackDamage;
                    System.out.println("You drink a potion and recover 20 health points.");
                    if (enemyCritAttack == 1) {
                        System.out.println("The enemy attacks you and deals " + (int) enemyAttack + " damage.");
                    } else if (heroEvade == 0) {
                        System.out.println("The enemy missed!");
                    } else {
                        System.out.println("That was a critical hit! The enemy attacked you and dealt " + (int) enemyTotalAttackDamage + " damage.");
                    }
                    System.out.println("You have " + heroHealth + " health points and " + potions + " potions remaining.\n");
                    System.out.println("The enemy has " + enemyHealth + " health points remaining.");
                } else {
                    System.out.println("You don't have any potions left!");
                }
            } else if (action == 3) {
                System.out.println("You run away from the enemy.");
                break;
            }
        }

        if (enemyHealth <= 0) {
            System.out.println("Congratulations! You have defeated the enemy!");
        } else if (heroHealth <= 0) {
            System.out.println("Your journey ended soon, traveler. The enemy has defeated you!");
        }
    }
}

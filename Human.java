public class Human {
  public int strength;
  public int stealth;
  public int intelligence;
  public int health;
  public String name;

  public Human( ) {
    strength = 3;
    stealth = 3;
    intelligence = 3;
    health = 100;
    name = null;
  }

  public void attack(Human target) {
    target.health -= this.strength;
    System.out.println(this.name + " attacks " + target.name + " for " + this.strength + " damage");
  }
}

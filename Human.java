public class Human {
  public int strength;
  public int stealth;
  public int intelligence;
  public int health;

  public Human() {
    strength = 3;
    stealth = 3;
    intelligence = 3;
    health = 100;
  }

  public void Attack(Human defender) {
    defender.health -= this.strength;
  }

}

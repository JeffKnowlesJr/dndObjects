public class Wizard extends Human {

  public Wizard(String name) {
    this.name = name;
    this.health = 50;
    this.intelligence = 8;
  }

  public void heal(Human target) {
    target.health += this.intelligence;
    System.out.println(this.name + " has healed " + target.name + " for " + this.intelligence + " points of health");
    System.out.println(target.name + " now has " + target.health + " points of health");
  }

  public void fireball(Human target) {
    target.health -= this.intelligence;
    System.out.println(this.name + " has fireballed " + target.name + " for " + this.intelligence + " points of damage");
  }
}

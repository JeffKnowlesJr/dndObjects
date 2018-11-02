public class Ninja extends Human {
  public Ninja(String name) {
    this.name = name;
    stealth = 10;
  }

  public void steal(Human target) {
    target.health += this.stealth;
    this.health += this.stealth;
    System.out.println(this.name + " steals " + this.stealth + " points of health from " + target.name);
  }

  public void runAway() {
    this.health -= 10;
    System.out.println(this.name + " has run away and lost 10 points of health");
  }
}

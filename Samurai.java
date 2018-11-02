public class Samurai extends Human{

  private static int samuraiCount = 0;

  public Samurai(String name) {
    this.name = name;
    this.health = 200;
    this.samuraiCount++;
  }

  public void deathBlow(Human target) {
    target.health = -1;
    this.health /= 2;
    if (target instanceof Samurai) {
      this.samuraiCount--;
    }
    System.out.println(this.name + " has struck " + target.name + " dead with a furious blow!");
    if (this.health < 0) {
      System.out.println(this.name + " has also died.");
      this.samuraiCount--;
    } else {
      System.out.println(this.name + " was wounded and his health is now " + this.health);
    }
  }

  public void meditate() {
    this.health *= 2;
    System.out.println(this.name + " has begun to meditate. His health has doubled to " + this.health);
  }

  public void howMany() {
    System.out.println("There are " + samuraiCount + " Samurai out there in the world.");
  }
}

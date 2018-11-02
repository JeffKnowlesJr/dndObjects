public class HumanDemo {
  public static void main(String[] args) {
    Human cain = new Human();
    Human abel = new Human();
    cain.Attack(abel);
    cain.Attack(abel);
    cain.Attack(abel);
    System.out.println("Abel's Health: " + abel.health);
  }
}

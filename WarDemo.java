public class WarDemo {
  public static void main(String[] args) {
    Wizard mogor = new Wizard("Mogor");
    Ninja alai = new Ninja("Alai");
    Samurai wraaa = new Samurai("Wraaa");
    Samurai jefek = new Samurai("Jefek");
    jefek.howMany();
    jefek.attack(wraaa);
    alai.attack(wraaa);
    mogor.fireball(alai);
    alai.steal(wraaa);
    alai.runAway();
    jefek.attack(wraaa);
    mogor.heal(wraaa);
    wraaa.deathBlow(jefek);
    wraaa.howMany();
    wraaa.meditate();
  }
}

import java.util.List;
import java.util.ArrayList;

public final class CreateHeroes  {
    public static void main(String[] args) {
        final Hero hero1 = new Hero("�ē�");
        final Hero hero2 = new Hero("���");
        List<Hero> heroes = new ArrayList<>();
        heroes.add(hero1);
        heroes.add(hero2);
        for (Hero hero: heroes) {
            String heroName = hero.getName();
            System.out.println(heroName);
        }
    }
}

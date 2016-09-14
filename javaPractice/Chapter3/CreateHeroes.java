import java.util.ArrayList;
import java.util.Iterator;

public class CreateHeroes  {
    public static void main(String[] args) {
        Hero hero1 = new Hero("斉藤");
        Hero hero2 = new Hero("鈴木");
        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(hero1);
        heroes.add(hero2);
        Iterator<Hero> heroesIt = heroes.iterator();
        while (heroesIt.hasNext()) {
            String heroName = heroesIt.next().getName();
            System.out.println(heroName);
        }
    }
}

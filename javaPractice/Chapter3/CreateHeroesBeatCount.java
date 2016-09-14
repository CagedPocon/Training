import java.util.Map;
import java.util.HashMap;

public final class CreateHeroesBeatCount {
    public static void main(String[] args) {
        final Hero hero1 = new Hero("Ä“¡");
        final Hero hero2 = new Hero("—é–Ø");
        Map<Hero, Integer> heroMap = new HashMap<>();
        heroMap.put(hero1, 3);
        heroMap.put(hero2, 7);
        for (Hero key: heroMap.keySet()) {
            String output = (key.getName() + "‚ª“|‚µ‚½“G = " + heroMap.get(key));
            System.out.println(output);
        }
    }
}

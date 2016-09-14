import java.util.HashMap;

public class CreateHeroesBeatCount {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ä“¡");
        Hero hero2 = new Hero("—é–Ø");
        HashMap<Hero, Integer> heroes = new HashMap<>();
        heroes.put(hero1, 3);
        heroes.put(hero2, 7);
        for (Hero key: heroes.keySet()) {
            String output = (key.getName() + "‚ª“|‚µ‚½“G = " + heroes.get(key));
            System.out.println(output);
        }
    }
}

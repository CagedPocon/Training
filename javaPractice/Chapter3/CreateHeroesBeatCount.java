import java.util.Map;
import java.util.HashMap;

public final class CreateHeroesBeatCount {
    public static void main(String[] args) {
        final Hero hero1 = new Hero("�ē�");
        final Hero hero2 = new Hero("���");
        Map<Hero, Integer> heroMap = new HashMap<>();
        heroMap.put(hero1, 3);
        heroMap.put(hero2, 7);
        for (Hero key: heroMap.keySet()) {
            String output = (key.getName() + "���|�����G = " + heroMap.get(key));
            System.out.println(output);
        }
    }
}

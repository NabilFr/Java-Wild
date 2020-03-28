import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
;
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        Comparator<Hero> comparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero orig, Hero compare) {
                return orig.getName().compareTo(compare.getName());
            }
        };

        Map<Hero, Flower> avengers = new TreeMap<>(comparator);

        avengers.put(hulk, rose);
        avengers.put(thor, rose);
        avengers.put(scarletWitch, rose);
        avengers.put(vision, tulip);
        avengers.put(captainAmerica, lily);
        avengers.put(doctorStrange, violet);
        avengers.put(blackWidow, violet);

        System.out.println(avengers.containsValue(begonia));

        for (Hero hero : avengers.keySet()) {
            Flower flower = avengers.get(hero);
            System.out.println(flower.getName());
        }
    }
}
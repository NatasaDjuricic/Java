//2. Array liste
//Kreirajte array listu nekog vaseg interesovanje (npr sport)
//-u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
//-iz liste dohvatite 3. element liste i ispisite
//-promenite naziv prvog elementa
//-uklonite 5. element
//-ispisite velicinu vase liste
//-pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste

import java.util.ArrayList;

public class ArrayListe {

    public static void main(String[] args) {

        ArrayList<String> sport = new ArrayList<>();


        sport.add("Gimnastika");
        sport.add("Plivanje");
        sport.add("Tenis");
        sport.add("Klizanje");
        sport.add("Skijanje");
        sport.add("Snuker");


        System.out.println(sport.get(2));

        sport.set(0, "Atletika");


        sport.remove(4);


        System.out.println(sport.size());

        System.out.println("Prvi nacin ispisa:");
        for(int i = 0; i < sport.size();i++) {
            System.out.print(sport.get(i)+ " ");
        }
        System.out.println();
        System.out.println("Drugi nain ispisa:");
        for(String i : sport) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Treci nacin ispisa:");
        System.out.println(sport);

    }
}

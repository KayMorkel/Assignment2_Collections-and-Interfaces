package za.ca.cput.kaylinmorkelassignment2interfaces;

import java.util.*;

public class Assignment2CollectionsMain
{
    public static void main( String[] args )
    {
        System.out.println("//////////COLLECTION//////////");
///////////////COLLECTION
        Collection<String> stringCollection = new HashSet<>();

        String num1 = "Hello";
        String num2 = "There";
        String num3 = "Human";
        stringCollection.add(num1);
        stringCollection.add(num2);
        stringCollection.add(num3);

        System.out.println("Printing items in the Collection:");
        for (String col: stringCollection) {
            System.out.println(col); //Print stringCollection
        }
        System.out.println();
        stringCollection.remove(num2);
        System.out.println("Printing items in the Collection after removing num2:");
        for (String col2: stringCollection) {
            System.out.println(col2); //Print stringCollection after removing num2
        }
        System.out.println();
        System.out.println("//////////LIST//////////");
///////////LIST
        List names = new ArrayList();

        names.add("Kaylin");
        names.add("Trevor");
        names.add("Merle");
        names.add("Kendall");
        names.add("Merle");

        System.out.println("Names in the arrayList: ");
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)); //Print list with "Trevor" at index 1
        }
        System.out.println();

        names.remove(1);

        names.add(1, "Earle");
        names.add(3, "Melody");

        System.out.println("Names in the arrayList after removing index 1 and inserting 2 new values at index 1 and 3: ");
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)); //Print list removing index 1 and inserting names at index 1 and 3
        }
        System.out.println();

        names.remove("Melody");
        System.out.println("Names in the arrayList after removing the name Melody: ");
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)); //Printing list after removing "Melody"
        }
        System.out.println();
        System.out.println("//////////SET//////////");
/////////////SET
        Set animals = new HashSet();

        animals.add("lion");
        animals.add("pig");
        animals.add("elephant");

        System.out.println("Animals in the set: ");
        Iterator it = animals.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); //Printing animal set
        }
        animals.remove("pig");
        System.out.println();
        System.out.println("Animals in the set after removing pig: ");
        Iterator ite = animals.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next()); //Printing set after removing "pig"
        }
        System.out.println();
        System.out.println("//////////MAP//////////");
///////////MAP
        Map countries = new HashMap();

        countries.put("c1", "Egypt");
        countries.put("c2", "Greece");
        countries.put("c3", "Hungary");

        System.out.println("Countries in Map: ");
        Set countrySet = countries.entrySet();
        Iterator iterM = countrySet.iterator();
        while (iterM.hasNext()) {
            System.out.println(iterM.next()); //print all countries in Map
        }
        System.out.println();
        String country1 = (String) countries.get("c1");
        System.out.println("Country at key c1: ");
        System.out.println(country1); //Print country at key "c1"
        System.out.println();
        countries.remove("c3");
        System.out.println("Countries in Map after removing key c3: ");
        Set country2Set = countries.entrySet();
        Iterator iterM2 = country2Set.iterator();
        while (iterM2.hasNext()) {
            System.out.println(iterM2.next()); //Print all countries in Map after removing key "c3"
        }
    }

}

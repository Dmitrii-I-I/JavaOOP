package OOP_DZ1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
    public ArrayList<String> resultSeek = new ArrayList<>();
    public ArrayList<Unit> tree;
    public ArrayList<String> resultAge = new ArrayList<String>();

    public Search(NumanTree humanTree) {
        tree = humanTree.getTree();
    }

    // поиск связей: отец-ребенок, жена-муж
    public ArrayList<String> seekUnit(Human hum, Relationship rel) {
        for (Unit tr : tree) {
            if (tr.per1.fullname == hum.fullname && tr.relationship == rel) {
                resultSeek.add(tr.per2.fullname);
            }
        }
        return (ArrayList<String>) resultSeek;
    }

    public ArrayList<String> seekAge() {
        int age = sc();
        for (Unit tr : tree) {
            if (tr.per1.age <= age && !resultAge.contains(tr.per1.fullname)) {
                resultAge.add(tr.per1.fullname);
            }
        }
        return resultAge;
    }

    public int sc() {
        System.out.print("Ввод ограничения по возрасту: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Люди, младше: " + age + ":");
        return age;
    }


}

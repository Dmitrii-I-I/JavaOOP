package OOP_DZ1;

import java.util.ArrayList;
import java.util.List;

public class NumanTree {
    private ArrayList<Unit> tree = new ArrayList<>();

    // отец - ребенок
    public void appendFatherChild(Human father, Human children) {
        tree.add(new Unit(father, Relationship.father, children));
        tree.add(new Unit(children, Relationship.children, father));
    }

    // мать - ребенок
    public void appendMotherChild(Human mother, Human children) {
        tree.add(new Unit(mother, Relationship.mather, children));
        tree.add(new Unit(children, Relationship.children, mother));
    }

    // муж - жена
    public void appendWifeHusband(Human wife, Human husband) {
        tree.add(new Unit(husband, Relationship.husband, wife));
        tree.add(new Unit(wife, Relationship.wife, husband));
    }

    public ArrayList<Unit> getTree() {
        return tree;
    }


}


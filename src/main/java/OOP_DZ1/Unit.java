package OOP_DZ1;

public class Unit {

    Human per1;
    Relationship relationship;
    Human per2;

    public Unit(Human per1, Relationship re, Human per2) {
        this.per1 = per1;
        this.relationship = relationship;
        this.per2 = per2;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", per1, relationship, per2);
    }
}

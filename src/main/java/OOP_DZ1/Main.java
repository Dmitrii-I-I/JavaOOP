package OOP_DZ1;

//1. Реализовать, с учетом ооп подхода, генеалогическое дерево Человек.
// Идея: описать некоторое количество компонент, например:
// модель человека
// компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д.
// компонент для проведения исследований
// дополнительные компоненты по желанию, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение отдельных моделей человека
// Под “проведением исследования” можно понимать получение всех детей выбранного человека.
// Не обязательное
public class Main {
    public static void main(String[] args) {
        Human irina = new Human("Ирина Иванова", 43, true);
        Human dmitrii = new Human("Дмитрий Иванов", 48, false);
        Human ivan = new Human("Иван Петров", 30, true);
        Human masha = new Human("Мария Петрова", 27, false);
        Human jane = new Human("Евгения Иванова", 10, false);
        Human jack = new Human("Джейк Петров", 8, true);
        Human petr = new Human("Петр Петров", 8, true);
        NumanTree tr = new NumanTree();
        tr.appendFatherChild(dmitrii, jane);
        tr.appendMotherChild(irina, jane);
        tr.appendWifeHusband(irina, dmitrii);
        tr.appendFatherChild(ivan, jack);
        tr.appendMotherChild(masha, jack);
        tr.appendFatherChild(ivan, petr);
        tr.appendMotherChild(masha, petr);
        tr.appendWifeHusband(masha, ivan);

        // Поиск детей Ивана
        System.out.println("Дети Ивана");
        System.out.println(new Search(tr).seekUnit(ivan, Relationship.father));
        // Поиск детей Ирины
        System.out.println("Дети Ирины");
        System.out.println(new Search(tr).seekUnit(irina, Relationship.mather));

        // Поиск мужа Ирины
        System.out.println("Муж Ирины");
        System.out.println(new Search(tr).seekUnit(irina, Relationship.wife));
        // Поиск жены Дмитрия
        System.out.println("Жена Дмитрия");
        System.out.println(new Search(tr).seekUnit(dmitrii, Relationship.husband));

        // Поиск по возрасту
        System.out.println(new Search(tr).seekAge());
    }
}

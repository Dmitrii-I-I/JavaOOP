package OOP_DZ1;

public class Human {
    public String fullname;
    public int age;
    public boolean gender;

    public Human(String fullname, int age, boolean gender) {
        this.fullname = fullname;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" + fullname + "age=" + age + gender + "}";
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}

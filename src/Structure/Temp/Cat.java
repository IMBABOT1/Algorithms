package Structure.Temp;

public class Cat {

    private int age;
    private String name;

    public Cat(int age, String name){
        this.age = age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%d", "%s", age, name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age * 31;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cat)) return false;
        Cat cat = (Cat) obj;
        return this.age == cat.age && this.name.equals(cat.name);
    }
}

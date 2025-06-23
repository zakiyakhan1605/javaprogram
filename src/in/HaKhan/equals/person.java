package in.HaKhan.equals;

import java.util.Objects;

public class person {
    private String name;
    private String id;
    private int age;

    public person(int age, String id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof person)){
            return false;
        }
        person per=(person) obj;
        return per.name.equals(name)&&
                per.age==age&&
                per.id.equals(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("person{");
        sb.append("age=").append(age);
        sb.append(", id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

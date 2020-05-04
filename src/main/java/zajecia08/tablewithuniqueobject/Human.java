package zajecia08.tablewithuniqueobject;

import java.util.Objects;

public class Human {
    private String name;
    private int weight;

    public Human(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name: " + name + ", waży: " + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return weight == human.weight &&
                Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}

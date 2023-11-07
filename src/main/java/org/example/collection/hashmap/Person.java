package org.example.collection.hashmap;

public class Person {

    private String name;
    private Integer id;

    public Person(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
//        return super.equals(o);
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;

//        if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
        return getId() != null ? getId().equals(person.getId()) : person.getId() == null;
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        int result = getId() != null ? getId().hashCode() : 0;
//        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        return result;
    }
}

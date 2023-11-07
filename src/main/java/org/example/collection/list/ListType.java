package org.example.collection.list;

public class ListType {

    String typeName;
    String value;

    public ListType(String typeName, String value) {
        this.typeName = typeName;
        this.value = value;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ListType{" +
                "typeName='" + typeName + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

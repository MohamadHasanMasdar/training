package org.example.designpatterns.builder;

public class Person {

    private int nationalCode;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String motherName;
    private int age;
    private String nationality;
    private String skinColor;
    private Boolean isMarried;

    public static class Builder {

        private int nationalCode;
        private String firstName;
        private String lastName;
        private String fatherName;
        private String motherName;
        private int age;
        private String nationality;
        private String skinColor;
        private Boolean isMarried;

        public Builder() {

        }

        public Builder nationalCode(int nationalCode) {
            this.nationalCode = nationalCode;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder fatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public Builder motherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public Builder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder skinColor(String skinColor) {
            this.skinColor = skinColor;
            return this;
        }

        public Builder isMarried(Boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    private Person(Builder builder) {
        nationalCode = builder.nationalCode;
        firstName = builder.firstName;
        lastName = builder.lastName;
        fatherName = builder.fatherName;
        motherName = builder.motherName;
        age = builder.age;
        nationality = builder.nationality;
        skinColor = builder.skinColor;
        isMarried = builder.isMarried;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nationalCode=" + nationalCode +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }
}

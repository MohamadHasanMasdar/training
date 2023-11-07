package org.example.designpatterns.builder;

public class newTestPerson {

    private String name;
    private String lastName;
    private String code;


    public static Builder builder() {
        return new Builder();
    }

    protected static class Builder {

        private String name;
        private String lastName;
        private String code;

        private Builder() {

        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public newTestPerson build() {
            return new newTestPerson(this);
        }
    }

    private newTestPerson(Builder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.code = builder.code;
    }

    @Override
    public String toString() {
        return "newTestPerson{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

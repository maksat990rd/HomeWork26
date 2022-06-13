package com.company;


public class BoxGenerics <T, M, N> {
    private T age;
    private M name;
    private N razmer;

    public BoxGenerics() {
    }

    public BoxGenerics(T age, M name, N razmer) {
        this.age = age;
        this.name = name;
        this.razmer = razmer;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public M getName() {
        return name;
    }

    public void setName(M name) {
        this.name = name;
    }

    public N getRazmer() {
        return razmer;
    }

    public void setRazmer(N razmer) {
        this.razmer = razmer;
    }

    public static BoxGenerics method() {
        BoxGenerics boxs = new BoxGenerics(312,"Generics",true);
        return boxs;
    }

    @Override
    public String toString() {
        return "BoxGenerics age: " + age +
                " name: " + name +
                " razmer: " + razmer;
    }
}
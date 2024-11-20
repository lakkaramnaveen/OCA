package org.example;

public class ArgumentPassingExample {

    public static void main(String[] args) {
        // Primitive type argument
        int num = 10;
        System.out.println("Original num: " + num);
        modifyPrimitive(num);
        System.out.println("After method call: " + num);

        // Object reference argument
        MyObject obj = new MyObject("Hello");
        System.out.println("Original object: " + obj.getValue());
        modifyObject(obj);
        System.out.println("After method call: " + obj.getValue());
    }

    public static void modifyPrimitive(int value) {
        value = 20;
        System.out.println("Inside method: " + value);
    }

    public static void modifyObject(MyObject object) {
        object.setValue("World");
        System.out.println("Inside method: " + object.getValue());
    }
}

class MyObject {
    private String value;
    // con
    public MyObject(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
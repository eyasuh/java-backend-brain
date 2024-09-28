package io.javabrains.javabasics;

public class InstanceOf {

    public static void main(String[] args) {

        Object[] objects = {
                10,
                "Hello",
                true,
                20.5
        };

        // Challenge: Use instanceof to determine the type of each object in the array

        for (Object object : objects) {
            String instance ;
            if (object instanceof Integer) instance = "Integer";
            else if (object instanceof String) instance = "String";
            else if (object instanceof Boolean) instance = "Boolean";
            else if (object instanceof Double) instance = "Double";
            else instance = "primitive";
            System.out.println(instance);

        }

    }
}

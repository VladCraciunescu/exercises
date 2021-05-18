package e037.javaReflectionAtributes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Student {
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void anothermethod() {
    }
}

public class Solution {
    public static void main(String[] args) {
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();
        ArrayList<String> methodNames = new ArrayList<>();
        for (Method method : methods) {
            methodNames.add(method.getName());
        }

        Collections.sort(methodNames);
        for (String name : methodNames) {
            System.out.println(name);
        }
    }
}
//https://www.hackerrank.com/challenges/java-reflection-attributes/problem
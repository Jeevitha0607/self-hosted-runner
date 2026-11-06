package com.example;

public class App {

    public static void main(String[] args) {

        System.out.println(
            "Application deployed successfully on EC2!"
        );

    }

    public static String getMessage() {
        return "Hello from GitHub Actions";
    }
}

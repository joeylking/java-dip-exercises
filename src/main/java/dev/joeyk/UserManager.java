package dev.joeyk;

class UserManager {
    private Generator generator;


    UserManager(Generator generator) {
        this.generator = generator;
    }


    void createUser() {
        // Create user
        System.out.println("User created");
        generator.generateReport();
    }
}

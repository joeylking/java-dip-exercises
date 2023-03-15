package dev.joeyk;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}

//PROBLEM 2
// Violates Dependency Inversion Principle


class FileReader {
    String readFromFile(String filePath) {
        // Read from file
        return "File content";
    }
}


class ContentProcessor {
    private FileReader fileReader;


    ContentProcessor() {
        fileReader = new FileReader();
    }


    String processContent(String filePath) {
        String content = fileReader.readFromFile(filePath);
        // Process content
        return "Processed content: " + content;
    }
}

//PROBLEM 3
// Violates Dependency Inversion Principle


class ElectricOven {
    void bake() {
        // Baking process
        System.out.println("Baking with electric oven");
    }
}


class Kitchen {
    private ElectricOven electricOven;


    Kitchen() {
        electricOven = new ElectricOven();
    }


    void prepareMeal() {
        electricOven.bake();
    }
}

//PROBLEM 4
// Violates Dependency Inversion Principle


class Soccer {
    void play() {
        // Soccer playing process
        System.out.println("Playing soccer");
    }
}


class SportsClub {
    private Soccer soccer;


    SportsClub() {
        soccer = new Soccer();
    }


    void organizeGame() {
        soccer.play();
    }
}

//PROBLEM 5
// Violates Dependency Inversion Principle


class MySqlConnection {
    void connect() {
        // Connect to MySQL database
        System.out.println("Connected to MySQL");
    }
}


class ReportGenerator {
    private MySqlConnection connection;


    ReportGenerator() {
        connection = new MySqlConnection();
    }


    void generateReport() {
        connection.connect();
        System.out.println("Generating report");
    }
}


class UserManager {
    private ReportGenerator reportGenerator;


    UserManager() {
        reportGenerator = new ReportGenerator();
    }


    void createUser() {
        // Create user
        System.out.println("User created");
        reportGenerator.generateReport();
    }
}

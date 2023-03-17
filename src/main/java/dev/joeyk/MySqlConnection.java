package dev.joeyk;

class MySqlConnection implements Connection{
    public void connect() {
        // Connect to MySQL database
        System.out.println("Connected to MySQL");
    }
}

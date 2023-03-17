package dev.joeyk;

class ReportGenerator implements Generator{
    private Connection connection;


    ReportGenerator(Connection connection) {
        this.connection = connection;
    }


    public void generateReport() {
        connection.connect();
        System.out.println("Generating report");
    }
}

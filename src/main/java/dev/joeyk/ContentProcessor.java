package dev.joeyk;

class ContentProcessor {
    private Reader reader;


    ContentProcessor(Reader reader) {
        this.reader = reader;
    }


    String processContent(String filePath) {
        String content = reader.readFromFile(filePath);
        // Process content
        return "Processed content: " + content;
    }
}

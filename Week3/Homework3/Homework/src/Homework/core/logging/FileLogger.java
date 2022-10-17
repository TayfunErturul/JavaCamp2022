package Homework.core.logging;

public class FileLogger implements Logger{
    @Override
    public void add(String data) {
        System.out.println("Dosyaya loglandı: " + data);

    }
}

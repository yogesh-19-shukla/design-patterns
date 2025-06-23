package org.example.singletonPattern;

public class Logger {

    private static volatile Logger instance;

    private Logger(){
        System.out.println("Logger initialized!!");
    }

    public static Logger getInstance() {
        if(instance == null){
            synchronized (Logger.class) {
                if(instance == null) {
                    instance = new Logger();   // Lazy initialization
                }
            }
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println("[LOG]: " + msg);
    }
}

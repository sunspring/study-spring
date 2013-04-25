package study.spring;

public class Client {

    Log logger;

    public void setLogger(Log logger) {
        this.logger = logger;
    }

    public void bizLogic() {
        if (logger != null) logger.write("Hello World");
    }

}

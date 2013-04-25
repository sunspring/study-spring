package study.spring;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
//        client.setLogger(new DefaultLog());
        client.setLogger(new PrettyLog());
        client.bizLogic();
    }
}

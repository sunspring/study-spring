package study.spring;

public class PrettyLog implements Log {

    @Override
    public void write(String data) {
        System.out.println("*************");
        System.out.println(data);
        System.out.println("*************");
    }

}

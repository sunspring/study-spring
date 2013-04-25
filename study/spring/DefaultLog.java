package study.spring;

public class DefaultLog implements Log {

    @Override
    public void write(String data) {
        System.out.println(data);
    }

}

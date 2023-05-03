package test;

public class InitEx01 {
    static {
        System.out.println("static { }");
    }

    {
        System.out.println("{ }");
    }

    public InitEx01() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("InitEx01 i01 = new InitEx01()");
        InitEx01 i01 = new InitEx01();

        System.out.println("InitEx01 i02 = new InitEx01()");
        InitEx01 i02 = new InitEx01();
    }
}

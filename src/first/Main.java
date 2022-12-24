package first;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Имя пользователя: %s\n", ShowProperties.getUserName());
        System.out.printf("Сегодня: %s\n", DataOnly.getDate());
        System.out.println(ShowProperties.a);
        System.out.println(ShowProperties.b);
    }
}

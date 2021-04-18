package academy.belhard;

import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Tom", "Hardy", "tom.hardy@mail.ru", "12345678");

        System.out.println(user1.getFullInfo());
        System.out.println(user1.isPasswordCorrect("12345678"));
        System.out.println(user1.isPasswordCorrect("123456"));
    }
}
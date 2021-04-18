package academy.belhard.entity;

public class User extends Person {
    // поля класса
    private String email;
    private String password;

    // конструктор
    public User(String a, String b, String email, String password) {
        super(a, b);    //вызываем конструктор класса Person
        this.email = email;
        this.password = password;
    }
    // метод getFullInfo
    public String getFullInfo() {
        return "Имя: "+firstName+" "+lastName+"\n"+"E-mail: "+email;
    }
    // метод isPasswordCorrect
    public boolean isPasswordCorrect (String password) {
        return this.password.equals(password);
    }


}

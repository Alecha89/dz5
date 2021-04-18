package academy.belhard.entity;

public class Person {
    // поля класса
   protected String firstName;
   protected String lastName;

    // конструктор
    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // метод getFullName
     public String getFullName () {
         return firstName+" "+lastName;
    }


}

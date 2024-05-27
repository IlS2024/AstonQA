public class Person {
    String name ;//ФИО
    private String j_title;//должность
    private String email;//email
    private String ph_number;//телефон
    private int salary;//зарплата
    private int age;//возраст

    public Person(String name,String j_title, String email, String ph_number, int salary, int age){
        this.name = name;
        this.j_title = j_title;
        this.email = email;
        this.ph_number = ph_number;
        this.salary = salary;
        this.age = age;
    }
    public Person(String name){
        this.name ="FIO";
        this.j_title = "Jobber";
        this.email = "email@test.test";
        this.ph_number = "999 99 99";
        this.salary = 1500;
        this.age = 23;
    }
    public static void main(String[] args) {
        Person sotr1 = new Person("123");
        System.out.println("Имя: " + sotr1.name + " Должность: " +sotr1.j_title + " email: " + sotr1.email + " № телефона: " + sotr1.ph_number + " ЗП: " + sotr1.salary + " Возраст: " + sotr1.age);
    }
}

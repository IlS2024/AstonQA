//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// вначале объявляем массив объектов
        Person[] persArray = new Person[5];
// потом для каждой ячейки массива задаем объект
        persArray[0] = new Person("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Sidorov Andrey", "Cleaner",
                "ivivan@mailbox.com", "892312312", 70000, 18);
        persArray[2] = new Person("Petrov Oleg", "Manager",
                "ivivan@mailbox.com", "892312312", 45000, 30);
        persArray[3] = new Person("Andreev Fedor", "Driver",
                "ivivan@mailbox.com", "892312312", 10000, 18);
        persArray[4] = new Person("Ageev Nikolay", "Engineer",
                "ivivan@mailbox.com", "892312312", 60000, 41);
        }
    }

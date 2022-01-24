# Zaycev_test_task1

Задача 1.
Есть кусочек кода. Его создатель хотел получить следующий вывод в консоль:
7
Developer
Почему данная реализация не обеспечивает желаемого?
Доработайте код.
public static void main(String[] args) {
  Employee tester = new Employee(7,“Developer”);
  System.out.println(tester.getId());
  System.out.println(tester.getVacancy());
}
class Employee {
  private long id;
  private Vacancy vacancy;
  String getVacancy() {
    return vacancy.getVacancy();
  }
  long getId() {
    return id;
  }
}
class Vacancy {
  String getVacancy() {
    return "engineer";
  }
}

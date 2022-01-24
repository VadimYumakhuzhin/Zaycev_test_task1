public class Solution {
    public static void main(String[] args) {
        Employee tester = new Employee(7,"Developer");
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
    static class Employee {
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
}

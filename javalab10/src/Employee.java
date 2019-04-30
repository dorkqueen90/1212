


        public class Employee {

            private String name;

            private int age;

            private final int ID;

            private double salary;

            private String department;



            public Employee(String n, int a, int id, double s, String dept) {
                name = n;
                age = a;
                ID = id;
                salary = s;
                department = dept;
            }





            public void setSalary(double newSalary) {
                salary = newSalary;
            }

            public String toString() {
                return name + "( " + ID + ") " + " is " + age
                        + " years old and earn " + salary
                        + " working for " + department;
            }

            public double getSalary() {
                return salary;
            }

            public String getName() {
                return name;
            }

            public int compareTo(Employee other) {
                if (this.salary > other.salary)
                    return 1;
                else if (this.salary < other.salary)
                    return -1;
                else
                    return 0;
            }

        }


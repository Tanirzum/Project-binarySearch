public class Employee implements Comparable<Employee> {
    String name;
    int id;
    int salery;

    public Employee(String name, int id, int salery) {
        this.name = name;
        this.id = id;
        this.salery = salery;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salery=" + salery +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
        if (result == 0) {
            return this.name.compareTo(o.name);
        }
        return result;
    }
}

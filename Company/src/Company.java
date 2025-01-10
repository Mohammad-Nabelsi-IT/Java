public class Company {
    private String name;
    private Employee[] em;

    public Company(String name, Employee[] em) {
        this.name = name;
        this.em = em;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEm() {
        return em;
    }

    public void setEm(Employee[] em) {
        this.em = em;
    }
    public void allSalaries(){
        for (Employee e : em){
            System.out.println(e.getSalary());
        }
    }
}

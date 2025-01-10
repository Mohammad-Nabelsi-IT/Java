package model;

public class Department {
    private String name;
    private String manager;

    public Department() {
    }
    public Department(String name, String manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "department{" +
                "name='" + name + '\'' +
                ", manager='" + manager + '\'' +
                '}';
    }
}

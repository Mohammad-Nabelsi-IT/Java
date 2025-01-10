public class Plant implements LivingOrganism {
    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void eat() {
        System.out.println(name+"is eating Watter and Sun");
    }


    public void move() {
        System.out.println( name+"is moving Creeps");
    }
}

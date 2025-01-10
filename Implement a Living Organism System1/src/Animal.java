public class Animal implements LivingOrganism {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("The "+name+" is Eating Meat");
    }

    @Override
    public void move() {
        System.out.println("The "+name+" is Moving Swim");
    }

}


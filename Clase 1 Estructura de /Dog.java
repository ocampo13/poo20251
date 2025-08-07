/**
 * The Dog class also implements the Animal interface.
 * Notice how it implements the same methods differently than Cat!
 */
public class Dog implements Animal {
    
    // Attributes specific to dogs
    private String breed;
    private String size;
    
    // Constructor
    public Dog(String breed, String size) {
        this.breed = breed;
        this.size = size;
    }
    
    // Implementation of eat() from Animal interface
    @Override
    public void eat() {
        System.out.println("The dog happily eats kibble and bones");
    }
    
    // Implementation of sleep() from Animal interface
    @Override
    public void sleep() {
        System.out.println("The dog sleeps in its kennel or next to its owner");
    }
    
    // Implementation of makeSound() from Animal interface
    @Override
    public void makeSound() {
        System.out.println("The dog says: Woof!");
    }
    
    // Implementation of move() from Animal interface
    @Override
    public void move() {
        System.out.println("The dog runs joyfully around the yard");
    }
    
    // Implementation of getSpecies() from Animal interface
    @Override
    public String getSpecies() {
        return "Dog";
    }
    
    // Methods unique to Dog
    public void wagTail() {
        System.out.println("The dog wags its tail excitedly");
    }
    
    public void fetch() {
        System.out.println("The dog runs to fetch the ball and brings it back");
    }
    
    public boolean guardHouse() {
        System.out.println("The dog is alert and guarding the house...");
        // Simulate success randomly
        return Math.random() > 0.3;
    }
    
    // Getter methods
    public String getBreed() {
        return breed;
    }
    
    public String getSize() {
        return size;
    }
}

public class Animal {
    private int age;
    private int weight;

    public Animal(int age, int weight){
        this.setAge(age);
        this.setWeight(weight);
    }

    protected void setAge(int age){
        this.age = age;
    }

    protected void setWeight(int weight){
        this.weight = weight;
    }

    protected int getAge(){
        return this.age;
    }

    protected int getWeight(){
        return this.weight;
    }

    protected void running(){
        System.out.println("running~~");
    }

    protected void eating(){
        System.out.println("eating~~");
    }
}
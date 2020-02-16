public class Tiger extends Felidae{
    public Tiger(int age, int weight){
        super(age, weight);
    }

    public static void main(String[] arg){
        Tiger new_tiger = new Tiger(0, 10);
        new_tiger.crow();
    }
}

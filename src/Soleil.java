public class Soleil  {
    private static Soleil instance = null;
    private Soleil(){};
    public static Soleil getInstance() {
        if(instance == null){
            instance = new Soleil();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Soleil{}";
    }
}

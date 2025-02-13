public class TeachingUnit {
    private final String name;
    private final int token;

    public TeachingUnit(String name, int token){
        this.name = name;
        this.token = token;
    }

    public String toString(){
        return "L'UE " + this.name + " possède " + this.token;
    }

    public String getName(){
        return this.name;
    }

    public int getToken(){
        return this.token;
    }
}

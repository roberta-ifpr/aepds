public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Time time = new Time();
        Atleta atleta = new Atleta();
        atleta.setNome("Fulano de Tal");
        Atleta atleta1 = new Atleta();
        atleta1.setNome("Novo Atleta");

        time.addAtleta(atleta1);
        time.addAtleta(atleta);
        
    }
}

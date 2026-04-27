import java.util.ArrayList;
import java.util.List;

public class Predio {
    private String nome;
    private List<Apartamento> apartamentos;

    public Predio(String nome) {
        this.apartamentos = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Apartamento> getApartamentos() {
        return apartamentos;
    }
    public void setApartamentos(List<Apartamento> apartamentos) {
        this.apartamentos = apartamentos;
    }

    public void addApartamento(String numero){
        this.apartamentos.add(new Apartamento(numero));
    }
    

}

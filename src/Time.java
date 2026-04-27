import java.util.ArrayList;
import java.util.List;

public class Time {
    private List<Atleta> atletas;

    public Time() {
        this.atletas = new ArrayList<>();
    }

    public List getAtletas() {
        return atletas;
    }

    public void setAtletas(List atletas) {
        this.atletas = atletas;
    }

    public void addAtleta(Atleta atleta){
        this.atletas.add(atleta);
    }

}

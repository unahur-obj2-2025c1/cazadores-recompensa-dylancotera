package ar.edu.unahur.obj2.Cazadores;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.Profugos.IProfugo;
import ar.edu.unahur.obj2.Zona.Zona;

public abstract class Cazador {
    List<IProfugo> profugosCazados = new ArrayList<>();
    Integer experiencia;

    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public List<IProfugo> getProfugosCazados() {
        return profugosCazados;
    }

    public void intentarCazar(IProfugo profugo, Zona zona){
        if (this.condicionGeneral(profugo) && this.condicionEspecifica(profugo)){
            this.profugosCazados.add(profugo);
            zona.sacarProfugo(profugo);
        }
        else{
            this.intimidar(profugo);
        }
    }

    public Boolean condicionGeneral(IProfugo profugo){
        return this.experiencia > profugo.getInocencia();
    }

    public abstract Boolean condicionEspecifica(IProfugo profugo);

    public void intimidar(IProfugo profugo){
        profugo.disminuirInocencia(2);
    }

    public void sumarExperiencia(Zona zona){
        experiencia = experiencia + zona.getListaProfugos().stream().mapToInt(p -> p.getHabilidad()).min().orElse(0) + 2 * profugosCazados.size();
    }

    public Integer getExperiencia() {
        return experiencia;
    }
}

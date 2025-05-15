package ar.edu.unahur.obj2.Zona;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.Cazadores.Cazador;
import ar.edu.unahur.obj2.Profugos.IProfugo;

public class Zona {
    String nombre;
    List<IProfugo> listaProfugos = new ArrayList<>();

    public Zona(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfugo(IProfugo profugo){
        listaProfugos.add(profugo);
    }

    public void intentaCazar(Cazador cazador){
        List<IProfugo> copia = new ArrayList<>(listaProfugos);

        copia.forEach(p -> cazador.intentarCazar(p,this));
    }

    public List<IProfugo> getListaProfugos(){
        return listaProfugos;
    }

    public void sacarProfugo(IProfugo profugo){
        listaProfugos.remove(profugo);
    }
}

package ar.edu.unahur.obj2.JefeDeAgencia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.edu.unahur.obj2.Cazadores.Cazador;
import ar.edu.unahur.obj2.Profugos.IProfugo;

public class JefeDeAgencia {
    List<Cazador> cazadores = new ArrayList<>();

    public List<IProfugo> profugosCapturados(){
        return cazadores.stream().flatMap(c -> c.getProfugosCazados().stream()).toList();
    } 

    public IProfugo profugoMasHabil(){
        return cazadores.stream().map(c -> c.profugoMasHabil()).filter(p -> p != null).max(Comparator.comparing(IProfugo::getHabilidad)).orElse(null);
    }

    public Cazador cazadorConMasCapturas(){
        return cazadores.stream().filter(c -> c.cantidadDeCapturas() > 0).max(Comparator.comparing(Cazador::cantidadDeCapturas)).orElse(null);
    }
}

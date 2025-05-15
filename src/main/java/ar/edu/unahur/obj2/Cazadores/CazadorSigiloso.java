package ar.edu.unahur.obj2.Cazadores;

import ar.edu.unahur.obj2.Profugos.IProfugo;

public class CazadorSigiloso extends Cazador{

    public CazadorSigiloso(Integer experiencia) {
        super(experiencia);
    }
    
    @Override
    public Boolean condicionEspecifica(IProfugo profugo) {
        return profugo.getHabilidad() < 50;
    }

    @Override
    public void intimidar(IProfugo profugo){
        super.intimidar(profugo);
        profugo.reducirHabilidad(5);
    }
}

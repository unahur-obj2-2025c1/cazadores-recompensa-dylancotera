package ar.edu.unahur.obj2.Cazadores;

import ar.edu.unahur.obj2.Profugos.IProfugo;

public class CazadorUrbano extends Cazador{

    public CazadorUrbano(Integer experiencia) {
        super(experiencia);
    }

    @Override
    public Boolean condicionEspecifica(IProfugo profugo) {
        return !profugo.esNervioso();
    }

    @Override
    public void intimidar(IProfugo profugo) {
        super.intimidar(profugo);
        profugo.dejarDeEstarNervioso();
    }

    
}

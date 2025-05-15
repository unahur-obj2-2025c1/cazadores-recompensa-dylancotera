package ar.edu.unahur.obj2.Profugos;

public class EntrenamientoDeElite extends Decorador{

    public EntrenamientoDeElite(IProfugo decorado) {
        super(decorado);

    }

    @Override
    public void volverseNervioso() {
        super.dejarDeEstarNervioso();
    }

}

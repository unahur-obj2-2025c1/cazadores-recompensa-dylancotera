package ar.edu.unahur.obj2.Profugos;

public class ArtesMarcialesAvanzadas extends Decorador{

    public ArtesMarcialesAvanzadas(IProfugo decorado) {
        super(decorado);
    }

    @Override
    public Integer getHabilidad() {
        return Math.min(100, super.getHabilidad() * 2);
    }

}

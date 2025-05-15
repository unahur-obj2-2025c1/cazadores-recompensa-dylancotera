package ar.edu.unahur.obj2.Profugos;

public class ProteccionLegal extends Decorador{

    public ProteccionLegal(IProfugo decorado) {
        super(decorado);
    }

    @Override
    public Integer getInocencia() {
        return Math.max(40,super.getInocencia());
    } 

}

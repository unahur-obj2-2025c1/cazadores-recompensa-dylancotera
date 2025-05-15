package ar.edu.unahur.obj2.Profugos;

public abstract class Decorador implements IProfugo{

    private IProfugo decorado;

    public Decorador(IProfugo decorado) {
        this.decorado = decorado;
    }

    public IProfugo getDecorado() {
        return decorado;
    }

    @Override
    public Integer getInocencia() {
        return decorado.getInocencia();
    }

    @Override
    public Integer getHabilidad() {
        return decorado.getHabilidad();
    }

    @Override
    public Boolean esNervioso() {
        return decorado.esNervioso();
    }

    @Override
    public void volverseNervioso() {
        this.decorado.volverseNervioso();
    }

    @Override
    public void dejarDeEstarNervioso() {
        this.decorado.dejarDeEstarNervioso();
    }

    @Override
    public void reducirHabilidad(Integer cantidad) {
        this.decorado.reducirHabilidad(cantidad);
    }

    @Override
    public void disminuirInocencia(Integer cantidad) {
        this.decorado.disminuirInocencia(cantidad);
    }
}

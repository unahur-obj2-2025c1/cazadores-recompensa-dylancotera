package ar.edu.unahur.obj2.Profugos;

public class Profugo implements IProfugo{

    Integer nivelDeInocencia;
    Integer nivelDeHabilidad;
    Boolean esNervioso;

    public Profugo(Integer nivelDeInocencia, Integer nivelDeHabilidad, Boolean esNervioso) {
        this.nivelDeInocencia = nivelDeInocencia;
        this.nivelDeHabilidad = nivelDeHabilidad;
        this.esNervioso = esNervioso;
    }

    @Override
    public Integer getInocencia() {
        return nivelDeInocencia;
    }

    @Override
    public Integer getHabilidad() {
        return nivelDeHabilidad;
    }

    @Override
    public Boolean esNervioso() {
        return esNervioso;
    }

    @Override
    public void volverseNervioso() {
        esNervioso = true;
    }

    @Override
    public void dejarDeEstarNervioso() {
        esNervioso = false;
    }

    @Override
    public void reducirHabilidad(Integer cantidad) {
        nivelDeHabilidad = Math.max(0, nivelDeHabilidad - cantidad);
    }

    @Override
    public void disminuirInocencia(Integer cantidad) {
       nivelDeInocencia = Math.max(0, nivelDeInocencia - cantidad);
    }

}

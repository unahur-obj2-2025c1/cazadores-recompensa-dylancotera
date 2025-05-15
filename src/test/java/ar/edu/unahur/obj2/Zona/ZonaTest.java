package ar.edu.unahur.obj2.Zona;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.Cazadores.Cazador;
import ar.edu.unahur.obj2.Cazadores.CazadorSigiloso;
import ar.edu.unahur.obj2.Profugos.ArtesMarcialesAvanzadas;
import ar.edu.unahur.obj2.Profugos.EntrenamientoDeElite;
import ar.edu.unahur.obj2.Profugos.IProfugo;
import ar.edu.unahur.obj2.Profugos.Profugo;
import ar.edu.unahur.obj2.Profugos.ProteccionLegal;

public class ZonaTest {

    Zona zona1 = new Zona("1");
    IProfugo profugo1 = new Profugo(5, 40, true);
    
    Cazador cazador1 = new CazadorSigiloso(10);

    IProfugo arm1 = new ArtesMarcialesAvanzadas(profugo1);
    
    IProfugo ede1 = new EntrenamientoDeElite(arm1);
    
    IProfugo profugo2 = new ArtesMarcialesAvanzadas(new ProteccionLegal(new Profugo(5, 40, true)));

    @Test
    void habilidadProfugo1(){
        assertEquals(profugo1.getHabilidad(), 40);
        assertEquals(arm1.getHabilidad(), 80);
    } 

    @Test
    void testGetListaProfugos() {
        assertTrue(zona1.getListaProfugos().isEmpty());
        zona1.agregarProfugo(profugo1);
        assertFalse(zona1.getListaProfugos().isEmpty());
    }

    @Test
    void testIntentaCazar() {
        assertTrue(cazador1.getProfugosCazados().isEmpty());
        zona1.agregarProfugo(profugo1);
        zona1.intentaCazar(cazador1);
        assertTrue(zona1.getListaProfugos().isEmpty());
        assertFalse(cazador1.getProfugosCazados().isEmpty());
    }

    @Test
    void testSacarProfugo() {
        assertTrue(zona1.getListaProfugos().isEmpty());
        zona1.agregarProfugo(profugo1);
        zona1.sacarProfugo(profugo1);
        assertTrue(zona1.getListaProfugos().isEmpty());
    }
}

package kataiceberg;

import Entidad.Iceberg;
import java.time.LocalDate;
import Eventos.PosicionIce;
import Eventos.VolumenIce;

public class KataIceberg {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Iceberg ice =  new Iceberg("Titanic","Colegio Hogwarts de Magia y Hechicería",date);
        VolumenIce vol = new VolumenIce(date,ice,250);
        PosicionIce pos = new PosicionIce(LocalDate.now(),ice,"200,170");
        ice.añade(pos,vol);
        vol = new VolumenIce(date.plusDays(1),ice,248);
        pos = new PosicionIce(date.plusDays(1),ice,"198,158");
        ice.añade(pos,vol);
        vol = new VolumenIce(date.plusDays(2),ice,246);
        pos = new PosicionIce(date.plusDays(2),ice,"195,150");
        ice.añade(pos,vol);
        vol = new VolumenIce(date.plusDays(3),ice,244);
        pos = new PosicionIce(date.plusDays(3),ice,"193,175");
        ice.añade(pos,vol);
        ice.obtenerDatos();      
        Iceberg ice2 =  new Iceberg("Harry","Griffindor",date);
        VolumenIce vol2 = new VolumenIce(LocalDate.now(),ice2,147);
        PosicionIce pos2 = new PosicionIce(LocalDate.now(),ice2,"200,170");
        ice2.añade(pos2,vol2);
        vol2 = new VolumenIce(date.plusDays(1),ice2,142);
        pos2 = new PosicionIce(date.plusDays(1),ice2,"196,174");
        ice2.añade(pos2,vol2);
        vol2 = new VolumenIce(date.plusDays(2),ice2,143);
        pos2 = new PosicionIce(date.plusDays(2),ice2,"201,169");
        ice2.añade(pos2,vol2);
        vol2 = new VolumenIce(date.plusDays(3),ice2,140);
        pos2 = new PosicionIce(date.plusDays(3),ice2,"200,164");
        ice2.añade(pos2,vol2);
        ice2.obtenerDatos();
    }
    
}

package Servicios;

import EjerciciosGuia2.Moldes.Meses;

public class ServicioMeses {

    public Meses crearCosas() {
        String vec[] = new String[12];
        vec[0] = "enero";
        vec[1] = "febrero";
        vec[2] = "marzo";
        vec[3] = "abril";
        vec[4] = "mayo";
        vec[5] = "junio";
        vec[6] = "julio";
        vec[7] = "agosto";
        vec[8] = "septiembre";
        vec[9] = "octubre";
        vec[10] = "noviembre";
        vec[11] = "diciembre";
        int num = 2;
        return new Meses(vec, num);
    }

    public boolean comparar(Meses m1,String mes) {
        boolean band=mes.equalsIgnoreCase(m1.getVec()[m1.getNum()]);
        if (band==true){
            System.out.println("Ha encontrado el mes secreto");
        }else{
            System.out.println("No ha encontrado el mes secreto.Ingrese nuevamente");
        }
        return band;
    }
}

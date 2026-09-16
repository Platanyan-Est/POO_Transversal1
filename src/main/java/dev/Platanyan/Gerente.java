package dev.Platanyan;



public class Gerente implements Bonificable {

    @Override
    public double calcularBonificacion() {
        return montoextra;
    }
    @Override
    public void asignarMeta(double meta){
    }
}

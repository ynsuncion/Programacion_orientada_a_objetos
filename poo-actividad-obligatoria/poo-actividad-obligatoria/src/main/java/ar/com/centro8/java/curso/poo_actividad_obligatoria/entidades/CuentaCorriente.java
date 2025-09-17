package ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades;

public class CuentaCorriente extends Cuenta{

    private double montoGiroEnDescubierto;
    Cheque Cheque;
    public void depositarCheque(Cheque cheque){

    }


    @Override
    public void depositarEfectivo(double monto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositarEfectivo'");
    }

    @Override
    public void extraerEfectivo(double monto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'extraerEfectivo'");
    }
    

}

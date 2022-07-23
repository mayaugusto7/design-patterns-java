package structural.adapter.baeldung;

public class MovableAdapterImp implements MovableAdapter {
    public static final double VALOR_DE_CONVERSAO_KM_HORA = 1.60934;
    private Movable luxuryCars;

    public MovableAdapterImp() {}

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * VALOR_DE_CONVERSAO_KM_HORA;
    }
}

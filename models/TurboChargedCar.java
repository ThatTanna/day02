package models;

public class TurboChargedCar extends car {

    public Boolean turbo = false;

    public TurboChargedCar(String registration) {
        super(registration);
    }

    public Boolean getTurbo() { return turbo; }
    public void setTurbo(Boolean turbo) { this.turbo = turbo; }

    @Override
    public void accelerate() {
        super.accelerate();
        super.accelerate();
        super.accelerate();
        super.accelerate();
        super.accelerate();
        System.out.println("Vrooooooooooommm");
    }

}

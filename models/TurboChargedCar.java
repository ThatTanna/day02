package models;

public class TurboChargedCar extends Car {

    public Boolean turbo = false;

    public TurboChargedCar(String registration) {
        // First line
        super(registration);
    }

    public Boolean getTurbo() { return turbo; }
    public void setTurbo(Boolean turbo) { this.turbo = turbo; }

    @Override
    public void accelerate() {
        if (this.turbo) {
            super.accelerate();
            super.accelerate();
            super.accelerate();
            super.accelerate();
            super.accelerate();
            System.out.println("Vrooooooooooommm");
        } else {
            super.accelerate();
            System.out.println("Pft..");
        }
    }
}

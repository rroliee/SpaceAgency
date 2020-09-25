package hu.kincstar.javasetraining.spaceagency;

public class Satellite {
    private CelestialCoordinates celestialCoordinates;
    private String registerIdent;

    public Satellite(CelestialCoordinates celestialCoordinates, String registerIdent) {
        if(registerIdent == null || registerIdent.isEmpty()){
            throw new IllegalArgumentException("registerIdent is null or empty");
        }

        this.celestialCoordinates = celestialCoordinates;
        this.registerIdent = registerIdent;
    }

    public void modifyDestination(CelestialCoordinates diff){
        celestialCoordinates = new CelestialCoordinates(
                this.celestialCoordinates.getX().add(diff.getX()),
                this.celestialCoordinates.getY().add(diff.getY()),
                this.celestialCoordinates.getZ().add(diff.getZ()));
    }

    public CelestialCoordinates getCelestialCoordinates() {
        return celestialCoordinates;
    }

    public String getRegisterIdent() {
        return registerIdent;
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "celestialCoordinates=" + celestialCoordinates +
                ", registerIdent='" + registerIdent + '\'' +
                '}';
    }
}

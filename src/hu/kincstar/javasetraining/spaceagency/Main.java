package hu.kincstar.javasetraining.spaceagency;

import java.math.BigDecimal;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
	    SpaceAgency sa = new SpaceAgency();

	    try {
            sa.registerSatellite(new Satellite(
                    new CelestialCoordinates(BigDecimal.valueOf(1000), BigDecimal.valueOf(1000), BigDecimal.valueOf(1000)),
                    "SAT1"));
            sa.registerSatellite(new Satellite(
                    new CelestialCoordinates(BigDecimal.valueOf(1000), BigDecimal.valueOf(1000), BigDecimal.valueOf(1000)),
                    "SAT2"));

            System.out.println(sa.findSatelliteByRegisterIdent("SAT1").toString());
            sa.findSatelliteByRegisterIdent("SAT1").modifyDestination(
                    new CelestialCoordinates(BigDecimal.valueOf(100), BigDecimal.valueOf(10), BigDecimal.valueOf(300)));
            System.out.println(sa.findSatelliteByRegisterIdent("SAT1").toString());

  /*          sa.registerSatellite(new Satellite(
                    new CelestialCoordinates(BigDecimal.valueOf(1000), BigDecimal.valueOf(1000), BigDecimal.valueOf(1000)),
                    "SAT1"));

            sa.registerSatellite(new Satellite(
                    new CelestialCoordinates(BigDecimal.valueOf(1000), BigDecimal.valueOf(1000), BigDecimal.valueOf(1000)),
                    null));

              sa.findSatelliteByRegisterIdent("");
              sa.findSatelliteByRegisterIdent(null);
*/
        } catch (IllegalArgumentException| NoSuchElementException ex){
	        ex.printStackTrace();
        }
    }
}

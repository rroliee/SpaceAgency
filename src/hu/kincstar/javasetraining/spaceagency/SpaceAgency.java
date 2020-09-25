package hu.kincstar.javasetraining.spaceagency;

import java.util.*;

public class SpaceAgency {

    Map<String, Satellite> satellites = new HashMap<>();

    public void registerSatellite(Satellite satellite){
        if(satellite == null){
            throw new IllegalArgumentException("satellite is null");
        }

        if(satellites.containsKey(satellite.getRegisterIdent())){
            throw new IllegalArgumentException("satellite is already registered");
        }

        satellites.put(satellite.getRegisterIdent(), satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent){
        if(registerIdent == null || registerIdent.isEmpty()){
            throw new IllegalArgumentException("registerIdent is null or empty");
        }

        if(satellites.containsKey(registerIdent)){
            return satellites.get(registerIdent);
        }

        throw new NoSuchElementException("No satellite with id: " + registerIdent);
    }

}

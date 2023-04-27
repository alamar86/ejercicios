package com.openbootcamp.services;

import com.openbootcamp.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootcamperService {
    private final List<Bootcamper> bootcampers = new ArrayList();

    public List<Bootcamper> getAll() {
        return bootcampers;
    }
    public void add(Bootcamper bootcamper){
        bootcampers.add(bootcamper);
    }

    public Bootcamper get(String nombre){
        for (Bootcamper bootcamper : bootcampers) {
            if(bootcamper.getNombre().equalsIgnoreCase(nombre)){
                return bootcamper;
            }
        }
        return null;
    }
    public Bootcamper delete(String dni){
        for (Bootcamper bootcamper : bootcampers) {
            if(bootcamper.getDni().equalsIgnoreCase(dni)){
                bootcampers.remove(bootcamper);
                return bootcamper;
            }
        }
        return null;
    }
    public Bootcamper update(String dni, Bootcamper bootcamper){
        for (int i = 0; i < bootcampers.size(); i++) {
            if(bootcampers.get(i).getDni().equalsIgnoreCase(dni)){
                bootcampers.set(i, bootcamper);
                return bootcamper;
            }
        }
        return null;
    }

}


package edu.eci.arsw.cinema.filtros.impl;

import edu.eci.arsw.cinema.filtros.CinemaFilter;
import edu.eci.arsw.cinema.model.CinemaFunction;

import java.util.List;

public class AvailabilityFilter implements CinemaFilter{

    @Override
    public List<CinemaFunction> filter(List<CinemaFunction> functions, String filtro) {
        List<CinemaFunction> newFunctions = null;
        int seats = Integer.parseInt(filtro);
        for(CinemaFunction c : functions){
            int emptySeats = c.getSeats().size()*c.getSeats().get(0).size();
            if(emptySeats > seats){
                newFunctions.add(c);
            }
        }
        return null;
    }
}
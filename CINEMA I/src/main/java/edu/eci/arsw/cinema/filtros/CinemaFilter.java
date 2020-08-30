

package edu.eci.arsw.cinema.filtros;

import edu.eci.arsw.cinema.model.CinemaFunction;

import java.util.List;

public interface CinemaFilter {

    public List<CinemaFunction> filter (List<CinemaFunction> functions, String filtro);
}
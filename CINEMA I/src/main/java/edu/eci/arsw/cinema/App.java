package edu.eci.arsw.cinema;

import edu.eci.arsw.cinema.model.CinemaFunction;
import edu.eci.arsw.cinema.persistence.CinemaException;
import edu.eci.arsw.cinema.persistence.CinemaPersistenceException;
import edu.eci.arsw.cinema.services.CinemaServices;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import java.util.List;


public class App {

    public static void main(String a[]) throws CinemaException, CinemaPersistenceException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CinemaServices cs = ac.getBean(CinemaServices.class);
        List<CinemaFunction> lista = cs.getFunctionsbyCinemaAndDate("cinemaX", "2018-12-18 15:30");
        for (CinemaFunction function : lista) {
            System.out.println(function.getDate());
        }
        cs.buyTicket(1,2,"cinemaX","2018-12-18 15:30","SuperHeroes Movie");
        List<CinemaFunction> lista2 = cs.getFunctionsbyCinemaAndDate("cinemaX", "2018-12-18 15:30");
        for (CinemaFunction function : lista2) {
            System.out.println(function.getSeats());
        }




    }
}

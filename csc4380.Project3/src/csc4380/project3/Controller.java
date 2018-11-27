/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380.project3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.EventListener;

/**
 *
 * @author Joana
 */
public class Controller {
    
    private View views;
    private Model models;
    public int movieId, showId;

    Controller (Model model, View view)
    {
        views = view;
        views.addALSeats(new seatListener());
        views.addALMovie(new movieListener());
        

        models = model;
        for (int i = 1; i <= 4; i++) {
            views.setMovieTitle(model.getMovie(i), i);
        }
    }

    class seatListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            views.checkout();
        }      
    }
    
    class movieListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //int movieId = views.getMovie();
            if (e.getSource() == views.movie1) {
                movieId = 1;
            } else if (e.getSource() == views.movie2) {
                movieId = 2;
            } else if (e.getSource() == views.movie3) {
                movieId = 3;
            } else if (e.getSource() == views.movie4) {
                movieId = 4;
            }
            
            views.addTimes(models.getShowtimes(movieId)); 
            views.showTimes();
            views.addTimeAL(new timeButtonsListener());
        }
    }

    class timeButtonsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 10; i++) {
                if (e.getSource() == views.movietimes[i])  {
                    showId = models.getShowID(movieId, views.movietimes[i].getText());
                    break;
                }
            }
            
            
            views.genSeats();
            views.addSeats();
            
            views.showSeats(models.getSeats(showId));
        }
    }
}


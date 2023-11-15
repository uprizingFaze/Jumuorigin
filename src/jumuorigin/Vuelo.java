/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jumuorigin;

import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author macbookpro
 */
    class Vuelo implements Comparable<Vuelo> {

        LocalTime despegue;
        LocalTime aterrizaje;

        Vuelo(LocalTime despegue, LocalTime aterrizaje) {
            this.despegue = despegue;
            this.aterrizaje = aterrizaje;
        }

        @Override
        public int compareTo(Vuelo otro) {
            return this.despegue.compareTo(otro.despegue);
        }
    }
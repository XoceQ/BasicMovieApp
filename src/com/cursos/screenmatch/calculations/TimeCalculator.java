package com.cursos.screenmatch.calculations;

import com.curso.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime = 0;

    public int getTotalTime() {
        return totalTime;
    }

   public void include(Title tile){
        this.totalTime += tile.getDurationInMinutes();
   }

}

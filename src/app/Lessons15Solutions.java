package app;

import app.models.DayAdvisor;
import app.service.Advisor;
import app.staticHelper.Day;

public class Lessons15Solutions {

    static public void main(String[] args){

        Advisor advisor = new DayAdvisor();

        // Перевіряємо
        for (Day day : Day.values()) {
            System.out.print(day + ": ");
            advisor.advise(day);
        }

    }
}

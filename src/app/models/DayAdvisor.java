package app.models;

import app.service.Advisor;
import app.staticHelper.Day;

public class DayAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY ->
                    System.out.println("Сконцентруйся на важливих завданнях");
            case TUESDAY ->
                    System.out.println("Сплануйте свій час ефективно");
            case  WEDNESDAY, THURSDAY ->
                    System.out.println("Перевір чи виконані завдання");
            case FRIDAY ->
                    System.out.println("Happy Friday!");
            case SATURDAY->
                    System.out.println("Відвідати парк.");
            case SUNDAY ->
                    System.out.println("Провести час з близькими на природі.");
        }
    }



}

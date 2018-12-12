package ru.goluzov.se;

import ru.goluzov.se.competitors.*;
import ru.goluzov.se.course.*;

public class HomeWork1{

        public static void main(String[] args) {

            Course course1 = new Course(new Cross(300), new Wall(2),
                    new Cross(800), new Water(5));

            Team team1 = new Team("Team 1", new Human("Bob"), new Cat("Barsik"),
                    new Dog("Bobik"), new Dog("Sharik"));

            Team team2 = new Team("Team 2", new Human("Molly"), new Cat("Frank"),
                    new Dog("Tom"), new Dog("Chip"));


            course1.doIt(team1);
            course1.doIt(team2);

            System.out.println("\n===== RESULTS =====\n");
            team1.showResults();
            System.out.println();
            team2.showResults();
        }
    }


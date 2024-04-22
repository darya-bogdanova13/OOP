import student.Gryffindor;
import student.Hufflepuff;
import student.Ravenclaw;
import student.Slytherin;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 80, 60, 90,90, 70);
        System.out.println(harryPotter);

        Gryffindor hermioneJeanGranger = new Gryffindor("Hermione Jean Granger",100, 90, 100, 100, 90);

        Gryffindor ronaldBilius = new Gryffindor("Ronald Bilius",  50, 40, 60, 70, 60);

        harryPotter.compare(hermioneJeanGranger);
        harryPotter.databaseСomparison(hermioneJeanGranger);

        harryPotter.compare(ronaldBilius);
        harryPotter.databaseСomparison(ronaldBilius);

        hermioneJeanGranger.compare(ronaldBilius);
        hermioneJeanGranger.databaseСomparison(ronaldBilius);



        Slytherin dracoLuciusMalfoy = new Slytherin("Draco Lucius Malfoy", 80, 60,100, 70, 90, 60, 70);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 40, 50,40,70, 30,90, 70);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 30, 30, 50, 50, 70, 70, 80);

        harryPotter.databaseСomparison(dracoLuciusMalfoy);
        gregoryGoyle.compare(grahamMontague);
        gregoryGoyle.databaseСomparison(grahamMontague);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 100, 80, 80, 90, 50);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 70, 80, 50,60, 70);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 60, 80, 60, 70, 80);

        zachariasSmith.compare(justinFinchFletchley);
        zachariasSmith.databaseСomparison(justinFinchFletchley);
        cedricDiggory.databaseСomparison(hermioneJeanGranger);

        Ravenclaw choChang = new Ravenclaw("Cho Chang", 100, 100, 90,80, 60, 70, 90);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 40, 50, 50, 50, 50, 60, 70);
        Ravenclaw  marcusBelby = new Ravenclaw("Marcus Belby", 40, 20, 40, 40, 50,30, 50);

        choChang.databaseСomparison(ronaldBilius);
        choChang.compare(marcusBelby);
    }
}
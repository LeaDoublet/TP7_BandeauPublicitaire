package exemple;

import java.util.ArrayList;
import java.util.List;
import bandeau.Bandeau;
public class Scenario {
    private List<Effet> effet;
    private List<Integer> repetitionCompte;

    public Scenario(){
        this.effet = new ArrayList<Effet>();
        this.repetitionCompte = new ArrayList<Integer>();
    }
    public Scenario(List<Effet> effet, List<Integer> repetitionCompte) {
        this.effet = effet;
        this.repetitionCompte = repetitionCompte;
    }

    public void creerScenarioDeBase() {
        // Example scenario
        ajoutEffet(new GaucheADroiteEffet(), 2); // Repeat twice
        ajoutEffet(new ChangementDeCouleurEffet(), 1); // Repeat once
    }


    public void ajoutEffet(Effet effet, int repetitionCount) {
        this.effet.add(effet);
        this.repetitionCompte.add(repetitionCount);
    }

    public void appliquer(Bandeau bandeau) {
        for (int i = 0; i < effet.size(); i++) {
            Effet effet = this.effet.get(i);
            int repetitionCount = repetitionCompte.get(i);

            for (int j = 0; j < repetitionCount; j++) {
                effet.appliquer(bandeau);
            }
        }
    }

}

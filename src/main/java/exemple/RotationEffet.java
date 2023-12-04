package exemple;

import bandeau.Bandeau;

public class RotationEffet extends Effet {
    @Override
    public void appliquer(Bandeau bandeau) {

            bandeau.setMessage("On tourne de 90°...");
            bandeau.setRotation(Math.PI / 2.0);  // Rotation de 45 degrés
            bandeau.sleep(1000);
            bandeau.setRotation(0.0);// Réinitialisation de la rotation
            bandeau.sleep(1000);

    }
}

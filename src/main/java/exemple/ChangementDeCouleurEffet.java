package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class ChangementDeCouleurEffet extends Effet {
    @Override
    public void appliquer(Bandeau bandeau) {

        bandeau.setBackground(Color.DARK_GRAY);
        bandeau.setMessage("On va changer de couleur");
        bandeau.sleep(1000);
        bandeau.setForeground(Color.YELLOW);
        bandeau.sleep(1000);
        bandeau.setFont(new Font("Dialog", Font.PLAIN, 15));
        bandeau.setForeground(Color.BLACK);
        bandeau.setBackground(Color.PINK);
        bandeau.setMessage("Bonjour");
        bandeau.sleep(3000);
    }
}

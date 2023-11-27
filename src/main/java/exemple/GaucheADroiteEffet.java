package exemple;

import bandeau.Bandeau;

public class GaucheADroiteEffet extends Effet {
    @Override
    public void appliquer(Bandeau bandeau) {
            String message = bandeau.getMessage();
            int length = message.length();

            for (int i = 0; i < length; i++) {
                StringBuilder partialMessage = new StringBuilder();
                for (int j = 0; j <= i; j++) {
                    partialMessage.append(message.charAt(j));
                }
                bandeau.setMessage(partialMessage.toString());
                bandeau.sleep(100);
            }
    }
}

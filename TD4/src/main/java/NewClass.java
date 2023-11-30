import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class NewClass{
    public static void main(String[] args) {
        // Créer une instance de GregorianCalendar
        Calendar calendrier = new GregorianCalendar();

        // Accéder aux composants de la date
        int année = calendrier.get(Calendar.YEAR);
        int mois = calendrier.get(Calendar.MONTH) + 1;  // Les mois commencent à partir de zéro
        int jour = calendrier.get(Calendar.DAY_OF_MONTH);

        // Afficher la date actuelle
        System.out.println("Date actuelle : " + jour + "-" + mois + "-" + année);

        // Ajouter 7 jours à la date actuelle
        calendrier.add(Calendar.DAY_OF_MONTH, 7);

        // Afficher la date après ajout de 7 jours
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String dateFormatee = format.format(calendrier.getTime());
        System.out.println("Date après ajout de 7 jours : " + dateFormatee);
    }
}


public class Leder extends Ansat {
    int lederniveau;
    double månedsløn;

    public Leder() {
    }

    public Leder(int lederniveau, double månedsløn) {
        this.lederniveau = lederniveau;
        this.månedsløn = månedsløn;
    }

    public Leder(int medarbejderNr, String fnavn, String enavn, String adresse, String ansættelsesdato, String afdelingsNummer, int lederniveau, double månedsløn) {
        super(medarbejderNr, fnavn, enavn, adresse, ansættelsesdato, afdelingsNummer);
        this.lederniveau = lederniveau;
        this.månedsløn = månedsløn;
    }

    public int getLederniveau() {
        return lederniveau;
    }

    public void setLederniveau(int lederniveau) {
        this.lederniveau = lederniveau;
    }

    public double getMånedsløn() {
        return månedsløn;
    }

    public void setMånedsløn(double månedsløn) {
        this.månedsløn = månedsløn;
    }

    @Override
    public String toString() {
        return "Leder{" +
                "lederniveau=" + lederniveau +
                ", månedsløn=" + månedsløn +
                ", medarbejderNr=" + medarbejderNr +
                ", fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ansættelsesdato='" + ansættelsesdato + '\'' +
                ", afdelingsNummer='" + afdelingsNummer + '\'' +
                '}';
    }
}

public class Ansat {
    int medarbejderNr;
    String fnavn, enavn, adresse, ansættelsesdato, afdelingsNummer;

    public Ansat() {
    }

    public Ansat(int medarbejderNr, String fnavn, String enavn, String adresse, String ansættelsesdato, String afdelingsNummer) {
        this.medarbejderNr = medarbejderNr;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.adresse = adresse;
        this.ansættelsesdato = ansættelsesdato;
        this.afdelingsNummer = afdelingsNummer;
    }

    public int getMedarbejderNr() {
        return medarbejderNr;
    }

    public void setMedarbejderNr(int medarbejderNr) {
        this.medarbejderNr = medarbejderNr;
    }

    public String getFnavn() {
        return fnavn;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAnsættelsesdato() {
        return ansættelsesdato;
    }

    public void setAnsættelsesdato(String ansættelsesdato) {
        this.ansættelsesdato = ansættelsesdato;
    }

    public String getAfdelingsNummer() {
        return afdelingsNummer;
    }

    public void setAfdelingsNummer(String afdelingsNummer) {
        this.afdelingsNummer = afdelingsNummer;
    }

    @Override
    public String toString() {
        return "Ansat{" +
                "medarbejderNr=" + medarbejderNr +
                ", fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ansættelsesdato='" + ansættelsesdato + '\'' +
                ", afdelingsNummer='" + afdelingsNummer + '\'' +
                '}';
    }
}

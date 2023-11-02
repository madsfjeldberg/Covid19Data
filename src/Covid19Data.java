public class Covid19Data {

    private String region;
    private String aldersgruppe;
    private int totalTilfælde;
    private int døde;
    private int intensiv;
    private int indlagte;

    public Covid19Data(String region, String aldersgruppe, int totalTilfælde, int døde, int intensiv, int indlagte) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.totalTilfælde = totalTilfælde;
        this.døde = døde;
        this.intensiv = intensiv;
        this.indlagte = indlagte;
    }

    @Override
    public String toString() {
        return "Covid19Data{" +
                "region='" + region + '\'' +
                ", aldersgruppe='" + aldersgruppe + '\'' +
                ", totalTilfælde=" + totalTilfælde +
                ", døde=" + døde +
                ", intensiv=" + intensiv +
                ", indlagte=" + indlagte +
                '}' + "\n";
    }
}

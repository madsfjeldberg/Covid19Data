import java.util.Comparator;

public class AlderComparator implements Comparator<Covid19Data> {

    @Override
    public int compare(Covid19Data o1, Covid19Data o2) {
        String str1 = o1.getAldersgruppe().substring(0,1);
        String str2 = o2.getAldersgruppe().substring(0,1);
        if (Integer.parseInt(str1) < Integer.parseInt(str2)) {
            return -1;
        }
        else if (Integer.parseInt(str1) > Integer.parseInt(str2)) {
            return 1;
        }
        else return 0;
    }
}

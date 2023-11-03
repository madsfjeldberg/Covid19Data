import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        ArrayList<Covid19Data> data = fh.loadList();

        System.out.println(data);
        Collections.sort(data, new RegionComparator());
        System.out.println(data);
        Collections.sort(data, new AlderComparator());
        System.out.println(data);


    }
}

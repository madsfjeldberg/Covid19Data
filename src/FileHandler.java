import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {


    public FileHandler() {
        File f = new File("Book2.csv");
        try {
            Scanner sc = new Scanner(f, StandardCharsets.ISO_8859_1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Covid19Data> loadList() {
        ArrayList<Covid19Data> list = new ArrayList<Covid19Data>();
        File f = new File("Book2.csv");
        Scanner sc = null;
        try {
            sc = new Scanner(f, StandardCharsets.ISO_8859_1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (sc.hasNextLine()) {

            String region;
            String aldersgruppe;
            int totalTilfælde;
            int døde;
            int intensiv;
            int indlagte;

            String[] stringSplit = sc.nextLine().split(";");
            region = stringSplit[0];
            aldersgruppe = stringSplit[1];
            totalTilfælde = Integer.parseInt(stringSplit[2]);
            døde = Integer.parseInt(stringSplit[3]);
            intensiv = Integer.parseInt(stringSplit[4]);
            indlagte = Integer.parseInt(stringSplit[5]);

            Covid19Data data = new Covid19Data(region, aldersgruppe, totalTilfælde, døde, intensiv, indlagte);
            list.add(data);


        }
        return list;
    }

}

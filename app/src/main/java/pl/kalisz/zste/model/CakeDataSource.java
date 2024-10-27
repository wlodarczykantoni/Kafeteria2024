package pl.kalisz.zste.model;

import java.util.ArrayList;
import java.util.List;

import pl.kalisz.zste.R;

public class CakeDataSource {
    public static List<Cake> getCakes() {
        ArrayList<Cake> cakes = new ArrayList<>();
        cakes.add(new Cake("Ciasto czekoladowe", "Ciasto czekoladowe to klasyczny deser o intensywnym smaku czekolady. " +
                "Przygotowywane z najwyższej jakości kakao, ma bogatą, wilgotną strukturę, która rozpływa się w ustach. " +
                "Często podawane z bitą śmietaną, owocami lub polewą czekoladową, stanowi idealny wybór dla miłośników czekolady.",
                R.drawable.ciasto_czeko));

        cakes.add(new Cake("Ciasto truskawkowe", "Ciasto truskawkowe to lekki, owocowy deser, który łączy słodki smak truskawek " +
                "ze świeżą, puszystą bazą. Często zdobione bitą śmietaną lub galaretką truskawkową, doskonale nadaje się na " +
                "letnie spotkania i imprezy. Jego orzeźwiający smak sprawia, że jest ulubieńcem wielu.",
                R.drawable.ciasto_trusk));

        cakes.add(new Cake("Sernik", "Sernik to jeden z najpopularniejszych polskich deserów, przygotowywany na bazie twarogu. " +
                "Jest gładki, kremowy i delikatnie słodki, a jego smak wzbogacają dodatki takie jak rodzynki, skórka pomarańczowa " +
                "czy polewa czekoladowa. Idealny na każdą okazję, zarówno na ciepło, jak i na zimno.",
                R.drawable.ciasto_ser));
            return cakes;
    }
}
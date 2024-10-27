package pl.kalisz.zste.model;

import java.util.ArrayList;
import java.util.List;

import pl.kalisz.zste.R;

public class SweetDataSource {

    public static List<Sweet> getSweets() {
        ArrayList<Sweet> sweets = new ArrayList<>();
        sweets.add(new Sweet("Pączki", "Pączki to tradycyjne polskie ciasto smażone na głębokim tłuszczu, wypełnione słodkim nadzieniem, " +
                "najczęściej różaną marmoladą lub innymi owocowymi przetworami. Pokryte są cukrem pudrem lub lukrem. " +
                "Często spożywane podczas Tłustego Czwartku, są symbolem polskiej kuchni.", R.drawable.paczek));

        sweets.add(new Sweet("Drożdżówki", "Drożdżówki to popularne słodkie bułki wyrabiane na bazie drożdży, często nadziewane serem, owocami, " +
                "lub czekoladą. Są puszyste i miękkie, doskonale nadające się na szybkie śniadanie lub przekąskę. " +
                "Ich słodki smak sprawia, że są lubiane zarówno przez dorosłych, jak i dzieci.", R.drawable.drozdzowki));

        sweets.add(new Sweet("Batoniki", "Batoniki to małe przekąski wykonane z czekolady, bakalii, orzechów, czy ziaren. Są słodkie, " +
                "pełne energii i idealne na szybki zastrzyk cukru w ciągu dnia. Batoniki występują w różnych smakach " +
                "i wariacjach, co sprawia, że każdy znajdzie coś dla siebie.", R.drawable.batonik));

        return sweets;
    }
}

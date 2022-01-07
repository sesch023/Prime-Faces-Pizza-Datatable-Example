package de.fhswf.fit;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class PizzaService {
    private List<PizzaModel> pizzas;

    @PostConstruct
    public void init() {
        this.pizzas = new ArrayList<>();
        this.pizzas.add(new PizzaModel(0, "Hawaii", 26, 6.99,
                "Eine leckere Pizza mit Schinken und Ananas.",
                "Sebastian Schmidt",
                "Straße 1", "Hemer"));
        this.pizzas.add(new PizzaModel(1, "Salami", 35, 12.99,
                "Eine leckere Pizza mit viel Salami.",
                "Thomas Müller",
                "Bahnhofsweg 2", "Iserlohn"));
        this.pizzas.add(new PizzaModel(2, "Margarita", 26, 5.99,
                "Eine leckere Pizza mit Tomatensoße und Käse und so.",
                "Christian Gawron",
                "Hauptstraße 100", "Iserlohn"));
        this.pizzas.add(new PizzaModel(3, "Vier Jahreszeiten", 24, 6.99,
                "Eine leckere Pizza mit vier Jahreszeiten.",
                "Sebastian Schmidt",
                "Strasse 1", "Hemer"));
        this.pizzas.add(new PizzaModel(4, "Familienpizza", 50, 16.99,
                "Eine leckere Pizza für die ganze Familie.",
                "Heinz Jochen",
                "Schröderweg 32b", "Hemer"));
        this.pizzas.add(new PizzaModel(5, "Funghi", 35, 12.99,
                "Eine leckere Pizza mit reichlich Pilzen.",
                "Koch",
                "Iserlohnerstraße 1", "Menden"));
    }

    public List<PizzaModel> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaModel> pizzas) {
        this.pizzas = pizzas;
    }
}

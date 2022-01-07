package de.fhswf.fit;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;

@Named("pizzaView")
@ViewScoped
public class PizzaView implements Serializable {
    @Inject
    private PizzaService pizzaService;
    private List<PizzaModel> filteredPizzas1;
    private List<PizzaModel> filteredPizzas2;
    private PizzaModel selectedPizza;

    public boolean globalFilterFunction(Object value, Object filter, Locale locale) {
        String filterText = (filter == null) ? null : filter.toString().trim().toLowerCase();
        if (filterText == null || filterText.isEmpty()) {
            return true;
        }
        int filterInt = Util.getInteger(filterText);
        double filterDouble = Util.getDouble(filterText);

        PizzaModel pizza = (PizzaModel) value;
        return pizza.getPizzaName().toLowerCase().contains(filterText)
                || pizza.getCustomerName().toLowerCase().contains(filterText)
                || pizza.getCustomerCity().toLowerCase().contains(filterText)
                || pizza.getCustomerStreet().toLowerCase().contains(filterText)
                || pizza.getPizzaSize() == filterInt
                || pizza.getPizzaPrice() == filterDouble;
    }

    public PizzaModel getPizzaByID(long toFind){
        for (PizzaModel pizza: pizzaService.getPizzas()){
            if (pizza.getPizzaID() == toFind){
                return pizza;
            }
        }
        return null;
    }

    public List<PizzaModel> getPizzas(){
        return pizzaService.getPizzas();
    }


    public List<PizzaModel> getFilteredPizzas1() {
        return filteredPizzas1;
    }

    public void setFilteredPizzas1(List<PizzaModel> filteredPizzas1) {
        this.filteredPizzas1 = filteredPizzas1;
    }

    public List<PizzaModel> getFilteredPizzas2() {
        return filteredPizzas2;
    }

    public void setFilteredPizzas2(List<PizzaModel> filteredPizzas2) {
        this.filteredPizzas2 = filteredPizzas2;
    }

    public PizzaModel getSelectedPizza() {
        return selectedPizza;
    }

    public void setSelectedPizza(PizzaModel selectedPizza) {
        this.selectedPizza = selectedPizza;
    }
}

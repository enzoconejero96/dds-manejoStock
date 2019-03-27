package solucion;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;

public class Componente extends Item {

    private List<Item> items;

    public Componente(String nombre, List<Item> items) {
        super(nombre);
        this.items = items;
    }

    public Componente(String id) {
        super(id);
        this.items = new ArrayList<Item>();
    }

    public void agregarItem(Item item){
        items.add(item);
    }

    public void agregarItem(Item item, int cantidad){
        item.setCantidad(cantidad);
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

}

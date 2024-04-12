package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    //this method adds an item to the menu
    public void addItem(MenuItem newItem) {
        newItem.setNew(true);
        items.add(newItem);
        this.lastUpdated = new Date();
    }

    public void removeItem(MenuItem removeItem) {
        items.remove(removeItem);
        this.lastUpdated = new Date();
    }

}

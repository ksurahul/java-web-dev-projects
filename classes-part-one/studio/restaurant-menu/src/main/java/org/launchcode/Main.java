package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem casserole = new MenuItem(15, "good food", "Main Course", false);
        MenuItem chickenPasta = new MenuItem(20, "pasta with chicken", "Main Course", false);
        MenuItem chocolateCake = new MenuItem(10, "simple chocolate cake", "Dessert", true);
        MenuItem eggroll = new MenuItem(6, "normal eggroll", "Appetizer", false);


        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(casserole);
        menuItems.add(chickenPasta);
        menuItems.add(chocolateCake);
        menuItems.add(eggroll);

        Menu menu = new Menu(new Date(),menuItems);
        //System.out.println(menu.getItems());
        //menu.removeItem(eggroll);
       // System.out.println(menu.getItems());
        menu.addItem(new MenuItem(6, "normal eggroll", "Appetizer", false));
        System.out.println(menu.getItems());
    }
}

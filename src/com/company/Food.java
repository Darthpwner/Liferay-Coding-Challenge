package com.company;

import java.util.Vector;

/**
 * Created by Darthpwner on 11/9/15.
 */
public class Food {
    Food() {
        m_food.add(beef);
        m_food.add(burger);
        m_food.add(cheese);
        m_food.add(chicken);
        m_food.add(chocolate);
        m_food.add(chocolates);
        m_food.add(fish);
        m_food.add(pizza);
        m_food.add(pork);
    }

    String getFood(int i) {
        return m_food.get(i);
    }

    int getFoodVectorSize() {
        return m_food.size();
    }

    final String beef = "beef";
    final String burger = "burger";
    final String cheese = "cheese";
    final String chicken = "chicken";
    final String chocolate = "chocolate";
    final String chocolates = "chocolates";
    final String fish = "fish";
    final String pizza = "pizza";
    final String pork = "pork";

    private Vector<String> m_food = new Vector<String>();
}

package com.company;

import java.util.Vector;

/**
 * Created by Darthpwner on 11/9/15.
 */
public class Food {
    Food() {
        m_food.add(artichoke);
        m_food.add(aragula);
        m_food.add(asparagus);
        m_food.add(avocado);
        m_food.add(bamboo);
        m_food.add(bean);
        m_food.add(beans);
        m_food.add(beef);
        m_food.add(broccoli);
        m_food.add(burger);
        m_food.add(cabbage);
        m_food.add(capers);
        m_food.add(carrot);
        m_food.add(cassava);
        m_food.add(cauliflower);
        m_food.add(celery);
        m_food.add(cheese);
        m_food.add(chicken);
        m_food.add(chocolate);
        m_food.add(chocolates);
        m_food.add(corn);
        m_food.add(cucumber);
        m_food.add(edamame);
        m_food.add(eggplant);
        m_food.add(fish);
        m_food.add(garlic);
        m_food.add(ginger);
        m_food.add(grapes);
        m_food.add(lettuce);
        m_food.add(olive);
        m_food.add(onion);
        m_food.add(peas);
        m_food.add(pizza);
        m_food.add(pork);
        m_food.add(potato);
        m_food.add(pumpkin);
        m_food.add(radish);
        m_food.add(spinach);
        m_food.add(tomato);
        m_food.add(turnip);
        m_food.add(yams);
        m_food.add(zucchini);
    }

    String getFood(int i) {
        return m_food.get(i);
    }

    int getFoodVectorSize() {
        return m_food.size();
    }
    
    final String artichoke = "artichoke";
    final String aragula = "aragula";
    final String asparagus = "asparagus";
    final String avocado = "avocado";
    final String bamboo = "bamboo";
    final String bean = "bean";
    final String beans = "beans";
    final String beef = "beef";
    final String broccoli = "broccoli";
    final String burger = "burger";
    final String cabbage = "cabbage";
    final String capers = "capers";
    final String carrot = "carrot";
    final String cassava = "cassava";
    final String cauliflower = "cauliflower";
    final String celery = "celery";
    final String cheese = "cheese";
    final String chicken = "chicken";
    final String chocolate = "chocolate";
    final String chocolates = "chocolates";
    final String corn = "corn";
    final String cucumber = "cucumber";
    final String edamame = "edamame";
    final String eggplant = "eggplant";
    final String fish = "fish";
    final String garlic = "garlic";
    final String ginger = "ginger";
    final String grapes = "grapes";
    final String lettuce = "lettuce";
    final String olive = "olive";
    final String onion = "onion";
    final String peas = "peas";
    final String pizza = "pizza";
    final String pork = "pork";
    final String potato = "potato";
    final String pumpkin = "pumpkin";
    final String radish = "radish";
    final String spinach = "spinach";
    final String tomato = "tomato";
    final String turnip = "turnip";
    final String yams = "yams";
    final String zucchini = "zucchini";

    private Vector<String> m_food = new Vector<String>();
}

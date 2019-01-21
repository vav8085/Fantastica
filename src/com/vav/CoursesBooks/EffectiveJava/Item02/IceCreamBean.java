package com.vav.CoursesBooks.EffectiveJava.Item02;

public class IceCreamBean {

    enum CupSize{SMALL, MEDIUM, LARGE}
    enum GelatoFlavour{VANILLA, STRAWBERRY, CHOCOLATE}
    enum SyrupFlavour{CHOCOLATE, PINEAPPLE,LIME}
    enum Toppings{ALMONDS, CASHEWS, RAISINS, CHOCOLATE_CHIPS, BLUEBERRIES}

    class Brownie{}
    class Banana{}

    CupSize cupSize;
    GelatoFlavour gelato;
    SyrupFlavour syrupFlavour;
    Toppings toppings;
    Brownie brownie;
    Banana banana;

    public CupSize getCupSize() {
        return cupSize;
    }

    public void setCupSize(CupSize cupSize) {
        this.cupSize = cupSize;
    }

    public GelatoFlavour getGelato() {
        return gelato;
    }

    public void setGelato(GelatoFlavour gelato) {
        this.gelato = gelato;
    }

    public SyrupFlavour getSyrupFlavour() {
        return syrupFlavour;
    }

    public void setSyrupFlavour(SyrupFlavour syrupFlavour) {
        this.syrupFlavour = syrupFlavour;
    }

    public Toppings getToppings() {
        return toppings;
    }

    public void setToppings(Toppings toppings) {
        this.toppings = toppings;
    }

    public Brownie getBrownie() {
        return brownie;
    }

    public void setBrownie(Brownie brownie) {
        this.brownie = brownie;
    }

    public Banana getBanana() {
        return banana;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }
}




package com.vav.EffectiveJava.Item02;

public class IceCreamBuilder {
    enum CupSize{SMALL, MEDIUM, LARGE}
    enum GelatoFlavour{VANILLA, STRAWBERRY, CHOCOLATE}
    enum SyrupFlavour{NO, CHOCOLATE, PINEAPPLE,LIME}
    enum Toppings{NO, ALMONDS, CASHEWS, RAISINS, CHOCOLATE_CHIPS, BLUEBERRIES}

    static class Brownie{}
    static class Banana{}

    private final CupSize cupSize;
    private final GelatoFlavour gelato;
    private final SyrupFlavour syrupFlavour;
    private final Toppings toppings;
    private final Brownie brownie;
    private final Banana banana;

    public static class Builder{
        //mandatory params
        private final CupSize cupSize;
        private final GelatoFlavour gelato;
        //Optional params
        SyrupFlavour syrupFlavour = SyrupFlavour.NO;
        Toppings toppings = Toppings.NO;
        Brownie brownie = null;
        Banana banana = null;

        public Builder(CupSize cupSize, GelatoFlavour gelato) {
            this.cupSize = cupSize;
            this.gelato = gelato;
        }
        public IceCreamBuilder build(){
            return new IceCreamBuilder(this);
        }

        public Builder setSyrupFlavour(SyrupFlavour syrupFlavour) {
            this.syrupFlavour = syrupFlavour;
            return this;
        }

        public Builder setToppings(Toppings toppings) {
            this.toppings = toppings;
            return this;
        }

        public Builder setBrownie(Brownie brownie) {
            this.brownie = brownie;
            return this;
        }

        public Builder setBanana(Banana banana) {
            this.banana = banana;
            return this;
        }
    }
    private IceCreamBuilder(Builder builder){
        cupSize = builder.cupSize;
        gelato = builder.gelato;
        syrupFlavour = builder.syrupFlavour;
        toppings = builder.toppings;
        brownie = builder.brownie;
        banana = builder.banana;
    }


    public static void main(String arg[]){
        //How to use
        Builder builder = new IceCreamBuilder.Builder(CupSize.MEDIUM, GelatoFlavour.CHOCOLATE);
        builder.setBanana(new Banana()).setBrownie(new Brownie()).setSyrupFlavour(SyrupFlavour.CHOCOLATE).;
        IceCreamBuilder iceCreamBuilder = builder.build();
    }
}

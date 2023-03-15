package dev.joeyk;

class Kitchen {
    private Oven oven;


    Kitchen(Oven oven) {
        this.oven = oven;
    }


    void prepareMeal() {
        oven.bake();
    }
}

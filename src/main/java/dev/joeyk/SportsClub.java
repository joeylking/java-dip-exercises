package dev.joeyk;

class SportsClub {
    private Sport sport;


    SportsClub(Sport sport) {
        this.sport = sport;
    }


    void organizeGame() {
        sport.play();
    }
}

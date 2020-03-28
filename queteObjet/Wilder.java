package com.company;
class Wilder {


    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;

    }

    public String getFirstname(String firstname) {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean getAware(boolean aware) {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI () {

        if (aware) {
            return "Je m'appelle " + firstname + " et je suis aware";
        }
        return "Je m'appelle " + firstname + " et je ne suis pas aware";


    }
}

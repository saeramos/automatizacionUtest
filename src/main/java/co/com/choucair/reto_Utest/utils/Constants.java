package co.com.choucair.reto_Utest.utils;

public enum Constants {
    WELCOME_MESSAGE ("Welcome to the world's largest community of freelance software testers!");

    final String constant;

    Constants(String constant) {
        this.constant = constant;
    }

    public String getValue() {
        return constant;
    }

}

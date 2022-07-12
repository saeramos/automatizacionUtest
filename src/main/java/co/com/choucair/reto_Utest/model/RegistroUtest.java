package co.com.choucair.reto_Utest.model;


import java.util.List;

public class RegistroUtest {
    private String first_name;
    private String last_name;
    private String email;
    private String city;
    private String postalcode;
    private String password;
    private List<String> idioms;



    public RegistroUtest(String first_name, String last_name, String email, String city, String postalcode,  String password, List<String> idioms, String computer, String version, String language, String mobile, String model, String system) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.city = city;
        this.postalcode = postalcode;
        this.password = password;

        this.idioms = idioms;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getPostalcode() {
        return postalcode;
    }


    public String getPassword() {
        return password;
    }


    public List<String> getIdioms() {
        return idioms;
    }

    public void setIdioms(List<String> idioms) {
        this.idioms = idioms;
    }



}



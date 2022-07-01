package co.com.choucair.reto_Utest.model;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class RegistroUtest {
    private String first_name;
    private String last_name;
    private String email;
    private String city;
    private String postalcode;
    private String pais;
    private String password;
    private String confirm_password;
    private List<String> idioms;

    public RegistroUtest(String first_name, String last_name, String email, String city, String postalcode, String pais, String password, String confirm_password, List<String> n) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.city = city;
        this.postalcode = postalcode;
        this.pais = pais;
        this.password = password;
        this.confirm_password = confirm_password;
        this.idioms = n ;

    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }

    public List<String> getIdioms() {
        return idioms;
    }

    public void setIdioms(List<String> idioms) {
        this.idioms = idioms;
    }
}

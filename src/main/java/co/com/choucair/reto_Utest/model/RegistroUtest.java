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

    private String computer;
    private String version;
    private String language;
    private String mobile;
    private String model;
    private String system;

    public RegistroUtest(String first_name, String last_name, String email, String city, String postalcode, String pais, String password, String confirm_password, List<String> idioms, String computer, String version, String language, String mobile, String model, String system) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.city = city;
        this.postalcode = postalcode;
        this.pais = pais;
        this.password = password;
        this.confirm_password = confirm_password;
        this.idioms = idioms;
        this.computer = computer;
        this.version = version;
        this.language = language;
        this.mobile = mobile;
        this.model = model;
        this.system = system;
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

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }
}



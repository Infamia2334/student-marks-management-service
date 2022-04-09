package io.infamia2334.marksmanager.models;

public class Address {
    private String houseBlockNumber;
    private String city;
    private String state;
    private String country;

    public Address() {
    }

    public Address(String houseBlockNumber, String city, String state, String country) {
        this.houseBlockNumber = houseBlockNumber;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getHouseBlockNumber() {
        return this.houseBlockNumber;
    }

    public void setHouseBlockNumber(String houseBlockNumber) {
        this.houseBlockNumber = houseBlockNumber;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "{" +
            " houseBlockNumber='" + getHouseBlockNumber() + "'" +
            ", city='" + getCity() + "'" +
            ", state='" + getState() + "'" +
            ", country='" + getCountry() + "'" +
            "}";
    }

}

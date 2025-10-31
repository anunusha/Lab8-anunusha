package com.example.lab08;

public class City {
    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    // Returns the city name
    public String getCityName(){
        return this.city;
    }

    // Returns the province name
    public String getProvinceName(){
        return this.province;
    }

    //compares between two city
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City cityObj = (City) o;
        return this.city.equals(cityObj.city)
                && this.province.equals(cityObj.province);
    }

    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }
}

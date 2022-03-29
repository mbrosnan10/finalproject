/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalDemoUpload;

/**
 *
 * @author k00214761
 */
public class Weather {
    private String County;
    private String Weather_Today ;
    private String Lo_Hi;
    private String Weather_tommorrow;
    private String Lo_Hi1;


    
    public Weather(String County, String Weather_Today, String Lo_Hi, String Weather_tommorrow, String Lo_Hi1) {
        this.County = County;
        this.Weather_Today = Weather_Today;
        this.Lo_Hi = Lo_Hi;
        this.Weather_tommorrow = Weather_tommorrow;
        this.Lo_Hi1 = Lo_Hi1;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String County) {
        this.County = County;
    }

    public String getWeather_Today() {
        return Weather_Today;
    }

    public void setWeather_Today(String Weather_Today) {
        this.Weather_Today = Weather_Today;
    }

    public String getLo_Hi() {
        return Lo_Hi;
    }

    public void setLo_Hi(String Lo_Hi) {
        this.Lo_Hi = Lo_Hi;
    }

    public String getWeather_tommorrow() {
        return Weather_tommorrow;
    }

    public void setWeather_tommorrow(String Weather_tommorrow) {
        this.Weather_tommorrow = Weather_tommorrow;
    }

    public String getLo_Hi1() {
        return Lo_Hi1;
    }

    public void setLo_Hi1(String Lo_Hi1) {
        this.Lo_Hi1 = Lo_Hi1;
    }
}

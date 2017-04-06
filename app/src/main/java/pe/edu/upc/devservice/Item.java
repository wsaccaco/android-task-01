package pe.edu.upc.devservice;

/**
 * Created by skynet on 3/04/17.
 */

public class Item {
    private String name;
    private String year;
    private String companys;
    private String proyects;
    private String description;
    private int pictureId;
    private double lat;
    private double lng;

    public Item(String name, String year, String companys, String description, int pictureId, double lat, double lng)
    {
        this.year = year;
        this.companys = companys;
        this.name = name;
        this.pictureId = pictureId;
        this.description = description;
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getCompanys() {
        return companys;
    }

    public String getProyects() {
        return proyects;
    }

    public String getDescription() {
        return description;
    }

    public int getPictureId() {
        return pictureId;
    }
}

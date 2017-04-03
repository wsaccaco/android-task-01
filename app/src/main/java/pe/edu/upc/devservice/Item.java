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

    public Item(String name, String year, String companys, String description, int pictureId)
    {
        this.year = year;
        this.companys = companys;
        this.name = name;
        this.pictureId = pictureId;
        this.description = description;
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

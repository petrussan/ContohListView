package id.ac.petra.contohlistview;

public class DataModel {
    String name;
    String type;
    String version_number;
    String release_date;

    public DataModel(String name, String type, String version_number, String release_date) {
        this.name = name;
        this.type = type;
        this.version_number = version_number;
        this.release_date = release_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion_number() {
        return version_number;
    }

    public void setVersion_number(String version_number) {
        this.version_number = version_number;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }
}

package Com.Music;

import java.util.Date;

public class Album {

    private String id;
    private String artist;
    private String name;
    private Date dateSortie;

    public Album(String artist, Date dateSortie, String id, String name) {
        this.artist = artist;
        this.dateSortie = dateSortie;
        this.id = id;
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

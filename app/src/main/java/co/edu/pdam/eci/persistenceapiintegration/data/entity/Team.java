package co.edu.pdam.eci.persistenceapiintegration.data.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * @author Santiago Carrillo
 */

//TODO add database annotations and proper model structure
@Entity
public class Team extends BaseEntity{

    @PrimaryKey
    private long id;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "shortName")
    private String shortName;

    @ColumnInfo(name = "imageUrl")
    private String imageUrl;

    void Team(){

    }

    @Override
    public Long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getShortName() {
        return shortName;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

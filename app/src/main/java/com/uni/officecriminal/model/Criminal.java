package com.uni.officecriminal.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class Criminal {
    @Id(autoincrement = true)
    long id;

    String title;

    String descriptiom;

    String imagePath;

    Boolean solved;

    Date creationDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptiom() {
        return descriptiom;
    }

    public void setDescriptiom(String descriptiom) {
        this.descriptiom = descriptiom;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }



    public void setSolved(Boolean solved) {
        this.solved = solved;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Criminal(String title, Date creationDate) {
        this.title = title;
        this.creationDate = creationDate;
    }

    public Criminal() {
    }

    @Generated(hash = 1161280648)
    public Criminal(long id, String title, String descriptiom, String imagePath,
            Boolean solved, Date creationDate) {
        this.id = id;
        this.title = title;
        this.descriptiom = descriptiom;
        this.imagePath = imagePath;
        this.solved = solved;
        this.creationDate = creationDate;
    }

    public static List<Criminal> createCriminals() {
        List<Criminal> criminals = new ArrayList<>();
        for (int i=0; i<100; i++) {
            String title = String.format("Criminal #%d", i);
            Date date = new Date();
            criminals.add(new Criminal(
                title, date
            ));
        }

        return criminals;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boolean getSolved() {
        return this.solved;
    }
}

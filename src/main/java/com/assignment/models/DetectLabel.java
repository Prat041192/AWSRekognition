package com.assignment.models;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class DetectLabel implements Serializable {

    String photoname;
    String bucketname;


    public String getPhotoName() {
        return photoname;
    }

    public void setPhotoName(String photoName) {
        photoname = photoName;
    }

    public String getBucketName() {
        return bucketname;
    }

    public void setBucketName(String bucketName) {
        bucketname = bucketName;
    }

}

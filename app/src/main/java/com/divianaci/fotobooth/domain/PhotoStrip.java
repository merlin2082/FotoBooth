package com.divianaci.fotobooth.domain;

import android.media.Image;

import java.util.List;

/**
 * Created by Merlin on 3/8/2015.
 */
public class PhotoStrip {
    private List<Image> photos;
    private Image compiledPhotoStrip;


    public Image getCompiledPhotoStrip() {
        return compiledPhotoStrip;
    }

    public void setCompiledPhotoStrip(Image compiledPhotoStrip) {
        this.compiledPhotoStrip = compiledPhotoStrip;
    }

    public List<Image> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Image> photos) {
        this.photos = photos;
    }

}

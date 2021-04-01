package com.example.recyclerviewjson;

public class DataList {

    public int id;
    public int albumId;
    public String title;
    public String url;
    public String thumbUrl;

    public DataList()
    {

    }

    public DataList(int id, int albumId, String title, String url, String thumbUrl)
    {
        this.id = id;
        this.albumId = albumId;
        this.title = title;
        this.url = url;
        this.thumbUrl = thumbUrl;
    }

    public int getId() {
        return id;
    }

    public int getAlbumId() {
        return albumId;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }
}

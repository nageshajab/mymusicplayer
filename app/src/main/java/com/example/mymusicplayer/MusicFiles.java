package com.example.mymusicplayer;

public class MusicFiles {
    private String path;
    private String title;
    private String artist;
    private  String album;
    private  String duration;
    private  String id;

    public MusicFiles(String Path,String Title,String Artist,String Album,String Duration,String Id){
        this.path=Path;
        this.title=Title;
        this.artist=Artist;
        this.album=Album;
        this.duration=Duration;
        this.id=Id;
    }

    public  MusicFiles(){
    }

    public  String getPath(){
        return path;
    }
    public  void setPath(String path){
        this.path=path;
    }
    public  String getTitle(){
        return title;
    }
    public  void setTitle(String title){
        this.title=title;
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

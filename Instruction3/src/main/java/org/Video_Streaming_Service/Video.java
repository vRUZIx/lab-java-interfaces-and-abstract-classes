package org.Video_Streaming_Service;

public abstract class Video {
    private String title;
    private int duration;
    public Video(String title,int duration){
        this.title=title;
        this.duration=duration;
    }
    public String getInfo(){
        String info= String.format("----------------------\n"+"\n Title : "+getTitle()+"\nDuration time is "+ getDuration());
        return info;
    }
    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
}

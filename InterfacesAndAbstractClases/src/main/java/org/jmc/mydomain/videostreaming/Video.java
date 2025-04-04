package org.jmc.mydomain.videostreaming;

public abstract class Video {
    private String title;
    private int duration;

    public Video() {
    }

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getInfo() {
        return "Video{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }


}

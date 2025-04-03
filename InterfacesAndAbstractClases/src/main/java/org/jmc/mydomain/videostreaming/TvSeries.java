package org.jmc.mydomain.videostreaming;

public class TvSeries extends Video {
    private int episodes;

    public TvSeries(int episodes) {
        setEpisodes(episodes);
    }

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        setEpisodes(episodes);
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}

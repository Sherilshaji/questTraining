package com.quest.playlistManager;

import java.sql.Time;
import java.util.Objects;

public class Track {
    private int trackID;
    private String trackTitle;
    private String trackArtist;
    private double trackDuration;
    public Track(int trackID, String trackTitle, String trackArtist, double trackDuration) {
        this.trackID = trackID;
        this.trackTitle = trackTitle;
        this.trackArtist = trackArtist;
        this.trackDuration = trackDuration;
    }

    public int getTrackID() {
        return trackID;
    }

    public void setTrackID(int trackID) {
        this.trackID = trackID;
    }

    public String getTrackTitle() {
        return trackTitle;
    }

    public void setTrackTitle(String trackTitle) {
        this.trackTitle = trackTitle;
    }

    public String getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }

    public double getTrackDuration() {
        return trackDuration;
    }

    public void setTrackDuration(double trackDuration) {
        this.trackDuration = trackDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return trackID == track.trackID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(trackID);
    }

    @Override
    public String toString() {
        return "Track: "+getTrackID()+"\nTitle: "+getTrackTitle()+"\nArtist: "+getTrackArtist()+"\nDuration: "+getTrackDuration();
    }
}

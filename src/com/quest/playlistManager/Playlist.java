package com.quest.playlistManager;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String playlistName;
    private List<Track> tracks;
    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.tracks = new ArrayList<>();
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }




}

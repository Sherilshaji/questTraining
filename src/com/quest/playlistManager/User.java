package com.quest.playlistManager;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String username;
    private Map<String,Playlist> playlists;
    public User(String username) {
        this.username = username;
        this.playlists = new HashMap<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<String, Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Map<String, Playlist> playlists) {
        this.playlists = playlists;
    }
    
}

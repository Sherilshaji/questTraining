package com.quest.playlistManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Implementation implements ImplementationInterface{

    private Map<String,Playlist> playlists;
    @Override
    public void addTrack(Playlist playlists,Track track) throws DuplicateTrackException {
        if(playlists.getTracks().contains(track)) {
            throw new DuplicateTrackException("Track already in the playlist: "+track.getTrackTitle());
        }
        playlists.getTracks().add(track);
    }

    @Override
    public void removeTrack(Playlist playlist,Track track) {
        playlist.getTracks().remove(track);
    }
    @Override
    public void searchTrack(Playlist playlist,String search) {
        String lower = search.toLowerCase();
        ArrayList<Track> tracks = new ArrayList<>();
        for(Track track : playlist.getTracks()) {
            if(track.getTrackTitle().toLowerCase().contains(lower)||
            track.getTrackArtist().toLowerCase().contains(lower)) {
                tracks.add(track);
            }
        }
        tracks.forEach((n)-> System.out.println(n.getTrackTitle()));

    }

    @Override
    public void displayTracks(Playlist playlists) {
        for(Track track : playlists.getTracks()) {
            System.out.println(track.getTrackTitle()+" - "+track.getTrackArtist());
        }
    }

    @Override
    public void sortTracks(Playlist playlists) {
        playlists.getTracks().sort(new DurationComparator());
    }

    @Override
    public void shuffleTracks(Playlist playlists) {
        Collections.shuffle(playlists.getTracks());
    }

    @Override
    public void createPlaylist(Playlist playlist,String playlistName) {
        playlists.put(playlistName,new Playlist(playlistName));
    }

    @Override
    public void deletePlaylist(Playlist playlist, String playlistName) {
        playlists.remove(playlistName);
    }

    @Override
    public Playlist getPlaylist(String playlistName) {
        return playlists.get(playlistName);
    }

    @Override
    public void displayAllPlaylists() {
        for(Playlist playlist : playlists.values()) {
            System.out.println(playlist.getTracks());
        }
    }

}

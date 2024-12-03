package com.quest.playlistManager;

import java.util.Map;

public interface ImplementationInterface {
    void addTrack(Playlist playlists,Track track) throws DuplicateTrackException;
    void removeTrack(Playlist playlist,Track track);
    void searchTrack(Playlist playlist,String search);
    void displayTracks(Playlist playlists);
    void sortTracks(Playlist playlists);
    void shuffleTracks(Playlist playlists);
    void createPlaylist(Playlist playlist,String playlistName);
    void deletePlaylist(Playlist playlist,String playlistName);
    Playlist getPlaylist(String playlistName);
    void displayAllPlaylists();
}

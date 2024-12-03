package com.quest.playlistManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DuplicateTrackException {
        Scanner sc = new Scanner(System.in);
        ImplementationInterface n=new Implementation();
        Playlist currentPlaylist = null;
        while(true) {
            System.out.println("1. Add Playlist");
            System.out.println("2. Delete Playlist");
            System.out.println("3. Show Playlist by name");
            System.out.println("4. Show All Playlist");
            System.out.println("5. Add Track");
            System.out.println("6. Show Track");
            System.out.println("7. Search Track");
            System.out.println("8. Remove Track");
            System.out.println("9. Sort Track");
            System.out.println("10. Shuffle Track");
            System.out.println("11. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter playlist name");
                    sc.nextLine();
                    String name = sc.next();
                    currentPlaylist = new Playlist(name);
                    n.createPlaylist(currentPlaylist, name);
                    System.out.println("Playlist created successfully!");
                    break;
                case 2:
                    if (currentPlaylist != null) {
                        System.out.println("Enter playlist name to delete: ");
                        sc.nextLine();
                        String deletePlaylistName = sc.nextLine();
                        n.deletePlaylist(currentPlaylist, deletePlaylistName);
                        System.out.println("Playlist deleted successfully!");
                    } else {
                        System.out.println("No playlist selected!");
                    }
                    break;
                case 3:
                    System.out.println("Enter playlist name to show: ");
                    String playlistName = sc.nextLine();
                    Playlist foundPlaylist=n.getPlaylist(playlistName);
                    if (foundPlaylist != null) {
                        System.out.println("Playlist found!");
                        n.displayTracks(currentPlaylist);
                    }else{
                        System.out.println("Playlist not found!");
                    }
                    break;
                case 4:
                    n.displayAllPlaylists();
                    break;
                case 5:
                    System.out.println("Track ID: ");
                    int trackID = sc.nextInt();
                    System.out.println("Track Title: ");
                    sc.nextLine();
                    String trackTitle = sc.nextLine();
                    System.out.println("Track Artist: ");
                    String trackArtist = sc.nextLine();
                    System.out.println("Track Duration: ");
                    double trackDuration=sc.nextDouble();
                    Track track=new Track(trackID,trackTitle,trackArtist,trackDuration);
                    n.addTrack(currentPlaylist,track);
                    break;
                case 6:
                    if(currentPlaylist != null) {
                        n.displayTracks(currentPlaylist);
                    }else {
                        System.out.println("No playlist selected!");
                    }
                    break;
                case 7:
                    if(currentPlaylist != null) {
                        System.out.println("Enter search term: ");
                        String searchTerm = sc.nextLine();
                        n.searchTrack(currentPlaylist, searchTerm);
                    }else {
                        System.out.println("No playlist selected!");
                    }
                    break;
                case 8:
                    System.out.println("Enter track ID to remove: ");
                    int removeTrackID = sc.nextInt();
//                    n.removeTrack(currentPlaylist,removeTrackID);
                    break;
                case 9:
                    if(currentPlaylist != null) {
                        n.sortTracks(currentPlaylist);
                        System.out.println("Tracks sorted successfully!");
                    }else{
                        System.out.println("No playlist selected!");
                    }
                    break;
                case 10:
                    if(currentPlaylist != null) {
                        n.shuffleTracks(currentPlaylist);
                        System.out.println("Tracks shuffled successfully!");
                    }else{
                        System.out.println("No playlist selected!");
                    }
                    break;
                case 11:
                    System.out.println("Exiting the program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

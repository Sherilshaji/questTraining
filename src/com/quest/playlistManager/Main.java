package com.quest.playlistManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                    String name = sc.next();
                    currentPlaylist = new Playlist(name);
                    n.createPlaylist(currentPlaylist, name);
                    System.out.println("Playlist created successfully!");
                    break;
                case 2:
                    if (currentPlaylist != null) {
                        System.out.println("Enter playlist name to delete: ");
                        String deletePlaylistName = sc.nextLine();
                        n.deletePlaylist(currentPlaylist, deletePlaylistName);
                        System.out.println("Playlist deleted successfully!");
                    } else {
                        System.out.println("No playlist selected!");
                    }
                    break;
            }
        }
    }
}

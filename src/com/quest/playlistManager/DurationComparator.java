package com.quest.playlistManager;

import java.util.Comparator;

public class DurationComparator implements Comparator<Track> {


    @Override
    public int compare(Track o1, Track o2) {
        return Double.compare(o1.getTrackDuration(), o2.getTrackDuration());
    }
}

package Part1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Season implements Iterable<Episode> {
    private List<Episode> episodes = new ArrayList<>();

    public void addEpisode(Episode e) {
        episodes.add(e);
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    // This enables the for-each loop
    @Override
    public Iterator<Episode> iterator() {
        return episodes.iterator();
    }

    // Custom iterators
    public EpisodeIterator customIterator() {
        return new SeasonIterator(this);
    }

    public EpisodeIterator reverseIterator() {
        return new ReverseSeasonIterator(this);
    }

    public EpisodeIterator shuffleIterator() {
        return new ShuffleSeasonIterator(this);
    }
}

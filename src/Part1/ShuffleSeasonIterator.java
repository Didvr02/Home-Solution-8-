package Part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class ShuffleSeasonIterator implements EpisodeIterator {
    private Season season;
    private List<Episode> shuffledEpisodes;
    private int currentIndex = 0;

    public ShuffleSeasonIterator(Season season) {
        this.season = season;
        shuffledEpisodes = new ArrayList<>(season.getEpisodes());
        Collections.shuffle(shuffledEpisodes, new Random(42));  // Fixed seed for repeatability
    }

    public boolean hasNext() {
        return currentIndex < shuffledEpisodes.size();
    }

    public Episode next() {
        return shuffledEpisodes.get(currentIndex++);
    }
}

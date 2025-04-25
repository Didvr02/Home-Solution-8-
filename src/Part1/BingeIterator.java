package Part1;

import java.util.List;

public class BingeIterator implements EpisodeIterator {
    private List<Season> seasons;
    private int currentSeasonIndex = 0;
    private EpisodeIterator currentIterator;

    public BingeIterator(List<Season> seasons) {
        this.seasons = seasons;
        if (!seasons.isEmpty()) {
            currentIterator = seasons.get(0).customIterator(); // ✅ use your own iterator
        }
    }

    @Override
    public boolean hasNext() {
        while (currentIterator != null && !currentIterator.hasNext()) {
            currentSeasonIndex++;
            if (currentSeasonIndex >= seasons.size()) return false;
            currentIterator = seasons.get(currentSeasonIndex).customIterator(); // ✅ again
        }
        return currentIterator != null && currentIterator.hasNext();
    }

    @Override
    public Episode next() {
        return currentIterator.next();
    }
}

package Part1;

class SeasonIterator implements EpisodeIterator {
    private Season season;
    private int currentIndex = 0;

    public SeasonIterator(Season season) {
        this.season = season;
    }

    public boolean hasNext() {
        return currentIndex < season.getEpisodes().size();
    }

    public Episode next() {
        return season.getEpisodes().get(currentIndex++);
    }
}
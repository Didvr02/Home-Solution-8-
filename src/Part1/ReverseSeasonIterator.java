package Part1;

class ReverseSeasonIterator implements EpisodeIterator {
    private Season season;
    private int currentIndex;

    public ReverseSeasonIterator(Season season) {
        this.season = season;
        this.currentIndex = season.getEpisodes().size() - 1;
    }

    public boolean hasNext() {
        return currentIndex >= 0;
    }

    public Episode next() {
        return season.getEpisodes().get(currentIndex--);
    }
}
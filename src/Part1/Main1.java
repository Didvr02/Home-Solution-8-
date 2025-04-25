package Part1;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        Episode e1 = new Episode("Episode 1", 25);
        Episode e2 = new Episode("Episode 2", 30);
        Episode e3 = new Episode("Episode 3", 28);

        Season season = new Season();
        season.addEpisode(e1);
        season.addEpisode(e2);
        season.addEpisode(e3);

        System.out.println("Normal Order:");
        for (Episode e : season) {
            System.out.println(e.getTitle());
        }

        System.out.println("\nReverse Order:");
        EpisodeIterator reverseIterator = season.reverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next().getTitle());
        }

        System.out.println("\nShuffle Order:");
        EpisodeIterator shuffleIterator = season.shuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next().getTitle());
        }

        List<Season> seasons = new ArrayList<>();
        seasons.add(season);
        BingeIterator bingeIterator = new BingeIterator(seasons);
        System.out.println("\nBinge Watch:");
        while (bingeIterator.hasNext()) {
            System.out.println(bingeIterator.next().getTitle());
        }
    }
}
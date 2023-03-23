package org.example.rssprinter;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;

import java.util.List;

public class RssPrinter {
    public void printRss(SyndFeed feed) {
        System.out.println("feed.Title = " + feed.getTitle());
        System.out.println("feed.Author = " + feed.getAuthor());
        System.out.println("feed.Description = " + feed.getDescription());
        System.out.println("feed.Link = " + feed.getLink());
        List<SyndEntry> entries = feed.getEntries();
        for (SyndEntry entry : entries) {
            System.out.println("----");
            System.out.println("  title = " + entry.getTitle());
            System.out.println("  author = " + entry.getAuthor());
            System.out.println("  description = " + entry.getDescription().getValue());
            System.out.println("  link = " + entry.getLink());
            System.out.println();
        }
    }
}

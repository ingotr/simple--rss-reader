package org.example.rssreader;

import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import java.net.URL;

public class RssReader {
    public SyndFeed readRSSFeed(URL url) {
        SyndFeed feed = null;
        try {
            SyndFeedInput input = new SyndFeedInput();
            feed = input.build(new XmlReader(url));
        } catch (Exception ex) {
            ex.getMessage();
        }
        return feed;
    }
}

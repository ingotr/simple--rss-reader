package org.example;

import com.rometools.rome.feed.synd.SyndFeed;
import org.example.rssprinter.RssPrinter;
import org.example.rssreader.RssReader;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        RssReader rssReader = new RssReader();
        SyndFeed feedResult = rssReader.readRSSFeed(new URL("https://inside.java/feed.xml"));
        RssPrinter rssPrinter = new RssPrinter();
        rssPrinter.printRss(feedResult);
    }
}
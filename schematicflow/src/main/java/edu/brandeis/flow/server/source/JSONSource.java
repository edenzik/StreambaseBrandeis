package edu.brandeis.flow.server.source;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import edu.brandeis.flow.server.source.twitter.TwitterStreamSource;

public class JSONSource {
	public static void main(String[] args) throws Exception{
//		BufferedReader br = new BufferedReader(new FileReader("twitter_source.json"));
//		Streamer streamer = new Streamer(5050);
//		String json;
//		while ((json = br.readLine()) != null){
//			streamer.send(json);
//		}
		
		
		while(true) {
			TwitterStreamSource twitter = new TwitterStreamSource();
//			Thread.sleep(1000);
		}
	}
}
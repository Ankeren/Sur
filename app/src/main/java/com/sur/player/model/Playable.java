package com.sur.player.model;

/**
 * WEEK 1 TOPIC: interface.
 *
 * Anything the music service is able to play implements this. A local Song,
 * a live RadioStation and a podcast Episode are completely different things,
 * but the service does not care: it only needs a URI and two lines of text.
 *
 * Because of this interface, MusicService never has to ask "what kind of
 * thing is this?" - no instanceof, no if-else chain.
 */
public interface Playable {

    /** Where the audio actually comes from: a file on the phone, or a URL. */
    String getPlayUri();

    /** Big line of text (song name, station name, episode name). */
    String getTitle();

    /** Small line of text (artist, country, feed name). */
    String getSubtitle();
}

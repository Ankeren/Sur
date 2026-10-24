package com.sur.player;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.sur.player.databinding.ActivityMainBinding;
import com.sur.player.model.Song;
import com.sur.player.util.TimeUtil;

/**
 * The single screen in the app so far.
 *
 * At this stage it only proves three things work end to end:
 *   - the project builds and installs on a real phone
 *   - view binding is switched on (no findViewById anywhere)
 *   - the model classes compile and behave
 *
 * The library list, the playlists, the player screen and the playback
 * service are not written yet.
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(views.getRoot());

        // A hand-made Song, so the inheritance and the interface are visible
        // on screen before any real music is loaded off the phone.
        Song sample = new Song();
        sample.setId(1);
        sample.setTitle("Nothing loaded yet");
        sample.setArtist("Sur");
        sample.setDurationMs(187000);

        views.title.setText(sample.getTitle());
        views.subtitle.setText(
                sample.getSubtitle() + "  ·  " + TimeUtil.format(sample.getDurationMs()));
    }
}

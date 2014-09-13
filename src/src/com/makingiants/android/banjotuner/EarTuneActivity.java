package com.makingiants.android.banjotuner;

import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EarTuneActivity extends Activity {

	private SoundPlayer player;
	private String[] tunings = { "sounds/1 - d.mp3", "sounds/2 - b.mp3",
			"sounds/3 - g.mp3", "sounds/4 - d.mp3" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ear_tune);

		player = new SoundPlayer(this);

		// Setup listeners
		((Button) findViewById(R.id.ear_button_1))
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {

						try {
							player.play(tunings[0]);
						} catch (IOException e) {
							e.printStackTrace();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					}
				});

		((Button) findViewById(R.id.ear_button_2))
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {

						try {
							player.play(tunings[1]);
						} catch (IOException e) {
							e.printStackTrace();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					}
				});

		((Button) findViewById(R.id.ear_button_3))
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {

						try {
							player.play(tunings[2]);
						} catch (IOException e) {
							e.printStackTrace();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					}
				});

		((Button) findViewById(R.id.ear_button_4))
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {

						try {
							player.play(tunings[3]);
						} catch (IOException e) {
							e.printStackTrace();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					}
				});
	}

}
package es.rosich.vox;

import android.app.IntentService;
import android.content.Intent;
import android.media.AudioManager;
import android.view.KeyEvent;

public class Srv extends IntentService {

    public Srv(MainActivity mainActivity, Class<Srv> srvClass) {
        super("Srv");
    }

    public Srv() {
        super("Srv");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        /*
        Intent buttonDown = new Intent(Intent.ACTION_MEDIA_BUTTON);
        buttonDown.putExtra(Intent.EXTRA_KEY_EVENT, new KeyEvent(KeyEvent.ACTION_DOWN,
                KeyEvent.KEYCODE_CALL));
        sendOrderedBroadcast(buttonDown, "android.permission.CALL_PRIVILEGED");
        Intent buttonUp = new Intent(Intent.ACTION_MEDIA_BUTTON);
        buttonUp.putExtra(Intent.EXTRA_KEY_EVENT, new KeyEvent(KeyEvent.ACTION_UP,
                KeyEvent.KEYCODE_CALL));
        sendOrderedBroadcast(buttonUp, "android.permission.CALL_PRIVILEGED");
        */

        AudioManager audioManager = (AudioManager)getSystemService(AUDIO_SERVICE);
        audioManager.setMode(AudioManager.MODE_IN_CALL);
        audioManager.setSpeakerphoneOn(true);
    }

}

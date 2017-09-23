package com.chandigarhadmin.ui;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Html;

import com.chandigarhadmin.R;
import com.chandigarhadmin.session.SessionManager;
import com.daimajia.androidanimations.library.Techniques;

import wail.splacher.com.splasher.lib.SplasherActivity;
import wail.splacher.com.splasher.models.SplasherConfig;
import wail.splacher.com.splasher.utils.Const;

public class MainActivity extends SplasherActivity {
    private SessionManager sessionManager;

    @Override
    public void initSplasher(SplasherConfig config) {
        config.setReveal_start(Const.START_TOP_LEFT)
                //---------------
                .setAnimationDuration(3000)
                //---------------
                .setLogo(R.drawable.chdlogo)
                .setLogo_animation(Techniques.BounceIn)
                .setAnimationLogoDuration(2000)
                .setLogoWidth(500)
                //---------------
                .setTitle(Html.fromHtml("Chandigarh Smart App").toString())
                .setTitleColor(Color.parseColor("#ffffff"))
                .setTitleAnimation(Techniques.Bounce)
                .setTitleSize(20)
                //---------------
                .setSubtitle("The City Beautiful")
                .setSubtitleColor(Color.parseColor("#ffffff"))
                .setSubtitleAnimation(Techniques.FadeIn)
                .setSubtitleSize(16)
                //---------------
                .setSubtitleTypeFace(Typeface.createFromAsset(getAssets(), "diana.otf"))
                .setTitleTypeFace(Typeface.createFromAsset(getAssets(), "stc.otf"));

        //Example of custom view ..
       /* config.setCustomView(R.layout.custom_view)
                .setReveal_start(Const.START_CENTER)
                .setAnimationDuration(5000);
        getCustomView().findViewById(R.id.textView)*/

    }

    @Override
    public void onSplasherFinished() {
        sessionManager = new SessionManager(this);
        Intent it;
        if (!sessionManager.isLoggedIn()) {
            it = new Intent(MainActivity.this, LoginActivity.class);
        } else {
            it = new Intent(MainActivity.this, AdminAgentActivity.class);
        }
        startActivity(it);
        finish();
    }
}

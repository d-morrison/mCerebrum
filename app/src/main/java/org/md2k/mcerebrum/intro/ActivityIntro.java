package org.md2k.mcerebrum.intro;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import org.md2k.mcerebrum.R;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import agency.tango.materialintroscreen.MessageButtonBehaviour;
import agency.tango.materialintroscreen.SlideFragmentBuilder;
import agency.tango.materialintroscreen.animations.IViewTranslation;

public class ActivityIntro extends MaterialIntroActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableLastSlideAlphaExitTransition(true);

        getBackButtonTranslationWrapper()
                .setEnterTranslation(new IViewTranslation() {
                    @Override
                    public void translate(View view, @FloatRange(from = 0, to = 1.0) float percentage) {
                        view.setAlpha(percentage);
                    }
                });

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colorBackground)
                .buttonsColor(R.color.colorPrimaryDark)
                .image(R.drawable.img_office)
                .title("Welcome to mCerebrum")
                .description("sense- Analyze- Act")
                .build());

        /*
                ,
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showMessage("We provide solutions to make you love your work");
                    }
                }, "Work with love"));
*/
        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colorBackground)
                .buttonsColor(R.color.colorPrimaryDark)
                .image(R.drawable.img_equipment)
                .title("Sense")
                .description("")
                .build());

        // addSlide(new CustomSlide());

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colorBackground)
                .buttonsColor(R.color.colorPrimaryDark)
                .image(R.drawable.img_equipment)
                .title("Analyze")
                .description("")
                .build());
        /*,
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showMessage("Try us!");
                    }
                }, "Tools"));
*/
        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colorBackground)
                .buttonsColor(R.color.colorPrimaryDark)
                .image(R.drawable.img_office)
                .title("Act")
                .description("")
                .build());
    }

    @Override
    public void onFinish() {
        super.onFinish();
        //  Toast.makeText(this, "Try this library in your project! :)", Toast.LENGTH_SHORT).show();
    }
}
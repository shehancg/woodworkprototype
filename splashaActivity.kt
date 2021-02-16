package com.example.woodworks

import android.animation.ObjectAnimator
import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.ProgressBar
import java.lang.Integer.max
import java.lang.Math.max
import java.lang.StrictMath.max

class splashaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        // This is the loading time of the splash screen
        val SPLASH_TIME_OUT:Long = 3000 // 1 sec
        //hide status bar
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splasha)

        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this,MainActivity::class.java))

            // close this activity
            finish()
        }, SPLASH_TIME_OUT)

       /* ProgressBar.max=10
        val currentProgres=6
        val progressBar
        ObjectAnimator.ofInt(progressBar,propertyName:"progress",currentprogress)
            .setDuration(2000)
                .start() */


       /* val typeface:Typeface:=Typeface.createFromAsset(assets, path:"Gilroy-ExtraBold.otf")
        val tv_app_name
        tv_app_name.typeface=typeface */
    }
}
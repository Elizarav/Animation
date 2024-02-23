package com.example.animation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var imageViewIV: ImageView
    private lateinit var blinkBTN: Button
    private lateinit var rotateBTN: Button
    private lateinit var fadeBTN: Button
    private lateinit var moveBTN: Button
    private lateinit var slideBTN: Button
    private lateinit var zoomBTN: Button
    private lateinit var stopBTN: Button
    private lateinit var combinationBTN: Button

    private lateinit var layoutAnimLL: LinearLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageViewIV = findViewById(R.id.imageviewIV)
        blinkBTN = findViewById(R.id.blinkBTN)
        rotateBTN = findViewById(R.id.rotateBTN)
        fadeBTN = findViewById(R.id.fadeBTN)
        moveBTN = findViewById(R.id.moveBTN)
        slideBTN = findViewById(R.id.slideBTN)
        zoomBTN = findViewById(R.id.zoomBTN)
        stopBTN = findViewById(R.id.stopBTN)
        combinationBTN = findViewById(R.id.combinationBTN)

        layoutAnimLL = findViewById(R.id.layoutAnimLL)
            // Моргание
        blinkBTN.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.blink)
            imageViewIV.startAnimation(animation)
        }
            //Вращение
        rotateBTN.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.rotate)
            imageViewIV.startAnimation(animation)
        }
            //Выцветание
        fadeBTN.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.fade)
            imageViewIV.startAnimation(animation)
        }
            //Движение
        moveBTN.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.move)
            imageViewIV.startAnimation(animation)
        }
            //Сллайд
        slideBTN.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide)
            imageViewIV.startAnimation(animation)
        }
            //Увеличение
        zoomBTN.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
            imageViewIV.startAnimation(animation)
        }

        combinationBTN.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.combination)
            layoutAnimLL.startAnimation(animation)
        }
            //Очистка анимации
        stopBTN.setOnClickListener {
            imageViewIV.clearAnimation()
        }
    }
}

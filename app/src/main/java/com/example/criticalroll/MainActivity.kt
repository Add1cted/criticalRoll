package com.example.criticalroll

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import android.media.MediaPlayer
import android.provider.MediaStore

import java.util.Random

class MainActivity : AppCompatActivity() {
    private var imageViewDice: ImageView? = null
    private val rng = Random()
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        imageViewDice = findViewById(R.id.image_view_dice)
        imageViewDice!!.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        mediaPlayer = MediaPlayer.create(this, R.raw.rolling)
        mediaPlayer?.start()
        val randomNumber = rng.nextInt(20) + 1

        when (randomNumber) {
            1 -> {
                imageViewDice!!.setImageResource(R.drawable.one)
                critical.setText("CRITICAL MISS!")
                mediaPlayer = MediaPlayer.create(this, R.raw.bad);
                mediaPlayer?.start();
            }
            2 -> {
                imageViewDice!!.setImageResource(R.drawable.two)
                critical.setText("")
            }
            3 -> {
                imageViewDice!!.setImageResource(R.drawable.three)
                critical.setText("")
            }
            4 -> {
                imageViewDice!!.setImageResource(R.drawable.four)
                critical.setText("")
            }
            5 -> {
                imageViewDice!!.setImageResource(R.drawable.five)
                critical.setText("")
            }
            6 -> {
                imageViewDice!!.setImageResource(R.drawable.six)
                critical.setText("")
            }
            7 -> {
                imageViewDice!!.setImageResource(R.drawable.seven)
                critical.setText("")
            }
            8 -> {
                imageViewDice!!.setImageResource(R.drawable.eight)
                critical.setText("")
            }
            9 -> {
                imageViewDice!!.setImageResource(R.drawable.nine)
                critical.setText("")
            }
            10 -> {
                imageViewDice!!.setImageResource(R.drawable.ten)
                critical.setText("")
            }
            11 -> {
                imageViewDice!!.setImageResource(R.drawable.eleven)
                critical.setText("")
            }
            12 -> {
                imageViewDice!!.setImageResource(R.drawable.twelve)
                critical.setText("")
            }
            13 -> {
                imageViewDice!!.setImageResource(R.drawable.thirteen)
                critical.setText("")
            }
            14 -> {
                imageViewDice!!.setImageResource(R.drawable.fourteen)
                critical.setText("")
            }
            15 -> {
                imageViewDice!!.setImageResource(R.drawable.fifteen)
                critical.setText("")
            }
            16 -> {
                imageViewDice!!.setImageResource(R.drawable.sixteen)
                critical.setText("")
            }
            17 -> {
                imageViewDice!!.setImageResource(R.drawable.seventeen)
                critical.setText("")
            }
            18 -> {
                imageViewDice!!.setImageResource(R.drawable.eighteen)
                critical.setText("")
            }
            19 -> {
                imageViewDice!!.setImageResource(R.drawable.nineteen)
                critical.setText("")
            }
            20 -> {
                imageViewDice!!.setImageResource(R.drawable.twenty)
                critical.setText("CRITICAL HIT!")
                mediaPlayer = MediaPlayer.create(this, R.raw.clash);
                mediaPlayer?.start();
            }
        }
    }
}

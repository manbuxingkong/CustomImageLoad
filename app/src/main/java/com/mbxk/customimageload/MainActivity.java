package com.mbxk.customimageload;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;

import com.hjq.image.ImageLoader;

public class MainActivity extends AppCompatActivity {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.image);
        ImageLoader.with(this)
                .load("https://www.baidu.com/img/bd_logo.png")
                .centerCrop()
                .override(ImageLoader.SIZE_ORIGINAL,ImageLoader.SIZE_ORIGINAL)
                .into(image);
    }
}

package com.example.ui_imageview;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView mImageView1,mImageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mImageView1=(ImageView) this.findViewById(R.id.imageView1);
        this.mImageView2=(ImageView) this.findViewById(R.id.imageView2);
        this.mImageView1.setOnTouchListener(new OnTouchListener(){
        	public boolean onTouch(View view, MotionEvent event)
            {
                // 计算转换比例，500是原图像的宽度
                float scale = 72f / mImageView1.getWidth();
         
                // 触摸点对应的原图像的坐标
                int x = (int) (event.getX() * scale);
                int y = (int) (event.getY() * scale);
         
                BitmapDrawable bitmapDrawable = (BitmapDrawable) mImageView1
                        .getDrawable();
                // 从原图像上截取指定区域的图像，并将生成的Bitmap对象显示在第二个ImageView中
                mImageView2.setImageBitmap(Bitmap.createBitmap(bitmapDrawable
                        .getBitmap(), x, y, 72 - x, 72 - y));
         
                return false;
            }
        });
        
        
    }

    

  
    
}

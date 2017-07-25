package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice01DrawTextView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello HenCoder";
    Path mPath = new Path();

    public Practice01DrawTextView(Context context) {
        super(context);
    }

    public Practice01DrawTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice01DrawTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);
        mPath.moveTo(500, 500);
//        mPath.addCircle(500, 500, 200, Path.Direction.CCW);
        mPath.lineTo(500,700);
        mPath.lineTo(900,100);
        mPath.close();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 使用 drawText() 来绘制文字
        // 文字坐标： (50, 100)
        canvas.drawText("hello !!@##%  你好绘制文字", 50, 100, paint);
        paint.setColor(Color.RED);
        canvas.drawLine(50, 0, 50, 500, paint);
        canvas.drawLine(0, 100, 500, 100, paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(mPath,paint);
        canvas.drawTextOnPath("hello !!@##%  你好绘制文字", mPath, 0, 20, paint);
    }
}

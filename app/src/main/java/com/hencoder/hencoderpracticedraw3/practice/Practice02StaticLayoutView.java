package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

public class Practice02StaticLayoutView extends View {
    TextPaint textPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello\nHenCoder";
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice02StaticLayoutView(Context context) {
        super(context);
    }

    public Practice02StaticLayoutView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02StaticLayoutView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        textPaint.setTextSize(60);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 使用 StaticLayout 代替 Canvas.drawText() 来绘制文字，
        // 以绘制出带有换行的文字
        canvas.save();
        canvas.translate(200, 200);
        StaticLayout staticLayout = new StaticLayout("hello world!@#$$^&&*(你好大方的",
                textPaint, 200, Layout.Alignment.ALIGN_NORMAL, 1, 0, false);
        staticLayout.draw(canvas);
        canvas.drawLine(-200, 0, 200, 0, mPaint);
        canvas.drawLine(0, -200, 0, 200, mPaint);
        canvas.restore();

//        canvas.drawText(text, 50, 100, textPaint);
    }
}

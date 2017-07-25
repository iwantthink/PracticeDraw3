package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice13GetTextBoundsView extends View {
    Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text1 = "A";
    String text2 = "a";
    String text3 = "J";
    String text4 = "j";
    String text5 = "Â";
    String text6 = "â";
    int top = 200;
    int bottom = 400;

    public Practice13GetTextBoundsView(Context context) {
        super(context);
    }

    public Practice13GetTextBoundsView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice13GetTextBoundsView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeWidth(20);
        paint1.setColor(Color.parseColor("#E91E63"));
        paint2.setTextSize(160);
//        setLayerType(LAYER_TYPE_SOFTWARE, null);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(50, top, getWidth() - 50, bottom, paint1);

        // 使用 Paint.getTextBounds() 计算出文字的显示区域
        // 然后计算出文字的绘制位置，从而让文字上下居中
        // 这种居中算法的优点是，可以让文字精准地居中，分毫不差
        Rect rect1 = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        Rect rect5 = new Rect();
        Rect rect6 = new Rect();
        paint2.getTextBounds(text1, 0, text1.length(), rect1);
        paint2.getTextBounds(text2, 0, text2.length(), rect2);
        paint2.getTextBounds(text3, 0, text3.length(), rect3);
        paint2.getTextBounds(text4, 0, text4.length(), rect4);
        paint2.getTextBounds(text5, 0, text5.length(), rect5);
        paint2.getTextBounds(text6, 0, text6.length(), rect6);
        Paint p1 = new Paint(Paint.ANTI_ALIAS_FLAG);
        p1.setStyle(Paint.Style.STROKE);
        int middle = (top + bottom) / 2;
        //画基线
        canvas.drawLine(0, middle, getWidth(), middle, p1);

        float x1 = (Math.abs(rect1.bottom) - Math.abs(rect1.top)) / 2;
        float x2 = (Math.abs(rect2.bottom) - Math.abs(rect2.top)) / 2;
        float x3 = (Math.abs(rect3.bottom) - Math.abs(rect3.top)) / 2;
        float x4 = (Math.abs(rect4.bottom) - Math.abs(rect4.top)) / 2;
        float x5 = (Math.abs(rect5.bottom) - Math.abs(rect5.top)) / 2;
        float x6 = (Math.abs(rect6.bottom) - Math.abs(rect6.top)) / 2;

        canvas.drawRect(rect1.left + 100, rect1.top + middle,
                rect1.right + 100, rect1.bottom + middle, p1);
        canvas.drawLine(rect1.left + 100, (rect1.bottom + rect1.top) / 2 + middle
                , rect1.right + 100, (rect1.bottom + rect1.top) / 2 + middle, p1);
        canvas.drawText(text1, 100, middle - x1, paint2);



        canvas.drawRect(rect2.left + 200, rect2.top + middle,
                rect2.right + 200, rect2.bottom + middle, p1);
        canvas.drawLine(rect2.left + 200, (rect2.bottom + rect2.top) / 2 + middle
                , rect2.right + 200, (rect2.bottom + rect2.top) / 2 + middle, p1);
        canvas.drawText(text2, 200, middle - x2, paint2);


        canvas.drawRect(rect3.left + 300, rect3.top + middle,
                rect3.right + 300, rect3.bottom + middle, p1);
        canvas.drawLine(rect3.left + 300, (rect3.bottom + rect3.top) / 2 + middle
                , rect3.right + 300, (rect3.bottom + rect3.top) / 2 + middle, p1);
        canvas.drawText(text3, 300, middle - x3, paint2);

        canvas.drawRect(rect4.left + 400, rect4.top + middle,
                rect4.right + 400, rect4.bottom + middle, p1);
        canvas.drawLine(rect4.left + 400, (rect4.bottom + rect4.top) / 2 + middle
                , rect4.right + 400, (rect4.bottom + rect4.top) / 2 + middle, p1);
        canvas.drawText(text4, 400, middle - x4, paint2);


        canvas.drawRect(rect5.left + 500, rect5.top + middle,
                rect5.right + 500, rect5.bottom + middle, p1);
        canvas.drawLine(rect5.left + 500, (rect5.bottom + rect5.top) / 2 + middle
                , rect5.right + 500, (rect5.bottom + rect5.top) / 2 + middle, p1);
        canvas.drawText(text5, 500, middle - x5, paint2);


        canvas.drawRect(rect6.left + 600, rect6.top + middle,
                rect6.right + 600, rect6.bottom + middle, p1);
        canvas.drawLine(rect6.left + 600, (rect6.bottom + rect6.top) / 2 + middle
                , rect6.right + 600, (rect6.bottom + rect6.top) / 2 + middle, p1);
        canvas.drawText(text6, 600, middle - x6, paint2);


    }
}
package com.example.bmi;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class BmiChartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new BmiChartView(this));
    }

    private class BmiChartView extends View {
        private Paint paint;
        private List<Float> bmiValues;

        public BmiChartView(BmiChartActivity context) {
            super(context);
            paint = new Paint();
            bmiValues = new ArrayList<>();

            bmiValues.add(22.5f);
            bmiValues.add(23.0f);
            bmiValues.add(22.8f);
            bmiValues.add(23.5f);
            bmiValues.add(24.0f);
            bmiValues.add(23.7f);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            float width = getWidth();
            float height = getHeight();
            float margin = 50f;

            paint.setColor(Color.BLACK);
            paint.setStrokeWidth(5);

            canvas.drawLine(margin, height - margin, width - margin, height - margin, paint); // Oś X
            canvas.drawLine(margin, height - margin, margin, margin, paint); // Oś Y

            float previousX = margin;
            float previousY = height - margin - bmiValues.get(0) * 10;

            for (int i = 1; i < bmiValues.size(); i++) {
                float x = margin + (i * (width - 2 * margin) / (bmiValues.size() - 1));
                float y = height - margin - bmiValues.get(i) * 10;

                canvas.drawCircle(x, y, 8, paint);
                canvas.drawLine(previousX, previousY, x, y, paint);

                previousX = x;
                previousY = y;
            }
        }
    }
}

package com.example.sqrtcalc;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final double sqrtConst = Math.sqrt(654321.0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etInput = findViewById(R.id.et_input);
        Button btnCalc = findViewById(R.id.btn_calc);
        TextView tvResult = findViewById(R.id.tv_result);

        btnCalc.setOnClickListener(v -> {
            String inputText = etInput.getText().toString().trim();
            if(inputText.isEmpty()){
                tvResult.setText("请输入数字");
                return;
            }
            try{
                double num = Double.parseDouble(inputText);
                double res = num * sqrtConst;
                tvResult.setText("结果："+res);
            }catch (Exception e){
                tvResult.setText("输入有误");
            }
        });
    }
}
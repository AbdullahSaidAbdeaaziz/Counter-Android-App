package bezo.org.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView contain = findViewById(R.id.textView);
        Button toast = findViewById(R.id.button2);
        Button count = findViewById(R.id.button3);
        Button random = findViewById(R.id.button);
        Button reset = findViewById(R.id.button4);

        toast.setOnClickListener(v -> {
            Toast toast1 = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_LONG);
            toast1.show();
        });

        count.setOnClickListener(v -> {
            BigInteger counter = new BigInteger(contain.getText().toString());

            BigInteger res = counter.add(BigInteger.ONE);
            contain.setText(res + "");
        });

        reset.setOnClickListener(v -> {
            contain.setText("0");
        });

        random.setOnClickListener(v -> {
            Random random1 = new Random();
            int rand = random1.nextInt(1000000) + 1;

            contain.setText(rand + "");
        });


    }

}
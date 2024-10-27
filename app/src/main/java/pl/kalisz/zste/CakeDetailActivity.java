package pl.kalisz.zste;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import pl.kalisz.zste.model.Cake;
import pl.kalisz.zste.model.CakeDataSource;
import pl.kalisz.zste.model.Sweet;
import pl.kalisz.zste.model.SweetDataSource;

public class CakeDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cake_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        int position = intent.getIntExtra(SweetActivity.INDEX, -1);
        if(position!=-1){
            Cake cake = CakeDataSource.getCakes().get(position);
            TextView nameView = (TextView) findViewById(R.id.name);
            nameView.setText(cake.name);
            TextView descView = (TextView) findViewById(R.id.desc);
            descView.setText(cake.desc);
            ImageView pictureView = (ImageView) findViewById(R.id.picture);
            pictureView.setImageResource(cake.picture);
        }
    }
}
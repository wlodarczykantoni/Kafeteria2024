package pl.kalisz.zste;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import pl.kalisz.zste.model.Coffee;
import pl.kalisz.zste.model.CoffeeDataSource;
import pl.kalisz.zste.model.Sweet;
import pl.kalisz.zste.model.SweetDataSource;

public class SweetActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {



    public static final String INDEX = "id";


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Intent intent = new Intent(this, SweetDetailActivity.class);
        intent.putExtra(INDEX, position);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sweet);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ArrayAdapter<Sweet> sweetArrayAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SweetDataSource.getSweets());
        ListView view = (ListView) findViewById(R.id.sweets);
        view.setAdapter(sweetArrayAdapter);
        view.setOnItemClickListener(this);

    }




}
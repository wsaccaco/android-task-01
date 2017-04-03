package pe.edu.upc.devservice;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class IconActivity extends AppCompatActivity {

    TextView nameTextView;
    TextView experienciaAniosTextView;
    TextView experienciaProyectosTextView;
    TextView descriptionTextView;
    ImageView pictureImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        experienciaAniosTextView = (TextView) findViewById(R.id.experienciaAniosTextView);
        experienciaProyectosTextView = (TextView) findViewById(R.id.experienciaProyectosTextView);
        descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);
        pictureImageView = (ImageView) findViewById(R.id.pictureImageView);
        ItemService service = new ItemService(this);

        Item item =
                service.getItems().get(getIntent().getExtras().getInt("currentPosition"));
        nameTextView.setText(item.getName());
        experienciaAniosTextView.setText(item.getYear());
        experienciaProyectosTextView.setText(item.getProyects());
        descriptionTextView.setText(item.getDescription());
        pictureImageView.setImageResource(item.getPictureId());
    }

}

package comsci.teenoyzz.connectmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CallMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_map);
    }//method oncreate
    public void runcallMap(View view){
        //intiol view
        EditText latitude = (EditText) findViewById(R.id.mapLat);
        EditText longtitude = (EditText) findViewById(R.id.mapLong);
        EditText label = (EditText) findViewById(R.id.mapLabel);

        String lat = latitude.getText().toString().trim();
        String lng = longtitude.getText().toString().trim();
        String mlabel = label.getText().toString().trim();

        Uri location = Uri.parse("http://maps.google.com/maps?q=loc:13.759483, 100.541522(ศูนย์รางน้ำ)");

        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        //mapIntent.setPackage("com.google.android.apps.maps");// บนมือถือแอนดรอย
        startActivity(mapIntent);
    }
}//main class

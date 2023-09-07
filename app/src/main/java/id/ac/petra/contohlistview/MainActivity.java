package id.ac.petra.contohlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<DataModel> dataModels;
    ListView listView;
    ArrayList<String> listitem;
    private static CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        dataModels = new ArrayList<>();
        listitem = new ArrayList<>();

        listitem.add("Apple Pie");
        listitem.add("Banana Bread");
        listitem.add("CupCake");
        listitem.add("Donut");
        listitem.add("Eclair");
        listitem.add("Froyo");
        listitem.add("Gingerbread");
        listitem.add("Honeycomb");

        dataModels.add(new DataModel("Apple Pie","Android 1.0","1","2008"));
        dataModels.add(new DataModel("Banana Bread","Android 1.0","1","2008"));
        dataModels.add(new DataModel("CupCake","Android 1.0","1","2008"));
        dataModels.add(new DataModel("Donut","Android 1.0","1","2008"));
        dataModels.add(new DataModel("Eclair","Android 1.0","1","2008"));
        dataModels.add(new DataModel("Apple Pie","Android 1.0","1","2008"));
        dataModels.add(new DataModel("Apple Pie","Android 1.0","1","2008"));
        dataModels.add(new DataModel("Apple Pie","Android 1.0","1","2008"));

        myAdapter = new CustomAdapter(dataModels,getApplicationContext());
        listView.setAdapter(myAdapter);

//        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1,listitem);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                String v = adapter.getItem(position);
//                Toast.makeText(getApplicationContext(),v,Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
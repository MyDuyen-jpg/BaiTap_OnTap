package dp.thudiep.ontapgk2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    RecyclerView rcvBag;
    ArrayList<Chair> arrayListBag;
    TextView tvSub,tvTotal;
    private bagCustomAdapter bagCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        rcvBag = findViewById(R.id.rcvBag);
        tvSub = findViewById(R.id.giaSubtotal);
        tvTotal = findViewById(R.id.giaTotal);
        tvSub.setText(MainActivity2.tong+"");
        tvTotal.setText(MainActivity2.tong+"");

        rcvBag.setHasFixedSize(true);
        rcvBag.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        bagCustomAdapter = new bagCustomAdapter(MainActivity2.arrayListDt);
        rcvBag.setAdapter(bagCustomAdapter);
    }
}
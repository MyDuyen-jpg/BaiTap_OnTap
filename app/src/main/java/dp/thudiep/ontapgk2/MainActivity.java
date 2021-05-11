package dp.thudiep.ontapgk2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    RecyclerView rcvChair;
    ArrayList<Chair> arrayList;
    private ItemCustomAdapter itemCustomAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvChair= findViewById(R.id.rcvChair);
        arrayList = new ArrayList<>();
        rcvChair.setHasFixedSize(true);
        rcvChair.setLayoutManager(new GridLayoutManager(this,2));
        itemCustomAdapter = new ItemCustomAdapter(arrayList,this);
        rcvChair.setAdapter(itemCustomAdapter);

        arrayList.add(new Chair(R.drawable.img1,R.drawable.cong,"Matteo Armchair",550,1));
        arrayList.add(new Chair(R.drawable.im2,R.drawable.cong,"Morden Armchair",650,1));
        arrayList.add(new Chair(R.drawable.img3,R.drawable.cong,"Nice Armchair",750,1));
        arrayList.add(new Chair(R.drawable.img4,R.drawable.cong,"Circle Armchair",850,1));
        arrayList.add(new Chair(R.drawable.img1,R.drawable.cong,"Matteo Armchair",550,1));
        arrayList.add(new Chair(R.drawable.im2,R.drawable.cong,"Morden Armchair",650,1));
        arrayList.add(new Chair(R.drawable.img3,R.drawable.cong,"Nice Armchair",750,1));
        arrayList.add(new Chair(R.drawable.img4,R.drawable.cong,"Circle Armchair",850,1));

    }

    @Override
    public void onClickItem(Chair chair) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("chairdata",chair);
        startActivity(intent);
    }
}
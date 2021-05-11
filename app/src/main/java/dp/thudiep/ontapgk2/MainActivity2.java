package dp.thudiep.ontapgk2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    Chair chair;
    ImageView imgViewDt;
    TextView tenDt,giaDt,tvGioiThieu,tvGioiThieu2,soLuongDt;
    ImageButton btnTruDt,btnCongDt;
    Button btnADDDt;

    static ArrayList<Chair> arrayListDt;
    static int tong;
    static {
        arrayListDt = new ArrayList<>();
        tong=0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

         imgViewDt = findViewById(R.id.imgDt);
         tenDt= findViewById(R.id.tenDt);
         giaDt= findViewById(R.id.giaDt);
         tvGioiThieu= findViewById(R.id.tvGioiThieu);
         tvGioiThieu2= findViewById(R.id.tvGioiThieu2);
         soLuongDt= findViewById(R.id.soLuongDt);
         btnTruDt= findViewById(R.id.btnTruDt);
         btnCongDt= findViewById(R.id.btnCongDt);
         btnADDDt= findViewById(R.id.btnADDDt);

        Intent intent = getIntent();
        if(intent != null){
            chair = (Chair) intent.getSerializableExtra("chairdata");
            imgViewDt.setImageResource(chair.getImgView());
            tenDt.setText(chair.getTen());
            giaDt.setText(chair.getGia()+"");
            soLuongDt.setText(chair.getSoLuong()+"");
        }

        btnCongDt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sl = Integer.parseInt(soLuongDt.getText().toString());
                sl++;
                soLuongDt.setText(sl+"");
                giaDt.setText(sl*chair.getGia()+"");
                chair.setSoLuong(sl);
            }
        });

        btnTruDt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sl = Integer.parseInt(soLuongDt.getText().toString());
                if(sl >1) {
                    sl--;
                    soLuongDt.setText(sl + "");
                    giaDt.setText(sl * chair.getGia() + "");
                    chair.setSoLuong(sl);
                }
            }
        });

        btnADDDt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity2.this,MainActivity3.class);
                arrayListDt.add(chair);
                tong=0;
                for(Chair chair: arrayListDt){
                    tong+= chair.getGia()*chair.getSoLuong();
                }
                startActivity(intent1);
            }
        });
    }


}
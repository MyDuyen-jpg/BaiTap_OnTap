package dp.thudiep.ontapgk2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class bagCustomAdapter extends RecyclerView.Adapter<bagCustomAdapter.ViewHolder> {
    private ArrayList<Chair> arrayListBag;

    public bagCustomAdapter(ArrayList<Chair> arrayListBag) {
        this.arrayListBag = arrayListBag;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bag_chair,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Chair chair = arrayListBag.get(position);
        holder.chairBag = arrayListBag.get(position);
        holder.imgViewBag.setImageResource(chair.getImgView());
        holder.tenBag.setText(chair.getTen());
        holder.giaBag.setText(chair.getGia()+"");
        holder.soLuongBag.setText(chair.getSoLuong()+"");
    }

    @Override
    public int getItemCount() {
        return arrayListBag.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        Chair chairBag;
        ImageView imgViewBag;
        TextView tenBag, giaBag,soLuongBag;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgViewBag = itemView.findViewById(R.id.imgViewBag);
            tenBag = itemView.findViewById(R.id.tenBag);
            giaBag = itemView.findViewById(R.id.giaBag);
            soLuongBag = itemView.findViewById(R.id.soLuongBag);
        }
    }
}

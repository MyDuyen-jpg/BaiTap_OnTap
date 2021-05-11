package dp.thudiep.ontapgk2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemCustomAdapter extends RecyclerView.Adapter<ItemCustomAdapter.ViewHolder> {
    private ArrayList<Chair> arrayList;
    private OnClickListener onClickListener;

    public ItemCustomAdapter(ArrayList<Chair> arrayList, OnClickListener onClickListener) {
        this.arrayList = arrayList;
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chair,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Chair chair = arrayList.get(position);
        holder.chairItem = arrayList.get(position);
        holder.imgView.setImageResource(chair.getImgView());
        holder.gia.setText(chair.getGia()+"");
        holder.ten.setText(chair.getTen());
        holder.btn.setImageResource(chair.getBtnCong());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private Chair chairItem;
        ImageView imgView;
        TextView ten, gia;
        ImageButton btn;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.imgView);
            ten = itemView.findViewById(R.id.tvten);
            gia = itemView.findViewById(R.id.tvgia);
            btn = itemView.findViewById(R.id.btn);
            imgView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClickListener.onClickItem(chairItem);
                }
            });
        }
    }
}

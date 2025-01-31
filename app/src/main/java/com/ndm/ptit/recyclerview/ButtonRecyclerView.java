package com.ndm.ptit.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import com.example.do_an_tot_nghiep.Model.Option;
//import com.example.do_an_tot_nghiep.Model.Setting;
//import com.example.do_an_tot_nghiep.R;
//import com.example.do_an_tot_nghiep.Searchpage.SearchpageActivity;
//import com.example.do_an_tot_nghiep.Servicepage.ServicepageActivity;

import com.ndm.ptit.R;
import com.ndm.ptit.activity.ServicepageActivity;
import com.ndm.ptit.enitities.Setting;

import java.util.List;

public class ButtonRecyclerView extends RecyclerView.Adapter<ButtonRecyclerView.ViewHolder> {

    private Context context;
    private List<Setting> list;

    public ButtonRecyclerView(Context context, List<Setting> list)
    {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.recycler_view_element_button, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Setting option = list.get(position);
        String name = option.getName();
        String id = option.getId();
        int icon = option.getIcon();


        holder.name.setText(name);
        holder.button.setImageResource( icon );
        holder.button.setOnClickListener(view -> {
            Toast.makeText(context, name, Toast.LENGTH_SHORT).show();
            Intent intent;
            String filterKey  = context.getString(R.string.service);
            switch (id) {
                case "niềng răng":
                    intent = new Intent(context, ServicepageActivity.class);
                    intent.putExtra("serviceId", "1" );
                    context.startActivity(intent);
                    break;
                case "khám xoang":
                    intent = new Intent(context, ServicepageActivity.class);
                    intent.putExtra("serviceId", "2" );
                    context.startActivity(intent);
                    break;
                case "khám điện não đồ":
                    intent = new Intent(context, ServicepageActivity.class);
                    intent.putExtra("serviceId", "3" );
                    context.startActivity(intent);
                    break;
                case "khám sản khoa":
                    intent = new Intent(context, ServicepageActivity.class);
                    intent.putExtra("serviceId", "4" );
                    context.startActivity(intent);
                    break;
                case "khám răng":
                    intent = new Intent(context, ServicepageActivity.class);
                    intent.putExtra("serviceId", "5" );
                    context.startActivity(intent);
                    break;
                case "khám mắt":
                    intent = new Intent(context, ServicepageActivity.class);
                    intent.putExtra("serviceId", "6" );
                    context.startActivity(intent);
                    break;
                case "chấn thương dây chằng":
                    intent = new Intent(context, ServicepageActivity.class);
                    intent.putExtra("serviceId", "7" );
                    context.startActivity(intent);
                    break;
                case "đau xương khớp":
                    intent = new Intent(context, ServicepageActivity.class);
                    intent.putExtra("serviceId", "8" );
                    context.startActivity(intent);
                    break;
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder{

        private final LinearLayout layout;
        private final androidx.appcompat.widget.AppCompatImageButton button;
        private final TextView name;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            layout = itemView.findViewById(R.id.elementLinearLayout);
            button = itemView.findViewById(R.id.elementButton);
            name = itemView.findViewById(R.id.elementName);
        }
    }
}

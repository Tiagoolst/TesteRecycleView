package br.com.etecia.testerecyclevie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class RecyclerViewPager extends RecyclerView.Adapter<RecyclerViewPager.ViewHolder> {

    private Context context;
    private List<ObjetoModelo> lsModelos;

    public RecyclerViewPager(Context context, List<ObjetoModelo> lsModelos){
        this.context = context;
        this.lsModelos = lsModelos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_pager_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lsModelos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CardView idModeloPager;
        ImageView idModeloImagemPager;
        TextView idModeloTituloPager;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            idModeloPager = itemView.findViewById(R.id.idModeloPager);
            idModeloImagemPager = itemView.findViewById(R.id.idModeloImagemPager);
            idModeloTituloPager = itemView.findViewById(R.id.idModeloTituloPager);
        }
    }
}

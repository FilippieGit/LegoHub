package br.com.etecia.legohub;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private Context context;

    private List<Legos> lstLegos;

    public Adaptador(Context context, List<Legos> lstLegos) {
        this.context = context;
        this.lstLegos = lstLegos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater=LayoutInflater.from(context);
        view=inflater.inflate(R.layout.modelo_legos,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.txtmodelo.setText(lstLegos.get(position).getNome());
        holder.imgmodelo.setImageResource(lstLegos.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return lstLegos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgmodelo;
        TextView txtmodelo;


        public ViewHolder(@NonNull View itemView) {



            super(itemView);

            imgmodelo = itemView.findViewById(R.id.idModeloImagemLego);
            txtmodelo = itemView.findViewById(R.id.idModeloTextoLego);
        }
    }
}

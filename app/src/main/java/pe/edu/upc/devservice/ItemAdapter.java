package pe.edu.upc.devservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by skynet on 3/04/17.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    List<Item> item;
    public void setItem(List<Item> item) { this.item = item; }

    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return  new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_service, parent, false));
    }

    @Override
    public void onBindViewHolder(ItemAdapter.ViewHolder holder, final int position) {
        holder.nameTextView.setText(item.get(position).getName());
        holder.pictureImageView.setImageResource(item.get(position).getPictureId());
        holder.experienciaEmpresasTextView.setText(item.get(position).getCompanys());
        holder.experienciaAniosTextView.setText(item.get(position).getYear());
        holder.experienciaProyectosTextView.setText(item.get(position).getProyects());

        holder.itemCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("currentPosition", position);
                Intent iconIntent = new Intent(view.getContext(), IconActivity.class);
                iconIntent.putExtras(bundle);
                view.getContext().startActivity(iconIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView itemCardView;
        ImageView pictureImageView;
        TextView nameTextView;
        TextView experienciaEmpresasTextView;
        TextView experienciaProyectosTextView;
        TextView experienciaAniosTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            itemCardView = (CardView) itemView.findViewById(R.id.itemCardView);
            pictureImageView = (ImageView) itemView.findViewById(R.id.pictureImageView);
            nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
            experienciaAniosTextView = (TextView) itemView.findViewById(R.id.experienciaAniosTextView);
            experienciaEmpresasTextView = (TextView) itemView.findViewById(R.id.experienciaEmpresasTextView);
            experienciaProyectosTextView = (TextView) itemView.findViewById(R.id.experienciaProyectosTextView);
        }
    }

}

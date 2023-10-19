package ar.com.avillucas.parcial1test.usuario.listar;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ar.com.avillucas.parcial1test.R;
import ar.com.avillucas.parcial1test.usuario.core.Usuario;


public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioViewHolder> {

    private final  RecyclerViewInterface recyclerViewInterface ;
    private final List<Usuario> usuarios;

    public UsuarioAdapter(List<Usuario> usuarios, RecyclerViewInterface recyclerViewInterface) {
        this.usuarios = usuarios;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.usuario, parent, false);
        return new UsuarioViewHolder(vista);
    }


    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder holder, int position) {
        Usuario usuario = this.usuarios.get(position);
        TextView nombre = holder.itemView.findViewById(R.id.lblUsuarioNombre);
        TextView tipo = holder.itemView.findViewById(R.id.lblTipo);
        nombre.setText(usuario.getNombre());
        tipo.setText( usuario.getTipo().toString());
        holder.itemView.setOnClickListener(v -> {
            if (recyclerViewInterface != null) {
                int pos = holder.getAbsoluteAdapterPosition();
                if (pos != RecyclerView.NO_POSITION) {
                    recyclerViewInterface.onItemClick(pos);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.usuarios.size();
    }
}
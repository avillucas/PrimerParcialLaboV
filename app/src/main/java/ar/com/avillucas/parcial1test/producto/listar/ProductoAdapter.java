package ar.com.avillucas.parcial1test.producto.listar;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ar.com.avillucas.parcial1test.R;
import ar.com.avillucas.parcial1test.producto.core.Producto;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoViewHolder> {

    private final RecyclerViewInterface recyclerViewInterface;
    private final List<Producto> productos;

    public ProductoAdapter(List<Producto> productos, RecyclerViewInterface recyclerViewInterface) {
        this.productos = productos;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public ProductoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.producto, parent, false);
        return new ProductoViewHolder(vista);
    }


    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull ProductoViewHolder holder, int position) {
        Producto producto = this.productos.get(position);
        TextView nombre = holder.itemView.findViewById(R.id.lblProductoNombre);
        TextView cantidad = holder.itemView.findViewById(R.id.lblProductoCantidad);
        TextView precio = holder.itemView.findViewById(R.id.lblProductoPrecio);
        nombre.setText(producto.getNombre());
        cantidad.setText(String.format("%d", producto.getCantidad()));
        precio.setText(String.format("%.2f", producto.getPrecio()));
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
        return this.productos.size();
    }
}

package vn.edu.vhu.ltdd.a10gallery;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Adapter cho RecyclerView.
 *
 * So với BaseAdapter của ListView (Lab A9):
 *   - ViewHolder là BẮT BUỘC, không còn chuyện quên tái sử dụng View.
 *   - Ba phương thức rõ ràng: onCreateViewHolder (tạo ô), onBindViewHolder (đổ dữ liệu),
 *     getItemCount (đếm).
 *   - Việc sắp xếp ô do LayoutManager lo, adapter không cần biết là danh sách hay lưới.
 */
public class AnhAdapter extends RecyclerView.Adapter<AnhAdapter.AnhViewHolder> {

    /** Giao diện callback để Activity xử lý sự kiện bấm — adapter không tự mở màn hình. */
    public interface OnAnhClickListener {
        void onAnhClick(int viTri);
    }

    public interface OnAnhDeleteListener {
        void onAnhDelete(int viTri);
    }

    static class AnhViewHolder extends RecyclerView.ViewHolder {
        final ImageView imgAnh;
        final TextView tvChuThich;
        final Button btnXoaAnh;

        AnhViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAnh = itemView.findViewById(R.id.imgAnh);
            tvChuThich = itemView.findViewById(R.id.tvChuThich);
            btnXoaAnh = itemView.findViewById(R.id.btnXoaAnh);
        }
    }

    private final List<Integer> anh;
    private final List<String> chuThich;
    private final OnAnhClickListener listener;
    private final OnAnhDeleteListener deleteListener;

    public AnhAdapter(List<Integer> anh, List<String> chuThich, OnAnhClickListener listener, OnAnhDeleteListener deleteListener) {
        this.anh = anh;
        this.chuThich = chuThich;
        this.listener = listener;
        this.deleteListener = deleteListener;
    }

    /** Được gọi khi cần MỘT ô mới. Số lần gọi chỉ bằng số ô nhìn thấy, không phải số ảnh. */
    @NonNull
    @Override
    public AnhViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_anh, parent, false);
//        AnhViewHolder holder = new AnhViewHolder(v);
//
//        return holder;
        return new AnhViewHolder(v);
    }

    /** Được gọi mỗi khi một ô cần hiển thị dữ liệu của vị trí mới. */
    @Override
    public void onBindViewHolder(@NonNull AnhViewHolder holder, int position) {

//        Log.d("A10_241A010134",
//                "BIND - Holder ID: "
//                        + System.identityHashCode(holder)
//                        + " - Vị trí: " + position);

        holder.imgAnh.setImageResource(anh.get(position));
        holder.tvChuThich.setText(chuThich.get(position));

        // Dùng getBindingAdapterPosition(), KHÔNG dùng biến position,
        // vì vị trí có thể đã đổi khi người dùng bấm.
        holder.itemView.setOnClickListener(v -> {
            int p = holder.getBindingAdapterPosition();
            if (p != RecyclerView.NO_POSITION) listener.onAnhClick(p);
        });

        holder.btnXoaAnh.setOnClickListener(v -> {
           int viTri = holder.getBindingAdapterPosition();

           if(viTri != RecyclerView.NO_POSITION) {
               deleteListener.onAnhDelete(viTri);
           }
        });
    }

    @Override
    public int getItemCount() {
        return anh.size();
    }
}

# LAB A10 – XÂY DỰNG GIAO DIỆN HIỂN THỊ HÌNH ẢNH
---
## 1. Thông tin sinh viên

- **Họ và tên:** Nguyễn Thị Hồng Thắm
- **MSSV:** 241A010134
- **Lớp:** CNTT – LTDD
- **Tên bài thực hành:** Lab A10 – RecyclerView và ViewPager2

## 2. Giới thiệu

Ứng dụng được xây dựng bằng Android Studio, sử dụng Java và XML nhằm tìm hiểu cách hiển thị danh sách hình ảnh bằng RecyclerView và xem hình ảnh chi tiết bằng ViewPager2.

Bên cạnh các chức năng cơ bản, ứng dụng còn được mở rộng với khả năng hiển thị ảnh dạng lưới so le và xóa hình ảnh trực tiếp khỏi danh sách.

## 3. Công nghệ sử dụng

- **IDE:** Android Studio
- **Ngôn ngữ lập trình:** Java
- **Thiết kế giao diện:** XML
- **RecyclerView:** androidx.recyclerview:recyclerview:1.4.0
- **ViewPager2:** androidx.viewpager2:viewpager2:1.1.0
- **Material Components:** MaterialCardView và các thành phần giao diện Material
- **Minimum SDK:** 24

## 4. Chức năng chính

### 4.1. Hiển thị danh sách hình ảnh

- Sử dụng RecyclerView để hiển thị danh sách hình ảnh.
- Sử dụng AnhAdapter để quản lý dữ liệu và liên kết hình ảnh với giao diện.
- Hiển thị hình ảnh theo dạng lưới bằng GridLayoutManager.
- Cho phép thay đổi số cột hiển thị.

### 4.2. Xem hình ảnh chi tiết

- Nhấn vào một hình ảnh để mở màn hình ViewerActivity.
- Sử dụng ViewPager2 để hiển thị hình ảnh chi tiết.
- Cho phép vuốt sang trái hoặc phải để chuyển đổi giữa các hình ảnh.

## 5. Bài tập nâng cao

### NC2 – Hiển thị ảnh dạng lưới so le

- Sử dụng StaggeredGridLayoutManager.
- Thiết lập bố cục gồm 2 cột theo chiều dọc.
- Sử dụng wrap_content và adjustViewBounds để hình ảnh có chiều cao linh hoạt.
- Bổ sung chức năng chuyển đổi giữa chế độ lưới thông thường và lưới so le.

### NC4 – Xóa hình ảnh khỏi RecyclerView

- Chuyển đổi dữ liệu hình ảnh từ mảng int[] sang List<Integer>.
- Bổ sung nút Xóa ảnh vào từng mục hình ảnh.
- Sử dụng OnAnhDeleteListener để xử lý sự kiện xóa.
- Xóa hình ảnh và chú thích tương ứng khỏi danh sách.
- Sử dụng notifyItemRemoved() để cập nhật giao diện sau khi xóa.
- Sử dụng notifyItemRangeChanged() để cập nhật các vị trí còn lại.

## 6. Cấu trúc dự án

```text
A10_241A010134/
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── vn/edu/vhu/ltdd/a10gallery/
│           │       ├── MainActivity.java
│           │       ├── AnhAdapter.java
│           │       ├── ViewerActivity.java
│           │       └── AnhPagerAdapter.java
│           │
│           └── res/
│               ├── drawable/
│               │   ├── p1
│               │   ├── p2
│               │   ├── p3
│               │   ├── p4
│               │   ├── p5
│               │   ├── p6
│               │   ├── p7
│               │   └── p8
│               │
│               └── layout/
│                   ├── activity_main.xml
│                   ├── activity_viewer.xml
│                   └── item_anh.xml
│
├── README.md
└── .gitignore
```

## 7. Kết quả kiểm thử

| STT | Nội dung kiểm thử | Kết quả |
|---|---|---|
| 1 | Hiển thị danh sách 8 hình ảnh | Thành công |
| 2 | Thay đổi số cột hiển thị | Thành công |
| 3 | Mở hình ảnh chi tiết | Thành công |
| 4 | Vuốt chuyển đổi hình ảnh bằng ViewPager2 | Thành công |
| 5 | Bật/tắt chế độ lưới so le NC2 | Thành công |
| 6 | Xóa hình ảnh NC4 | Thành công |
| 7 | Cập nhật danh sách sau khi xóa | Thành công |

## 8. Kết luận

Qua bài thực hành A10, em đã tìm hiểu và vận dụng được RecyclerView, Adapter, ViewHolder, GridLayoutManager, StaggeredGridLayoutManager và ViewPager2 trong Android.

Đồng thời, em đã thực hành quản lý dữ liệu danh sách bằng List<Integer>, xử lý sự kiện xóa hình ảnh và cập nhật giao diện RecyclerView bằng các phương thức thông báo phù hợp.

Bài thực hành giúp củng cố kiến thức về xây dựng giao diện Android, quản lý dữ liệu và xử lý tương tác với người dùng.

---

**Sinh viên thực hiện:** Nguyễn Thị Hồng Thắm  
**MSSV:** 241A010134  
**Repository:** A10_241A010134
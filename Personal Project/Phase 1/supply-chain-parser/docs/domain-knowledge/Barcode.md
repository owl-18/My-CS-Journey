# Barcode là gì

Barcode thực chất chỉ là ánh sáng và bóng tối. Máy quét bắn tia laser, vạch đen hấp thụ ánh sáng, khoảng trắng phản chiếu lại - từ pattern đó máy đọc ra số.

## Lịch sử Barcode

## EAN-13 được encode như thế nào.

13 số được chia thành 3 nhóm.

- Số đầu tiên sẽ quyết định dùng mã cho nhóm trái.
  - Nhóm trái (6 ký tự).
  - Nhóm phải (6 ký tự).

Mỗi chữ số được biểu diễn bằng 7 module - tức là có 7 cột đen/trắng. Toàn bộ EAN-13 rộng 95 module cộng thêm guard bar ở đâu, giữa, cuối.

```txt
[Start guard] [6 digits trái] [Center guard] [6 digits phải] [End guard]
     101            ...               01010            ...         101
```

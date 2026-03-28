# Dự án mini Supply Chain Parser

Dự án này được tạo ra với mục đích phục vụ cho sự tò mò của bản thân tôi, cụ thể khi tôi nhìn vào các `barcode` và tôi muốn tìm hiểu xem nó là gì thì tôi biết đến nó như là một chuỗi cung ứng đa quốc gia, tôi có thể biết được hàng hóa mình từ đâu, đến đâu và phân phối ra sao.

## Phân tích `barcode`

Trước đó, tôi có mua một đôi giày là `Saucony Peregrine 14` và tôi có một barcode như sau:

> Ảnh ...

Một trong những mã vạch phổ biến nhất hiện nay là `EAN-13`, trong đó:

- **Mã quốc gia (GS1):** 3 số đầu - nơi đăng ký mã vạch (không hẳn là nơi sản xuất).
- **Mã doanh nghiệp:** 4 - 6 số tiếp theo - định danh công ty
- **mã sản phẩm:** 3 - 5 số tiếp - Do doanh nghiệp tự đặt cho từng loại hàng.
- **Số kiểm tra:** 1 số cuối - Dùng để xác nhận mã vạch có hợp lệ không (giống checksum).

## Mục tiêu dự án

Khi nhập một `barcode` bất kỳ vào, nó sẽ trả ra các kết quả như sau:

- Kiểm tra xem mã có phải thật hay giả
- Hàng nhập khẩu hay là hàng xuất khẩu chính ngạch
- Công ty nào phân phối sản phẩm này
- Cảng đi, cảng đến
- Tên con tàu vận chuyển, số chuyến

## Chiến lược

Tôi sẽ chia thành ba giai đoạn cho dự án này, vì hiện tại tôi đang học đến Part 5 khóa học Java Programming I của Đại học Helsinki.

**Giai đoạn 1:**

- _input_: Nhập EAN-13
- _logic_: Query public database của GS1
- _output_: Hiển thị kết quả

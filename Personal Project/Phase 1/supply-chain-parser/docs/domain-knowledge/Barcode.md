# Barcode là gì

**Barcode** hay còn gọi là mã vạch, nó được in trên hầu hết mọi loại sản phẩm, bao bì được bày bán tại các trung tâm bán lẻ và trung tâm thương mại.

Nội dung mã vạch bao gồm: nước đăng ký mã vạch, tên doanh nghiệp, lô, tiêu chuẩn, chất lượng đăng ký, thông tin về kích thước sản phẩm, nơi kiểm tra...

## Lịch sử

Ý tưởng này được phát triển bởi _Norman Joseph Woodland_ và _Bernard Silver_. Nó được phát triển khi biết mong muốn của một vị chủ tích buôn bán đồ ăn làm sao để tự động kiểm tra toàn bộ quy trình. Ý tưởng đầu tiên là sử dụng mã Morse để in những vạch rộng hay hẹp thẳng đứng. Sau đó, họ chuyển sang sử dụng dạng "điểm đen" của mã vạch với các vòng tròn đồng tâm. Ngày 7 tháng 10 năm 1952, công trình _Classifying Apparatus and Method_ đã được cấp bằng sáng chế.

## Nguyên lý nhị phân

Về cơ bản, mã vạch là sự tương phản giữa các vạch đen và khoảng trắng để máy quét có thể đọc và chuyển thành số.

- Vạch đen là số 0 hoặc 1 - tùy quy ước, hấp thụ ánh sáng mạnh, phản xạ yếu.
- Vạch trắng cũng tùy quy ước, phản xạ lại ánh sáng mạnh.

Module: Mỗi mã vạch được chia thành các đơn vị nhỏ nhất được gọi là module. Một vạch dày thực chất là nhiều module đứng cạch nhau. Vạch mỏng là module đơn lẻ.

### Cách mã hóa

Cách mã hóa dưới đây đang sử dụng mã UPC, đây là mã thường thấy trên siêu thị, mỗi số từ 0 đến 9 được biểu diễn bằng chuỗi 7 bit nhị phân:

- Số 0 được mã hóa bằng `0001101`
- Số 1 được mã hóa bằng `0011001`

Mỗi chuỗi luôn có 2 vạch đen và hai vạch trắng khác nhau với độ dày khác nhau để máy quét nhận diện

Ví dụ, đôi giày **Sauconny Peregrine 14** có mã vạch như sau:

> ![Sauconny Peregrine 14](sypply-chain-parser/docs/domain-knowledge/resources/barcode_saucony_peregrine_14.jpeg)
> Dịch tương ứng sẽ là
> 101 0011001 0001011 011001 0001101 0011001 0001011 01010 1110100 1100110 100100 1010000 1001110 1110010 101

## Cấu tạo

Về tổng quan, mã vạch có các vạch dài và vạch ngắn, nhưng nó có điểm chung là vạch dài nằm ở đầu, giữa và cuối, các vạch này gọi gọi là vạch bảo vệ.

Vạch giữa còn có tính năng khác là chia mã vạch làm hai nửa

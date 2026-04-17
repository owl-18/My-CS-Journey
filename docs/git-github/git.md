# Git

Git là hệ thống quản lý phiên bản

## Đặc điểm cốt lõi

**A. Snapshot, không phải Differences**

Thay vì lưu trữ một tệp cơ sở và danh sách các thay đổi qua thời gian, Git coi dữ liệu của mình như một chuỗi các **snapshot**

- Mỗi khi `commit`, Git chụp lại toàn bộ trạng thái của tất cả các tệp tại thời điểm đó và lưu trữ một điểm tham chiếu đến ảnh chụp đó.

- Để đảm bảo hiệu xuất, nếu một tệp không thay đổi, Git không lưu trữ tệp lại đó một lần nữa mà chỉ lưu một liên kết dến tệp gốc trước đó đã tồn tại.

**B. Gần như mọi thao tác đều là cục bộ**

Hầu hết mọi thao tác trong Git chỉ cần các tệp và tài nguyên cục bộ để vận hành, không cần thông tin từ máy chủ qua mạng.

- **Tốc độ:** Vì toàn bộ lịch sử dự án nằm ngay trên đĩa cứng cục bộ, các thao tác như xem nhật ký (log) hoặc so sánh các phiên bản (diff) diễn ra gần như tức thì.

- **Ngoại tuyến:** Git hoạt động tốt kể cả khi không có mạng, commit, tạo nhánh và xem lịch sử. Chỉ cần mạng khi sử dụng `pull` dữ liệu lên hoặc `pull` dữ liệu về từ người khác.

**C. Git có tính toàn vẹn (Integrity)**

Mọi thứ trong Git đều được băm (checksum) bằng thuật ngữ **SHA-1 hash** trước khi được lưu trữ.

- Một mã SHA-1 làm một chuỗi 40 ký tự thập lục phân
- Git sử dụng mã băm này để định danh mọi thứ, không phải bằng tên tệp. Điều này có nghĩa là Git biết chắc chắn nếu nội dung tệp hoặc cấu trúc thư mục bị thay đổi mà không thông qua Git, vì mã băm sẽ không khớp.

**D. Git chủ yếu là thêm dữ liệu (Gererally Only Adds Data)**

Khi thực hiện các thao tác của Git, hầu như tất cả chúng đều là thêm dữ liệu vào cơ sở dữ liệu của Git. Rất khó để làm mất dữ liệu xóa bỏ hoàn toàn thông tin khỏi một hệ thống một khi ta đã snapshot vào Git.

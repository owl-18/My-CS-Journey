public class Clock {
    ClockHand hours = new ClockHand(24);
    ClockHand minutes = new ClockHand(60);
    ClockHand seconds = new ClockHand(60);

    // Đối tượng là gì?
    // Đối tượng là một thực thế độc lập có trạng thái và sử dụng behavior được
    // định nghĩa trong class

    // Đối tượng có thể có nhiều dạng khác nhau. Một số mô tả các khái niệm vấn
    // đề, một số khác được sử dụng để điều phối sự tương tác giữa các đối tượng.

    // Các đối tượng tương tác với nhau thông qua phương thức. Một là dùng để
    // xin thông tin, hai là ra lệnh cho đối tượng làm một việc gì đó.

    // Ở đây, Clockhand là một thực thể khái niệm, biểu diễn khái niệm "kim đồng hồ"
    // Clock là thực thể điều phối/thực thể trung ương 

    // Điều phối
    // Ta có thể thấy ở dây, method advance trong ClockHand là ra lệnh, còn method
    // .value là để lấy thông tin.
    public void advance() {
        this.seconds.advance();

        if (this.seconds.value() == 0) { // Trạng thái để điều phối hành vi
            this.minutes.advance();

            if (this.minutes.value() == 0) {
                this.hours.advance();
            }
        }
    }
    // Về tổng thể, mỗi đối tượng đều có ranh giới và hành vi riêng của mình 
    // Mỗi ClockHand tự quản lý logic của mình.
    // Clock chỉ điều phối khi nào các kim khác cần tăng lên 

    // Clock đóng vai trò cấu hình cho các ClockHand thông qua constructor
    // Clock không được can thiệp vào dữ liệu của ClockHand vì nó không thuộc quyền sở
    // hữu dữ liệu đó.

    // Sở hữu dữ liệu là có quyền đọc ghi và sửa. Như là ClockHand sở hữu value và limit
    // Vậy câu hỏi đặt ra là: Clock sở hữu ClockHand, vậy thì Clock có sỡ hữu value và
    // limit không?

    // Câu trả lời là không. Vì Clock không sở hữu trực tiếp value và limit. 
    // Phân tích ra, ta đang có hai tầng:
    // - Tầng một: Clock - sở hữu ClockHand (Tham chiếu đối tượng).
    // - Tầng hai: ClockHand - sở hữu value và limit 

    // Về cơ bản Class Clock còn gọi là Singleton Pattern.

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}

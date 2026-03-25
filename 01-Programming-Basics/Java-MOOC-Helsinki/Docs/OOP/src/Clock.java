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

  // Một Object được coi là sở hữu dữ liệu khi dữ liệu nằm trong nó, nó kiểm soát được
  // việc thay đổi dữ liệu và đảm bảo dữ liệu luôn hợp lệ. Như là ClockHand sở hữu value
  // và limit
  // Vậy câu hỏi đặt ra là: Clock sở hữu ClockHand, vậy thì Clock có sỡ hữu value và
  // limit không?

  // Câu trả lời là không. Vì Clock không sở hữu trực tiếp value và limit. Chỉ có quyền
  // tương tác.

  // Onwership không phải là ai chứa ai, mà là ai kiểm soát và chịu trách nhiệm cho dữ liệu.
  // Trong OOP, onwership chỉ tính ở nơi dữ liệu được định nghĩa và kiểm soát.
  // ClockHand đảm bảo 0 <= value < limit -> invariant
  // Từ đây ta có Ownership tương đương với kiểm soát invariant, ClockHand đang bảo vệ invariant.

  // Vậy Class Clock có chứa limit và value không
  // Câu trả lời là có, tên gọi đầy đủ của khái niệm này là has-a
  // has-a ở trong context này là Clock has-a ClockHand như component
  // Đây là còn gọi là composition, xây hệ thống từ các thành phần nhỏ hơn.

  // Có hai loại has-a (mối quan hệ)
  // Một là composition mạnh, nghĩa là A tạo ra B và quản lý vòng đời của B
  // Clock tạo ra ClockHand và quản lý vòng đời của ClockHand, và nếu Clock
  // mất, ClockHand cũng mất.

  // Hai là aggregation, A dùng B nhưng không tạo ra B

  // Tại sao ta phải đặt ra ranh giới giữa sỡ hữu data và mối quan hệ giữa chúng.
  // Mỗi Object có một phần việc/trách nhiệm mà nó phải làm và phải là đúng.

  // Trong đoạn code trên, ta có thể thấy trách nhiệm của ClockHand được phân hóa rõ như sau
  // - Sở hữu value và limit
  // - Tăng value (advance method)
  // - reset khi đạt limit

  // -> Nó không có trách nhiệm điều phối các kim khác. hay là biết về hours hay minutes

  // Vậy điều gì xảy ra nếu như vi phạm: nếu Clock làm việc của ClockHand thì sao?
  // Ta hãy hình dung nó giống như việc một đầu bếp vừa nấu ăn vừa phục vụ vậy, không hiệu quả
  // không vai trò rõ, và tất nhiên là việc scale và bảo trì trở nên khó khăn hơn vì không biết
  // gán cho anh ta vai trò gì, anh ta là việc gì hiệu quả hơn. Trong OOP thì nó được gọi là
  // phá đi Encapsulation.

  // Khái niệm trên có tên gọi là Responsibility - việc của ai người đó làm.

  // Từ đây ta có khái niệm High cohesion - Low coupling

  // High cohesion: dịch tiếng sát nghĩa là tương đồng, trong lập trình các thành phần trong class
  // cùng phục vụ một mục đích rõ ràng.

  // Trong ClockHand có hai biến value và limit, và method advance. Trong đó method advance sử dụng
  // hai biến value và limit đều liên quan đến việc quản lý trạng thái của kim đồng hồ -> Class này
  // có tính cohesion cao

  // Nói đơn giản hơn, method trong class nên làm việc với chính dữ liệu trong class đó, tất cả các
  // component cùng hướng tới target chung.

  // Low coupling: tính liên kết, Class A ít phụ thuộc vào chi tiết của Class B (A không cần biết B
  //  hoạt động như thến nào). Low coupling bắt đầu từ:
  // - Encapsulation
  // - Không đụng vào trạng thái nội bộ
  // - Phân chia trách nhiệm đúng

  // Vậy thì tại sao
  // Giả sử seconds.value = 59;
  // Điều này khiến cho Clock phải biết có field value và chạy từ 0 tới 59. Trong khi thực tế phải
  // giấu nó đi và Clock nên làm đúng trách nhiệm điều phối của mình. Clock đang bị phụ thuộc vào
  // chi tiết bên trong ClockHand.

  // Như vậy Encapsulation giúp giấu chi tiết -> giảm sự phụ thuộc từ đây dẫn đến giảm coupling
  // Đây là bản chất của Encapsulation giải thích tại sao private lại dùng cho các biến nội bộ và
  // method ta lại dùng public

  // === NOTE ===
  // invariant là một điều kiện hoặc một quy luật mà luôn luôn phải đúng trong vòng đời của
  // một đối tượng. Điều này có nghĩa là:
  // - Nó phải đúng ngay khi đối tượng được khởi tạo
  // - Nó phải đúng trước và sau khi bất kỳ phương thức nào được thực thi - Hàm advance

  // => Encapsulation giúp bảo vệ invariant

  @Override
  public String toString() {
    return hours + ":" + minutes + ":" + seconds;
  }
}

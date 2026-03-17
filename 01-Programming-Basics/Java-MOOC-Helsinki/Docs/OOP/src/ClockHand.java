public class ClockHand {
    // Đồng hồ hoạt động như thế nào ?
    // Đồng hồ có 3 kim (giờ, phút, giây), trong đó phút và giây khi đạt tới 60, kim sẽ reset về 0.
    // Kim giờ thì 24.

    // Thông thường, ta sẽ triển khai theo hướng như sau
    // Tạo 3 biến giờ phút và giây và gán chúng bằng 0 
    // Triển khai logic bên trong 
    // tăng giây lên 1
    // Nếu giây lớn hơn 59 thì tăng phút lên 1 ... -> Khá là rườm rà 

    // Bây giờ ta sẽ nhìn điểm chung giữa chúng:
    // - Là chúng nó có giới hạn, sau khi đạt đến giới hạn thì reset về 0
    // Từ đây ta sẽ có hai biến: value và limit
    private int value;
    private int limit; // giới hạn tối đa trước khi value quay về 0

    // Mục đích của lập trình hướng đối tượng là tạo ra sự trừu tượng, ở đây là thay vì chỉ ra
    // chi tiết cách thức hoạt động của chúng thì ta sẽ tách các khái niệm thành các thực thể 
    // riêng biệt. -> Giảm độ phức tạp

    // Constructor này nhận tham số limit
    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    // Sử dụng chúng như thế nào?
    // Ta tạo ra một thực thể riêng biệt, khi sử dụng, ta chỉ cần tạo ra 3 cây kim khác nhau
    // thay vì hẳn một đồng hồ 24 giờ, nếu như một ngày không phải 24 giờ thì sao, một quy luật
    // khác thì sao, ta chỉ cần tạo ra 3 cây kim và cho chúng các giới hạn. -> Encapsulation

    // Ta phân rã chúng ở khi tạo ra một instance cụ thể, nhưng ở Class, ta gom chung nó lại để
    // thực hiện một hành động cụ thể.

    // Đằng sau những hành động ta chính là một chương trình được xây dựng từ các đối tượng nhỏ
    // riêng biệt nhưng hoạt động cùng nhau.

    // Clock Program
    // ├─ seconds (ClockHand) Đối tượng nhỏ
    // ├─ minutes (ClockHand) Đối tượng nhỏ
    // └─ hours   (ClockHand) Đối tượng nhỏ
    
    // Tăng giá trị của kim lên 1
    // Giấu logic bên trong
    public void advance() {
        this.value = this.value + 1;
        if (this.value >= this.limit) {
            this.value = 0; // Nếu giá trị đạt đến giới hạn thì quay về 0
        }
    }

    public int value() {
        return this.value;
    }

    @Override
    public String toString() {
        return (this.value < 10 ? "0": "") + this.value;
    }
}
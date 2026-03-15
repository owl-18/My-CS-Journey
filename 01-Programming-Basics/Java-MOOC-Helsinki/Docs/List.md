# List 

ArrayList là một mảng động thuộc gói `java.util`, nó có khả năng thay đổi kích cỡ, thêm xóa phần tử một cách linh hoạt.

## Đặc điểm

- **Kích thước linh hoạt:** Tự động tăng capacity khoảng 50% khi vượt quá giới hạn hiện tại

- **Lưu trữ đối tượng:** Chỉ lưu trữ các Object, để lưu trữ các kiểu nguyên thủy như (int, double, char) thì phải sử dụng lớp Wrapper tương ứng.

- **Thứ tự:** Duy trì đúng thứ tự các phần tử được thêm vào - giống như mảng, phần tử đầu tiên bắt đầu tư 0

- **Đồng bộ:** Không an toàn trong môi trường đa luồng

## Các phương thức phổ biến (API Level)

- `add()`
- `get()`
- `set()`
- `remove()`
- `size()`
- `contains()`
- `clear()`
- `iteration()`

## Tradeoff

**ArrayList** tăng kích thước như thế nào.

Mỗi khi gọi phương thức `add()`, `ArrayList` sẽ kiểm tra xem số lượng phần tử hiện tại `size` đã bằng dung lượng với mảng nội bộ chưa. Nếu mảng đã đầy, nó sẽ gọi phương thức nội bộ là `grow()` 

> [!note]- `grow()` method
> ```java
>   private Object[] grow(int minCapacity) {
>      int oldCapacity = this.elementData.length;
>      if (oldCapacity <= 0 && this.elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
>         return this.elementData = new Object[Math.max(10, minCapacity)];
>      } else {
>         int newCapacity = ArraysSupport.newLength(oldCapacity, minCapacity - oldCapacity, oldCapacity >> 1);
>         return this.elementData = Arrays.copyOf(this.elementData, newCapacity);
>      }
>   }
>
>   private Object[] grow() {
>      return this.grow(this.size + 1);
>   }
> ```
# Lộ trình tự học Khoa Học Máy Tính

Nói qua về tôi, hiện tại đang nghỉ học đại học và vừa học vừa làm công việc không liên quan đến lập trình. Nhưng tôi lại có một thứ muốn đắm chìm đó là hiểu cách máy tính hoạt động. Đây mà một số khóa học tôi hiện đang theo học và sẽ theo học.

## Giai đoạn 1

- Lập trình Java của Đại Học Helsinki
- Thuật toán của Đại học Princeton
- The Missing Semester của MIT

> Dự án Online Judge, trình chấm bài mini.

## Giai đoạn 2

- Hệ điều hành - OSTEP
- Kiến trúc máy tính của Nand2Tetris
- Mạng máy tính
  - Lý thuyết: Computer Networking: A Top-Down Approach (Kurose & Ross)
  - Thực hành: CS144

> Tối ưu máy chấm.

## Giai đoạn 3

- Cơ sở dữ liệu của Standford

> Lưu trữ bài tập và scale.

## Giai đoạn 4

- Full Stack Open của Đại học Helsinki

> Khóa này sẽ giúp hoàn thành UX/UI của app

---

### Một chút về tôi

> [!NOTE]
> Các khóa học này có vẻ quá sức với tôi vì bản thân tôi chưa từng là một học sinh giỏi hay thì các kì thi tin học, tôi chỉ muốn học thuật toán, trở thành một lập trình thi đấu nhưng quá nhiều nền tảng, không một nền tảng nào thống nhất để tôi bắt đầu học hay là ai đó hướng dẫn tôi học
> Mục đích tôi học các khóa học này là tạo ra Online Judge phiên bản CLI với trình soạn thảo văn bản là Neovim/Emacs (tôi biết xài cả hai và đều thích nó) để phục vụ cho mục đích học thuật toán của bản thân và tạo ra môi trường học cho bản thân mình.
> Về cơ bản tôi không làm việc liên quan đến ngành hay là học chung với bạn bè, tôi không còn bị so sánh, tôi chỉ muốn hiểu máy tính hoạt động, tạo ra một thứ cho riêng mình.

### Về khóa học

Do được code trên Nvim và không có nhiều plugin, chủ yếu viết code chay thuần túy mà không có sự hỗ trợ của LSP server. Hiên tại tôi đang sử dụng tyni.nvim của Nvchad, khá là nhẹ và không cần config. Vào là code được ngay, tôi sẽ để một số lệnh để chạy code Java mà không cần sự hỗ trợ của IDE

```bash
host@Java: javac src/main/*.java
host@Java: java -cp src/main/java Program
```

Câu lệnh trên sẽ hoạt động với cấu trúc thư mục như sau

```bash
.
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── Sandbox.java
│   └── test
│       └── java
│           └── SandboxTest.java
└── target
    ├── classes
    │   └── Sandbox.class
    ├── generated-sources
    │   └── annotations
    └── test-classes
        └── SandboxTest.class
```

Nếu đã cài đặt maven

```bash
host@Java: mvn compile
host@Java: mvn exec:java -Dexec.mainClass="YourMainProgram"
```

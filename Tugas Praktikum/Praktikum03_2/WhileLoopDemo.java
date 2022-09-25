import java.util.concurrent.TimeUnit;

public class WhileLoopDemo {
    public static void main(String[] args) {
        int i = 3;
        while (true) {
            System.out.println("Hello ke-" + i);
            i+=3;
            if(i > 300){
                break;
            }

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
    }
}

// Ubahlah source code tersebut agar :
// - hanya menampilkan indeks bilangan kelipatan 3
// "Hello ke-3"
// "Hello ke-6"
// "Hello ke-9"
// ...
// - berhenti setelah menampilkan output "Hello ke-300"
import java.io.*;
import java.nio.Buffer;

class JavaTask17 {
  public static void main(String[] args) {
    String str;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите текст для записи в файл. Признак окончания ввода-строка 'stop'");
    try (FileWriter fw = new FileWriter("D://test.txt")){
      do {
        System.out.print("^");
        str = br.readLine();

        if (str.compareTo("stop") == 0) break;

        str = str + "\r\n";
        fw.write(str);

      } while(str.compareTo("stop") != 0);
    } catch(IOException exc) {
      System.out.println("Ошибка ввода-вывода: " + exc);
    }

  }
}

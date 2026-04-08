import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class act131 {
    public static void main(String[] args) throws IOException {
        File directori = new File("data");
        directori.mkdir();


        String data_text = DateTimeFormatter.BASIC_ISO_DATE.format(LocalDate.now());


        File data_directori = new File("data/",data_text);
        data_directori.mkdir();


        LocalTime time = LocalTime.now();
        String time_text = time.format(DateTimeFormatter.ofPattern("HHmm"));


        FileWriter fitxer_HHmm = new FileWriter(data_directori + "/" + time_text, true);
        String second_text = time.format(DateTimeFormatter.ofPattern("ss"));
        fitxer_HHmm.write(second_text);
        fitxer_HHmm.write("\n");
        fitxer_HHmm.close();
    }
}

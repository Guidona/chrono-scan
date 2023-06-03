package io.chrono.scan;

import net.sourceforge.tess4j.Tesseract;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileOutputStream;

@SpringBootApplication
public class ScanApplication implements CommandLineRunner {

    private static final String FILE_PATH = "../tessdata";

    public static void main(String[] args) {
        SpringApplication.run(ScanApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        System.setProperty("jna.library.path", "C:\\Program Files\\gs\\gs10.01.1\\bin");

        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath(FILE_PATH);
        tesseract.setLanguage("eng");

        tesseract.setTessVariable("user_defined_dpi", "300");

        // Load the PDF or image file
        File file = new File("src/main/resources/static/CV - GUY MBEREBE GUIDONA.pdf");

        // Extract text using Tesseract OCR
        String result = tesseract.doOCR(file);

        // Print the extracted text
        FileOutputStream outputStream = new FileOutputStream(file.getName().split("\\.")[0] + ".txt");
        byte[] strToBytes = result.getBytes();
        outputStream.write(strToBytes);

        outputStream.close();

    }
}

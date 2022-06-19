package ru.javaprojects.thinkinginjava.chapter18.image_copy.io;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File image = new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\image_copy\\source\\image.jpg");
        try (InputStream is = new BufferedInputStream(new FileInputStream(image))) {
            byte[] bytes = is.readAllBytes();
            File file = new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\image_copy\\io\\imagedir\\copy.jpg");
            try (OutputStream os = new BufferedOutputStream(new FileOutputStream(file))) {
                os.write(bytes);
                os.flush();
            }
        }
    }
}

package task18bonus1;

import java.io.*;

public class shaffle {

    public static void main(String[] args) throws IOException {
        File fileName = new File(args[1]);
        File fileOutputName = new File(args[2]);


        if (args[0].equals("-e")) {
            shaffl(fileName, fileOutputName);
        } else if (args[0].equals("-d")) {
            deshaffl (fileName, fileOutputName);
        } else System.out.println("Wrong parameter");

    }

    public static void shaffl (File fileName, File fileOutputName) throws IOException {//метод шифровки

        try {
            byte[] data = new byte[(int) fileName.length()];
            new FileInputStream(fileName).read(data);
            for (int i = 0; i <data.length ; i++) {
                data[i]+= 10;
            }
            FileOutputStream outFile = new FileOutputStream(fileOutputName);
            outFile.write(data, 0, data.length);
            fileName.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void deshaffl (File fileName, File fileOutputName) throws IOException {//метод шифровки

        try {
            byte[] data = new byte[(int) fileName.length()];
            new FileInputStream(fileName).read(data);
            for (int i = 0; i <data.length ; i++) {
                data[i]-= 10;
            }
            FileOutputStream outFile = new FileOutputStream(fileOutputName);
            outFile.write(data, 0, data.length);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

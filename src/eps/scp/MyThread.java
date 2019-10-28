package eps.scp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyThread implements Runnable{
    int number;
    Thread thread;
    ArrayList<String> list;
    long files;

    MyThread(int number, ArrayList<String> list, long files ){
        thread = new Thread(this);
        this.number = number;
        this.list = list;
        this.files = files;
        System.out.println("Thread n"+number+" creado");
    }

    @Override
    public void run() {
        /*
        for (int i = 0; i < files; i++) {
            Iterator keyIterator = list.iterator();
            for (int f=1;f<=numberOfFiles;f++)
            {
                try {
                    File KeyFile = new File(outputDirectory + DIndexFilePrefix + String.format("%03d", f));
                    FileWriter fw = new FileWriter(KeyFile);
                    BufferedWriter bw = new BufferedWriter(fw);
                    // Calculamos el número de claves a guardar en este fichero.
                    keysByFile =  remainingKeys / remainingFiles;
                    remainingKeys -= keysByFile;
                    // Recorremos las claves correspondientes a este fichero.
                    while (keyIterator.hasNext() && keysByFile>0) {
                        key = (String) keyIterator.next();
                        SaveIndexKey(key,bw);  // Salvamos la clave al fichero.
                        keysByFile--;
                    }
                    bw.close(); // Cerramos el fichero.
                    remainingFiles--;
                } catch (IOException e) {
                    System.err.println("Error opening Index file " + outputDirectory + "/IndexFile" + f);
                    e.printStackTrace();
                    System.exit(-1);
                }
            }
        }*/
        System.out.println(Arrays.toString(this.list.toArray()));
    }
}

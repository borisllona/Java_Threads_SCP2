package eps.scp;

import static java.lang.Math.pow;

public class Indexing {

    public static void main(String[] args)
    {
        InvertedIndex hash;
        long startTime = System.nanoTime();

        if (args.length <2 || args.length>4)
            System.err.println("Erro in Parameters. Usage: Indexing <TextFile> [<Key_Size>] [<Index_Directory>]");
        if (args.length < 2)
            hash = new InvertedIndex(args[0]);
        else
            hash = new InvertedIndex(args[0], Integer.parseInt(args[1]));

        hash.BuildIndex();

        if (args.length > 2)
            hash.SaveIndex(args[2]);
        else
            hash.PrintIndex();
        long stopTime = System.nanoTime();
        System.out.println("Time: "+(stopTime - startTime)*pow(10,-9));
    }

}

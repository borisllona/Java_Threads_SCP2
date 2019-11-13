package eps.scp;

/**
 * Created by Nando on 8/10/19.
 */
public class Query
{

    public static void main(String[] args)
    {

        //sequential(args);
        concurrent(args);

    }

    private static void sequential(String[] args) {
        InvertedIndex hash;
        String queryString=null, indexDirectory=null, fileName=null;

        if (args.length <2 || args.length>4)
            System.err.println("Erro in Parameters. Usage: Query <String> <IndexDirectory> <filename> [<Key_Size>]");
        if (args.length > 0)
            queryString = args[0];
        if (args.length > 1)
            indexDirectory = args[1];
        if (args.length > 2)
            fileName = args[2];
        if (args.length > 3)
            hash = new InvertedIndex(Integer.parseInt(args[3]));
        else
            hash = new InvertedIndex();

        hash.LoadIndex(indexDirectory);
        hash.SetFileName(fileName);
        //hash.PrintIndex();
        hash.Query(queryString);
    }
    private static void concurrent(String[] args) {
        int numThreads = 0;
        InvertedIndex hash;
        String queryString=null, indexDirectory=null, fileName=null;

        if (args.length <3 || args.length>5)
            System.err.println("Erro in Parameters. Usage: Query <String> <IndexDirectory> <filename> <numThreads> [<Key_Size>]");
        if (args.length > 0)
            queryString = args[0];
        if (args.length > 1)
            indexDirectory = args[1];
        if (args.length > 2)
            fileName = args[2];
        if (args.length > 3)
            numThreads = Integer.parseInt(args[3]);
        if (args.length > 4)
            hash = new InvertedIndex(Integer.parseInt(args[4]));
        else
            hash = new InvertedIndex();
        System.out.println("NumThreads = " + numThreads);
        hash.LoadIndex(indexDirectory);
        hash.SetFileName(fileName);
        //hash.PrintIndex();
        hash.Query(queryString);
    }

}

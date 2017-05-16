package notebookExample;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by alekgurg on 09.05.2017.
 */
public abstract class Record {

    private static int recordCount;
    private int id;

    public Record() {
        recordCount++;
        id = recordCount;
    }

    public int getId() {
        return id;
    }


}

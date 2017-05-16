package notebookExample;

/**
 * Created by alekgurg on 11.05.2017.
 */
public class Note extends Record{

    private String note;

    @Override
    public String toString() {
        return "Note{" +
                "note='" + note + '\'' +
                '}';
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

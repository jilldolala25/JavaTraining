package tw.com.fcb.Notebook;

import com.opencsv.exceptions.CsvException;
import junit.framework.TestCase;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class NotebookServiceTest extends TestCase {
    ReadProductFromcCSV readFromCSV = new ReadProductFromcCSV();
    NotebookServiceImpl noteBookSvc = new NotebookServiceImpl(readFromCSV.readProductFromSCV());

    public NotebookServiceTest() throws IOException, CsvException {
    }


    public void testGetByBrand(){

        List<NoteBook> noteBooks = noteBookSvc.getByBrand("ASUS");

        assertEquals(2,noteBooks.size());
    }

    public void testAllProduct() {
        List<NoteBook> noteBooks = noteBookSvc.getAllproduct();
        assertEquals(14,noteBooks.size());
    }
}
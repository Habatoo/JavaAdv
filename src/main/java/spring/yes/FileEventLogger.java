package spring.yes;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {

    private String filename;
    private File file;


    public FileEventLogger(String filename) throws IOException {
        this.filename = filename;
    }

    public void init() throws IOException {
        this.file = new File(filename);
        if (this.file.exists() && !this.file.canWrite()) {
            throw new IllegalArgumentException("Can't write to file " + filename);
        } else if (!this.file.exists()) {
            this.file.createNewFile();
        }
    }

    @Override
    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file, event.toString() + "\n", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

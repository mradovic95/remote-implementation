package file;

import java.io.File;

/**
 * Implementation of {@link FileBasicOperation} interface. This implementation use dropbox as storage.
 */
public class FileBasicOperationRemoteImplementation implements FileBasicOperation {

    /**
     * Upload file to dropbox.
     *
     * @param file file which we want to upload
     * @param path path of the file on the storage
     */
    public void uploadFile(File file, String path) {
        //add implementation
    }

    /**
     * Download file from storagePath on dropbox to location specified with(path).
     *
     * @param path        where we want to upload file
     * @param storagePath where file is located
     */
    public void downlaodFile(String path, String storagePath) {
        //add implementation
    }

}

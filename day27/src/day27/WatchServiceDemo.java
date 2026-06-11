package day27;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class WatchServiceDemo {
    public static void main(String[] args)
            throws IOException, InterruptedException {
        Path path = Paths.get("TempPlayGround");
        if (Files.notExists(path)) {
            Files.createDirectory(path);
        }
        WatchService watchService = FileSystems.getDefault().newWatchService();

   path.register(
                watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY
        );
       while (true) {

            WatchKey key = watchService.take();

            for (WatchEvent<?> event :key.pollEvents()) {
                System.out.println(event.kind().name()+ " : "+ event.context() );
            }
            key.reset();
        }
    }
}

package day27;

import java.io.IOException;
import java.nio.file.*;
import java.util.Comparator;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;

public class NIOFileAPITest {

    private static final String HOME = System.getProperty("user.home");
    private static final String PLAY_WITH_NIO = "TempPlayGround";
    @Test
    public void givenPathWhenCheckedThenConfirm() throws IOException {   
        Path homePath = Paths.get(HOME);
        Assert.assertTrue(Files.exists(homePath));     
        Path playPath = Paths.get(HOME, PLAY_WITH_NIO);       
        if (Files.exists(playPath)) {
            Files.walk(playPath)
                    .sorted((p1, p2) -> p2.compareTo(p1))
                    .forEach(path -> {
                        try {
                            Files.delete(path);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        }
        Assert.assertTrue(Files.notExists(playPath));
        Files.createDirectory(playPath);
        Assert.assertTrue(Files.exists(playPath));
        IntStream.rangeClosed(1, 9)
                .forEach(i -> {
                    Path file = Paths.get(
                            HOME,
                            PLAY_WITH_NIO,
                            "temp" + i + ".txt");

                    try {
                        Files.createFile(file);
                        Assert.assertTrue(Files.exists(file));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        System.out.println("ALL FILES");
        Files.list(playPath)
                .filter(Files::isRegularFile)
                .forEach(System.out::println);
        System.out.println(" DIRECTORY CONTENTS ");
        Files.newDirectoryStream(playPath)
                .forEach(System.out::println);
        System.out.println(" TXT FILES");
        Files.newDirectoryStream(playPath, "*.txt")
                .forEach(System.out::println);
    }
}

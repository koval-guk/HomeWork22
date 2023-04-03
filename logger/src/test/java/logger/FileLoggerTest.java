package logger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FileLoggerTest {
    private FileLogger fileLoggerInfo;
    private FileLoggerConfiguration fileLoggerConfigurationInfo;

    @BeforeEach
    public void init() {
        fileLoggerConfigurationInfo = new FileLoggerConfiguration();
        fileLoggerConfigurationInfo.setLevel(LoggingLevel.INFO);
        fileLoggerInfo = new FileLogger(fileLoggerConfigurationInfo);
    }



    @Test
    @Disabled
    public void infoTrowFileMaxSizeReachedExceptionTest() {
        fileLoggerConfigurationInfo.setMaxSize(35);
        fileLoggerConfigurationInfo.setFileName("target/test");
        FileLogger fileLoggerException = new FileLogger(fileLoggerConfigurationInfo);
        fileLoggerException.tempFileSize = 0;
        fileLoggerException.info("test");
        Exception exception = Assertions.assertThrows(FileMaxSizeReachedException.class, ()->
        fileLoggerException.info("test"));
        System.out.println(exception.getMessage());
        Assertions.assertEquals("File target/test reached 33 byte and try to add 33 byte of 35 max",exception.getMessage());
    }

    public void debug() {

    }
}

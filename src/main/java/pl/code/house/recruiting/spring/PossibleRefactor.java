package pl.code.house.recruiting.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;

@RestController
@RequestMapping
public class PossibleRefactor {

    @GetMapping
    public byte[] getMovie(String filename) {

        InputStream fileStream = this.getClass().getResourceAsStream(filename);
//        IOUtils.read(fileStream)
        return null;

    }
}

package jp.javado.springboot;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ueno on 2017/04/17.
 */
@Service
public class SampleService implements ISampleService {

    @Override
    public String getSample(String id) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "spring");
        map.put("2", "boot");
        map.put("3", "di");
        return map.get(id);
    }
}

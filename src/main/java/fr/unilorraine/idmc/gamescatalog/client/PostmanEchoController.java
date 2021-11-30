package fr.unilorraine.idmc.gamescatalog.client;

import fr.unilorraine.idmc.gamescatalog.client.data.PostmanEchoJDK11Client;
import fr.unilorraine.idmc.gamescatalog.client.data.PostmanEchoFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("postman-echo")
@RequiredArgsConstructor
public class PostmanEchoController {
    private final PostmanEchoJDK11Client client;
    private final PostmanEchoFeignClient feignClient;

    @GetMapping("get")
    public String testGet() {
        return client.testGet();
    }

    @GetMapping("get/feign")
    public String testGetFeign() {
        return feignClient.testGet();
    }
}
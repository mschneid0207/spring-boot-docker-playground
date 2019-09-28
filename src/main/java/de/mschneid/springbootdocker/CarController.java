package de.mschneid.springbootdocker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@Slf4j
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/findCar")
    public Car findCarById(@RequestParam(required = false) String id) {
        log.debug("param id {}", id);
        return Car.builder().brand("BMW").model("520i").ps(190).build();
    }

    @GetMapping(value = "/csv-import")
    public void importCsvTestFile() throws IOException {
        carService.importTestCsv("csv/test.csv");
    }

}

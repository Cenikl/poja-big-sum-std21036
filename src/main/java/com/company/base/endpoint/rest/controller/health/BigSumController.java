package com.company.base.endpoint.rest.controller.health;

import com.company.base.PojaGenerated;
import com.company.base.repository.DummyRepository;
import com.company.base.repository.DummyUuidRepository;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;

@PojaGenerated
@RestController
@AllArgsConstructor
public class BigSumController {

    @GetMapping("/big-sum")
    public String calculateBigSum(
            @RequestParam(name = "a") String a,
            @RequestParam(name = "b") String b) {
        try {
            BigInteger operandA = new BigInteger(a);
            BigInteger operandB = new BigInteger(b);
            BigInteger result = operandA.add(operandB);

            return result.toString();
        } catch (NumberFormatException e) {
            return "Les paramètres doivent être des entiers valides.";
        }
    }
}

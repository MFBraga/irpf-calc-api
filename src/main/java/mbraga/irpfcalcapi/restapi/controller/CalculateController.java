package mbraga.irpfcalcapi.restapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mbraga.irpfcalcapi.core.IrpfCalculator;
import mbraga.irpfcalcapi.domain.Person;
import mbraga.irpfcalcapi.restapi.model.IrrfView;

@RestController
@RequestMapping("/irrf")
public class CalculateController {

    @PostMapping("/calculate")
    public IrrfView calculateIrpfToPerson(@RequestParam(required = true) int year, @RequestBody Person person) {
        var result = new IrrfView();
        
        result.setRate(new IrpfCalculator(year, person).calculateTaxLayer(new IrpfCalculator(year, person).calculateBaseSalary()));
        result.setIrrf(new IrpfCalculator(year, person).calculate());
                
        return result;
    }

}

package pl.nieweglowski.quotationapi_spring_security_test;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuotationsController {

    List<Quotation> quotations;

    QuotationsController(){
        quotations = new ArrayList<>();
        quotations.add(new Quotation("Andrzej Sapkowski", "Lepiej zaliczać się do niektórych, niż do wszystkich"));
        quotations.add(new Quotation("Paulo Coelho", "Kocha się za nic. Nie istnieje żaden powód do miłości"));
    }

    @GetMapping("/api")
    public List<Quotation> getQuotations(){
        return quotations;
    }

    @GetMapping("/api/add/{author}/{quotation}")
    public void addQuotation(@PathVariable String author, @PathVariable String quotation){
        quotations.add(new Quotation(author, quotation));
    }

    @GetMapping("/api/delete/{index}")
    public void deleteQutation(@PathVariable int index){
        quotations.remove(index);
    }
}

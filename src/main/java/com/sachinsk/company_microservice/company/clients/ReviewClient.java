package com.sachinsk.company_microservice.company.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "REVIEW-MICROSERVICE",
        url = "${review-microservice.url}")
public interface ReviewClient {

    @GetMapping("/reviews/averageRating")
    Double getAverageRatingForCompany(
            @RequestParam("companyId") Long companyId);

}

package com.elu.fruitsemailservice.controller;


import com.elu.fruitsemailservice.dto.FruitsDto;
import com.elu.fruitsemailservice.service.MailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * adskfjh.
 */
@RestController
@RequestMapping("/mail")
public class SentMailController {

    /**
     * THIS IS THE MAIL SERICE.
     */
    private final MailService mailService;

    /**
     * @param service
     */
    public SentMailController(final MailService service) {
        this.mailService = service;
    }

    /**
     * @return String.
     */
    @GetMapping("/test")
    public String test() {
        String test = "test";
        return test;
    }

    /**
     * @param fruitsDto
     * @return it returns the response entitiy.
     */
    @PostMapping("/sendMail")
    public ResponseEntity<String> sendMail(@RequestBody final
                                          FruitsDto fruitsDto) {

        try {
            System.out.println("fruitsDto:" + fruitsDto);
            mailService.sendMail(fruitsDto);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }

    }
}

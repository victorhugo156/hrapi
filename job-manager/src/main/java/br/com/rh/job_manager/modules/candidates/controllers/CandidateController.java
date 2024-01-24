package br.com.rh.job_manager.modules.candidates.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rh.job_manager.modules.candidates.CandidateEntity;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

      @PostMapping("/")
      public void create(@Valid @RequestBody CandidateEntity canditateEntity){

         System.out.println("Candidate: ");
         System.out.println(canditateEntity.getName());

      }
   
}
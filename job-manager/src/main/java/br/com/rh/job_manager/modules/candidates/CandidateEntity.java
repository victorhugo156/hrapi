package br.com.rh.job_manager.modules.candidates;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
public class CandidateEntity {

   private UUID id;

   @NotBlank
   private String name;

   @Pattern(regexp = "ˆ(?!\\s*$).+", message = "The field [username] is not valid")
   private String userName;

   @Email(message = "The field [email] is not a valid email") //This notation will validade a true email. You need to add the denpendency validation into the pom.xml
   private String email;

   @Length(min = 10, max = 100)
   private String password;
   private String description;
   private String resume;


}

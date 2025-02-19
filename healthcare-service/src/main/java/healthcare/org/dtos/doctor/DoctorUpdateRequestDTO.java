package healthcare.org.dtos.doctor;

import healthcare.org.ennumerations.GENDER;
import healthcare.org.ennumerations.INSTYPE;
import healthcare.org.entities.Role;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class DoctorUpdateRequestDTO {


    @NotBlank(message = "Phone is required")
    private String phone;



    @NotBlank(message = "Address is required")
    private String address;



    @NotNull(message = "Gender is required")
    private GENDER gender;

    @NotNull(message = "Date of birth is required")
    private Date dateOfBirth;



    @NotBlank(message = "Doctor specialization is required")
    private String doctorSpecialization;


}

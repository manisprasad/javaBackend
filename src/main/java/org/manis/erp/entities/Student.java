package org.manis.erp.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class Student extends User {
    private String fatherName;
    private String motherName;
    private String mobileNumber;
    private String aadharCard;
    private String gender;
    private String abcId;
    private String rollNumber; // Specific to students

    @DBRef
    private UniversityDetails universityDetails;


}

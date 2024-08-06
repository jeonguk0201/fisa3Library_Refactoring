package model.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userno;

	@NonNull
    private String uname;

	@NonNull
    private int age;

	@NonNull
    private String gender;
}

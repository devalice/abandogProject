package kr.co.abandog.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
	private String member_email;
	private String member_pw;
	private String member_name;
	private Integer member_age;
	private String member_gender;
	private String member_phone;
	private String member_address;
}

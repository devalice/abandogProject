package kr.co.abandog.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="member")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	
	@Id
	@Column(name="member_id", length=20)
	private String member_id;
	
	@Column(name="member_pw", length=20, nullable= false)
	private String member_pw;
	
	@Column(name="member_name", length=30)
	private String member_name;
	
	@Column(name="member_age")
	private Integer member_age;
	
	@Column(name="member_gender", length=1, columnDefinition = "char")
	private String member_gender;
	
	@Column(name="member_phone", length=11)
	private String member_phone;
	
	@Column(name="member_address", length=30)
	private String member_address;
	
	@Column(name="inst_dtm", nullable= false, columnDefinition = "datetime default CURRENT_TIMESTAMP")
	private Date inst_dtm;
	
	@Column(name="updt_dtm", columnDefinition = "datetime")
	private Date updt_dtm;
	
	@Column(name="del_dtm", columnDefinition = "datetime")
	private Date del_dtm;
	
	@Column(name="admin_yn", length=1, nullable= false, columnDefinition = "char")
	private String admin_yn;
	
	@Column(name="email", length=30, nullable= false)
	private String email;

}

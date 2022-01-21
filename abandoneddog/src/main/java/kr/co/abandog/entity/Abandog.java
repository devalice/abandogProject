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
@Table(name="abandog")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Abandog extends BaseEntity{
	
	@Id
	@Column(name="abandog_id", length=30)
	private String abandog_id;
	
	@Column(name="abandog_name", length=30, nullable= false)
	private String abandog_name;
	
	@Column(name="abandog_age")
	private Integer abandog_age;
	
	@Column(name="aban_dog_gender", length=1, columnDefinition = "char")
	private String aban_dog_gender;
	
	@Column(name="abandog_date", length=11)
	private String abandog_date;
	
	@Column(name="abandog_location", length=50)
	private String abandog_location;
	
	@Column(name="abandog_guardian", length=30)
	private String abandog_guardian;
	
	@Column(name="abandog_image", length=200)
	private String abandog_image;
	
	@Column(name="member_id", length=20)
	private String member_id;
	
	@Column(name="state_cd", length=1, columnDefinition = "char")
	private String state_cd;
	
	@Column(name="type_cd", length=1, columnDefinition = "char")
	private String type_cd;
}
